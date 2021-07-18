package com.stimb.quisioneradmin.SessionRelated;

import com.stimb.quisioneradmin.entity.account.User;
import com.stimb.quisioneradmin.repository.UserRepository;
import com.stimb.quisioneradmin.web.MyWebApplication;
import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.request.Request;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.inject.Inject;
import javax.management.relation.Role;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Yusfia Hafid A on 1/9/2016.
 */

public class BasicAuthenticationSession extends AuthenticatedWebSession {
    private static final Logger log = LoggerFactory.getLogger(BasicAuthenticationSession.class);

    private HttpSession httpSession;
    //@SpringBean(name = "authenticationManager")
    //private AuthenticationManager authenticationManager;

    @Inject
    private UserRepository userRepository;
    private User user;

    public BasicAuthenticationSession(Request request) {
        super(request);
        //Injector.get().inject(this);
    }

    @Override
    public boolean authenticate(String username, String password) {
        Injector.get().inject(this);
        user = userRepository.findByUserNameandId(username,md5.encrypt(password));
        return user!=null;
    }

    @Override
    public Roles getRoles() {
        Roles roles = new Roles();
        if (isSignedIn()) {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            addRolesFromAuthentication(roles, authentication);
        }
        return roles;
    }

    private void addRolesFromAuthentication(Roles roles, Authentication authentication) {
        for (GrantedAuthority authority : authentication.getAuthorities()) {
            roles.add(authority.getAuthority());
        }
    }

    public boolean hasRole(Role role) {
        return getRoles().hasRole(role.getRoleName());
    }

    public String getUsername(){
        return user.getUsername();
    }

}