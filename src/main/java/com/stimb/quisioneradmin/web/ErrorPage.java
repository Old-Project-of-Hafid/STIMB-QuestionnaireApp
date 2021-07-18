package com.stimb.quisioneradmin.web;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.cycle.RequestCycle;
import org.apache.wicket.request.flow.RedirectToUrlException;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.DynamicImageResource;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.wicketstuff.annotation.mount.MountPath;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Yusfia Hafid A on 1/10/2016.
 */
@MountPath("error")
public class ErrorPage extends PubLayout {
    private static final Logger log = LoggerFactory.getLogger(HomePage.class);

    public ErrorPage(PageParameters parameters) {
        super(parameters);
        final Form<Void> form = new Form<Void>("form");
        form.add(new Label("404", "Page Not Found!"));
        add(form);
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