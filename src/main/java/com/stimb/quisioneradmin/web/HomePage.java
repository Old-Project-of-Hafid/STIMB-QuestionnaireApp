package com.stimb.quisioneradmin.web;

import com.stimb.quisioneradmin.SessionRelated.BasicAuthenticationSession;
import de.agilecoders.wicket.core.markup.html.bootstrap.button.Buttons;
import de.agilecoders.wicket.extensions.markup.html.bootstrap.ladda.LaddaAjaxButton;
import org.apache.wicket.Application;
import org.apache.wicket.Session;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.form.AjaxButton;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.image.Image;
import org.apache.wicket.model.AbstractReadOnlyModel;
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

@MountPath("home")
public class HomePage extends PubLayout {
    private static final Logger log = LoggerFactory.getLogger(HomePage.class);
    final TextField<String> userName;
    final PasswordTextField passwordTextField;

    public HomePage(PageParameters parameters) {
        super(parameters);
        final Form<Void> form = new Form<Void>("form");
        Image res = new Image("opening", new DynamicImageResource("image/png") {
            @Override
            protected byte[] getImageData(Attributes attributes) {
                return getInput();
            }
        });

        userName = new TextField<String>("inputusername", Model.of(""));

        final Label welcome = new Label("uname", new AbstractReadOnlyModel<String>() {
            @Override
            public String getObject() {
                AuthenticatedWebSession session = AuthenticatedWebSession.get();
                if(session.isSignedIn()){
                    return "Status : "+((BasicAuthenticationSession)session).getUsername()+" Signed In";
                }else {
                    return "";
                }
            }
        });
        welcome.setOutputMarkupId(true);
        form.add(welcome);

        passwordTextField = new PasswordTextField("inputpassword", Model.of(""));

        LaddaAjaxButton buttonSign = new LaddaAjaxButton("signin",new Model<String>("SignIn"), Buttons.Type.Default) {
            @Override
            public void onSubmit(AjaxRequestTarget target, Form<?> form) {
                super.onSubmit(target,form);
                HttpServletRequest servletRequest = (HttpServletRequest) RequestCycle.get().getRequest().getContainerRequest();
                String originalUrl = getOriginalUrl(servletRequest.getSession());
                AuthenticatedWebSession session = AuthenticatedWebSession.get();
                if (session.signIn(userName.getModelObject(), passwordTextField.getModelObject())) {
                    if (originalUrl != null) {
                        log.info(String.format("redirecting to %s", originalUrl));
                        throw new RedirectToUrlException(originalUrl);
                    } else {
                        log.info("redirecting to home page");
                        setResponsePage(getApplication().getHomePage());
                    }
                } else {
                    target.appendJavaScript("alert('Kesalahan Username/Password. Silahkan coba lagi!');");
                    error("Login failed due to invalid credentials");
                }
                target.add(welcome);
            }
        };
        WebMarkupContainer wmlogin = new WebMarkupContainer("containerlogin"){
            @Override
            public boolean isVisible() {
                return !AuthenticatedWebSession.get().isSignedIn();
            }
        };
        wmlogin.add(res);
        wmlogin.add(userName);
        wmlogin.add(passwordTextField);
        wmlogin.add(buttonSign);
        wmlogin.setOutputMarkupId(true);
        form.add(wmlogin);

        Image change = new Image("openingchange", new DynamicImageResource("image/png") {
            @Override
            protected byte[] getImageData(Attributes attributes) {
                return getInput();
            }
        });

        WebMarkupContainer wmchange = new WebMarkupContainer("containerchange"){
            @Override
            public boolean isVisible() {
                return AuthenticatedWebSession.get().isSignedIn();
            }
        };
        wmchange.add(change);
        wmchange.setOutputMarkupId(true);
        form.add(wmchange);
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

    public byte[] getInput() {
        Mat image = Highgui.imread("STiMB-logo.jpg");
        MatOfByte result = new MatOfByte();
        Highgui.imencode(".png", image, result);
        byte[] nil = result.toArray();
        return nil;
    }

    private String getOriginalUrl(HttpSession session) {
        // TODO: The following session attribute seems to be null the very first time a user accesses a secured page. Find out why
        // spring security doesn't set this parameter the very first time.
        SavedRequest savedRequest = (SavedRequest) session.getAttribute("SPRING_SECURITY_SAVED_REQUEST");
        if (savedRequest != null) {
            return savedRequest.getRedirectUrl();
        } else {
            return null;
        }
    }
}
