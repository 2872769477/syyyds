package com.hz.security03.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {


    private final String url;

    public MyAuthenticationSuccessHandler(String url) {
        this.url =url;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
     /*   System.out.println(authentication.getCredentials());
        System.out.println(authentication.getDetails());
        System.out.println(authentication.getAuthorities());
        System.out.println(authentication.getPrincipal());*/

        WebAuthenticationDetails details =(WebAuthenticationDetails) authentication.getDetails();
        System.out.println(details.getRemoteAddress());
        httpServletResponse.sendRedirect(url);
    }
}
