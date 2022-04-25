package com.hz.security03.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface MyService {
    //判断是否有权限
   public boolean hasPermission(HttpServletRequest request, Authentication
           authentication);
}