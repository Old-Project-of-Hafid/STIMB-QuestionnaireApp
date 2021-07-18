package com.stimb.quisioneradmin.web;

import com.stimb.quisioneradmin.ReleaseClass.*;
import com.stimb.quisioneradmin.entity.stimb2.KartuRencanaStudi;
import com.stimb.quisioneradmin.entity.stimb2.MasterMahasiswa;
import com.stimb.quisioneradmin.entity.stimb2.Quisioner;
import com.stimb.quisioneradmin.repository.*;
import de.agilecoders.wicket.core.markup.html.bootstrap.button.Buttons;
import de.agilecoders.wicket.extensions.markup.html.bootstrap.ladda.LaddaAjaxButton;
import org.apache.wicket.Application;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.*;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.wicketstuff.annotation.mount.MountPath;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Yusfia Hafid A on 1/3/2016.
 */

@MountPath("aktivasi")
public class QuisionerPage extends PubLayout {
    private static final Logger log = LoggerFactory.getLogger(QuisionerPage.class);
    @Inject
    public Environment env;
    @Inject
    StudentRepository studentService;
    @Inject
    KartuRencanaStudiRepository kartuRencanaStudiRepository;
    @Inject
    ReffTahunAjaranRepository reffTahunAjaranRepository;
    @Inject
    ListKalenderAkademikRepository listKalenderAkademikRepository;
    @Inject
    ListDosenKelasRepository listDosenKelasRepository;
    @Inject
    ListJadwalPerkuliahanRepository listJadwalPerkuliahanRepository;
    @Inject
    QuisionerRepository quisionerRepository;
    @Inject
    QuisionerLogRepository quisionerLogRepository;

    private MasterMahasiswa masterMahasiswa;
    private KartuRencanaStudi kartuRencanaStudi;
    List<ReleaseKrs> releaseKrses = new ArrayList<ReleaseKrs>();
    List<ReleaseKhs> releaseKhses = new ArrayList<ReleaseKhs>();
    List<ReleaseListAktifitasPerkuliahan> releaseListAktifitasPerkuliahans = new ArrayList<>();
    List<ReleaseKalenderAkademik> releaseKalenderAkademiks = new ArrayList<>();
    List<ReleaseQuisionerLog> releaseQuisionerLogs = new ArrayList<>();

    ReleaseKrs selected;

    public QuisionerPage(PageParameters parameters) {
        super(parameters);
        final Form<Void> form = new Form<Void>("form");
        //------------TABEL QUISIONER---------------------------------------------------
        ListDataProvider<Quisioner> releaseQuisionerListDataProvider = new ListDataProvider<Quisioner>() {
            @Override
            protected List<Quisioner> getData() {
                return quisionerRepository.findAll();
            }
        };

        DataView<Quisioner> dataViewQuisioner = new DataView<Quisioner>("datarow", releaseQuisionerListDataProvider) {
            private int i = 0;

            @Override
            protected void populateItem(Item<Quisioner> item) {
                i++;
                Quisioner rks = item.getModelObject();
                item.add(new Label("no", i));
                TextArea<String> question = new TextArea<String>("question", Model.of(rks.getPertanyaan()));
                question.add(new AjaxFormComponentUpdatingBehavior("onchange") {
                    @Override
                    protected void onUpdate(AjaxRequestTarget ajaxRequestTarget) {
                        rks.setPertanyaan(question.getModelObject());
                        quisionerRepository.save(rks);
                    }
                });
                TextArea<String> ket = new TextArea<String>("ket", Model.of(rks.getKeterangan()));
                ket.add(new AjaxFormComponentUpdatingBehavior("onchange") {
                    @Override
                    protected void onUpdate(AjaxRequestTarget ajaxRequestTarget) {
                        rks.setKeterangan(ket.getModelObject());
                        quisionerRepository.save(rks);
                    }
                });
                item.add(ket);
                item.add(question);
                CheckBox checkBox = new CheckBox("check", Model.of(rks.isAktifasi()));
                checkBox.add(new AjaxEventBehavior("click") {
                    @Override
                    protected void onEvent(final AjaxRequestTarget target) {
                        log.info("{}", !checkBox.getModelObject());
                        rks.setAktifasi(!checkBox.getModelObject());
                        quisionerRepository.save(rks);
                    }
                });
                item.add(checkBox);
            }
        };
        dataViewQuisioner.setOutputMarkupId(true);
        final WebMarkupContainer wmcQuisioner = new WebMarkupContainer("containerid");
        wmcQuisioner.add(dataViewQuisioner);
        wmcQuisioner.setOutputMarkupId(true);
        form.add(wmcQuisioner);
        add(form);
    }

    @Override
    protected void onConfigure() {
        super.onConfigure();
        AuthenticatedWebApplication app = (AuthenticatedWebApplication) Application.get();
        //if user is not signed in, redirect him to sign in page
        if(!AuthenticatedWebSession.get().isSignedIn())
            app.restartResponseAtSignInPage();
    }

    @Override
    public IModel<String> getTitleModel() {
        return new Model<>("Sekolah Tinggi Musik Bandung");
    }

    @Override
    public IModel<String> getMetaDescriptionModel() {
        return new Model<>("Sekolah Tinggi Musik Bandung");
    }

}
