package com.stimb.quisioneradmin.web;

import com.stimb.quisioneradmin.ReleaseClass.*;
import com.stimb.quisioneradmin.ReportGenerator.ReportGenerator;
import com.stimb.quisioneradmin.entity.stimb2.*;
import com.stimb.quisioneradmin.repository.*;
import de.agilecoders.wicket.core.markup.html.bootstrap.button.Buttons;
import de.agilecoders.wicket.extensions.markup.html.bootstrap.ladda.LaddaAjaxButton;
import org.apache.wicket.Application;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.ajax.markup.html.navigation.paging.AjaxPagingNavigator;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.*;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.handler.resource.ResourceStreamRequestHandler;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.ContentDisposition;
import org.apache.wicket.util.file.File;
import org.apache.wicket.util.resource.AbstractResourceStream;
import org.apache.wicket.util.resource.FileResourceStream;
import org.apache.wicket.util.resource.IResourceStream;
import org.apache.wicket.util.resource.ResourceStreamNotFoundException;
import org.apache.wicket.util.time.Duration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.wicketstuff.annotation.mount.MountPath;

import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Yusfia Hafid A on 1/3/2016.
 */
@MountPath("summary")
public class SummaryReportPage extends PubLayout {
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

    public int num = 0;
    private MasterMahasiswa masterMahasiswa;
    private KartuRencanaStudi kartuRencanaStudi;
    List<ReleaseKrs> releaseKrses = new ArrayList<ReleaseKrs>();
    List<ReleaseKhs> releaseKhses = new ArrayList<ReleaseKhs>();
    List<ReleaseListAktifitasPerkuliahan> releaseListAktifitasPerkuliahans = new ArrayList<>();
    List<ReleaseKalenderAkademik> releaseKalenderAkademiks = new ArrayList<>();
    List<ReleaseQuisionerLog> releaseQuisionerLogs = new ArrayList<>();

    ReleaseKrs selected;

    public SummaryReportPage(PageParameters parameters) {
        super(parameters);
        final Form<Void> form = new Form<Void>("form");
        final TextField<String> matakuliahsearch = new TextField<String>("matakuliahsearch", Model.of(""));
        form.add(matakuliahsearch);

        //-------------------TABEL KRS-----------------------------------------------------------
        /**/
        ListDataProvider<ReleaseKrs> releaseKrsDataProvider = new ListDataProvider<ReleaseKrs>() {
            @Override
            protected List<ReleaseKrs> getData() {
                return releaseKrses;
            }
        };

        DataView<ReleaseKrs> dataView = new DataView<ReleaseKrs>("rowsKrs", releaseKrsDataProvider, 10) {
            @Override
            protected void populateItem(Item<ReleaseKrs> item) {
                ReleaseKrs rks = item.getModelObject();
                RepeatingView repeatingView = new RepeatingView("dataRowKrs");
                num++;
                repeatingView.add(new Label(repeatingView.newChildId(), num));
                log.info("{}",rks.getIdKrs());
                repeatingView.add(new Label(repeatingView.newChildId(), rks.getKodeMataKuliah()));
                repeatingView.add(new Label(repeatingView.newChildId(), rks.getNamaMataKuliah()+" "+rks.getInstrumenMayor()));
                repeatingView.add(new Label(repeatingView.newChildId(), rks.getSksMataKuliah()));
                repeatingView.add(new Label(repeatingView.newChildId(), rks.getTahunAjaran()));
                repeatingView.add(new Label(repeatingView.newChildId(), rks.getSemester()));
                repeatingView.add(new Label(repeatingView.newChildId(), rks.getNamaDosen()));
                repeatingView.add(new Label(repeatingView.newChildId(), rks.getJadwalkuliah()).setEscapeModelStrings(false));
                item.add(repeatingView);
                //item.add(new LaddaAjaxButton("cetak", new Model<String>("cetak"), Buttons.Type.Default) {
                item.add(new Link<Void>("cetak"){
                    @Override
                    public void onClick() {
                        //super.onSubmit(target, form);
                        String filename = "AVE_"+rks.getKodeMataKuliah()+"_"+rks.getNamaMataKuliah()+"_"+rks.getNamaDosenRaw()+"_"+rks.getIdKelas();
                        ReportGenerator reportGenerator = new ReportGenerator();
                        reportGenerator.PrintPDFSummary(rks.getIdKelas(),filename);
                        final ByteArrayInputStream stream = new ByteArrayInputStream(reportGenerator.getFilePDF());
                        IResourceStream resourceStream = new AbstractResourceStream() {
                            private static final long serialVersionUID = 1L;

                            @Override
                            public InputStream getInputStream() throws ResourceStreamNotFoundException {
                                return stream;
                            }

                            @Override
                            public void close() throws IOException {
                                stream.close();
                            }

                            @Override
                            public String getContentType() {
                                return "application/pdf";
                            }

                        };

                        getRequestCycle().scheduleRequestHandlerAfterCurrent(
                                new ResourceStreamRequestHandler(resourceStream)
                                        .setFileName(reportGenerator.getPdfFileName())
                                        .setContentDisposition(ContentDisposition.ATTACHMENT)
                                        .setCacheDuration(Duration.ONE_SECOND)
                        );

                    }
                });
            }
        };
        dataView.setItemsPerPage(10);
        dataView.setOutputMarkupId(true);
        AjaxPagingNavigator pagination = new AjaxPagingNavigator("pagingNavigator", dataView);
        pagination.setOutputMarkupId(true);
        final WebMarkupContainer wmc = new WebMarkupContainer("containerid");
        wmc.add(dataView);
        wmc.add(pagination);
        wmc.setOutputMarkupId(true);
        form.add(wmc);

        form.add(new LaddaAjaxButton("klik", new Model<String>("Cari"), Buttons.Type.Default) {
            @Override
            protected void onSubmit(AjaxRequestTarget target, Form<?> form) {
                super.onSubmit(target, form);
                releaseKrses.clear();
                num = 0;
                List<KartuRencanaStudi> krs = kartuRencanaStudiRepository.findByNamaKuliahGroup(matakuliahsearch.getModelObject());
                for (int i = 0; i < krs.size(); i++) {
                    ListDosenKelas ldk = listDosenKelasRepository.findByKelasId(krs.get(i).getKelasPerkuliahan().getId());
                    List<ListJadwalPerkuliahan> listJadwalPerkuliahans = listJadwalPerkuliahanRepository.findByKelasId(krs.get(i).getKelasPerkuliahan().getId());
                    ReleaseKrs releaseKrs = new ReleaseKrs(krs.get(i),ldk,listJadwalPerkuliahans);
                    releaseKrses.add(releaseKrs);
                    log.info("{} {} {}",releaseKrs.getNamaMataKuliah(),releaseKrs.getKodeMataKuliah(),releaseKrs.getNamaDosen());
                }
                target.add(wmc);
            }
        });
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
