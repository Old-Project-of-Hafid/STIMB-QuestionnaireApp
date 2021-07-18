package com.stimb.quisioneradmin.web;

import de.agilecoders.wicket.core.markup.html.bootstrap.common.NotificationPanel;
import de.agilecoders.wicket.core.markup.html.bootstrap.html.MetaTag;
import de.agilecoders.wicket.extensions.markup.html.bootstrap.icon.FontAwesomeCssReference;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.core.request.mapper.MountedMapper;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.springframework.core.env.Environment;

import javax.inject.Inject;
import java.io.Serializable;

public abstract class PubLayout extends WebPage {

    protected NotificationPanel notificationPanel;

    public abstract IModel<String> getTitleModel();

    public abstract IModel<String> getMetaDescriptionModel();


    @Inject
    protected Environment env;

    public PubLayout(PageParameters parameters) {
        super(parameters);
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();

        add(new Label("title", getTitleModel()));
        add(new MetaTag("metaDescription", new Model<>("description"), getMetaDescriptionModel()));
        add(new BookmarkablePageLink<>("selectReportPageLink", SelectReportPage.class));
        add(new BookmarkablePageLink<>("summaryReportPageLink", SummaryReportPage.class));
        add(new BookmarkablePageLink<>("quisionerPageLink", QuisionerPage.class));
        AjaxLink logout = new AjaxLink("logout"){
            @Override
            public void onClick(AjaxRequestTarget ajaxRequestTarget) {
                AuthenticatedWebSession.get().invalidate();
                setResponsePage(getApplication().getHomePage());
            }

            @Override
            public boolean isVisible() {
                return AuthenticatedWebSession.get().isSignedIn();
            }
        };
        add(logout);
        //       add(new BookmarkablePageLink<>("histogramLink", HistogramPage.class));
//        add(new BookmarkablePageLink<>("roadsLink", RoadListPage.class,
//                new PageParameters().set(SeoBookmarkableMapper.LOCALE_PREF_ID_PARAMETER, localePrefId)));
//        add(new BookmarkablePageLink<>("camerasLink", CameraListPage.class,
//                new PageParameters().set(SeoBookmarkableMapper.LOCALE_PREF_ID_PARAMETER, localePrefId)));
//
//        add(new BookmarkablePageLink<>("tweetListLink", TweetListPage.class,
//                new PageParameters().set(SeoBookmarkableMapper.LOCALE_PREF_ID_PARAMETER, localePrefId)));
//        add(new BookmarkablePageLink<>("tweetMapLink", TweetMapPage.class,
//                new PageParameters().set(SeoBookmarkableMapper.LOCALE_PREF_ID_PARAMETER, localePrefId)));
        notificationPanel = new NotificationPanel("notificationPanel");
        notificationPanel.setOutputMarkupId(true);
        add(notificationPanel);
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);
        response.render(CssHeaderItem.forReference(FontAwesomeCssReference.instance()));
    }

}
