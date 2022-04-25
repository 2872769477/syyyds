package com.hz.security03.service.impl;

import com.hz.security03.service.MyService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@Component
public class MyServiceImpl implements MyService {

    @Override
    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        String uri = request.getRequestURI();//获得当前登录的url
        Object principal = authentication.getPrincipal();//判断当前登录的url有没有权限
        if(principal instanceof UserDetails){
            UserDetails userDetails =(UserDetails) principal;
            Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();//拿到权限

            return authorities.contains(new
                    SimpleGrantedAuthority(uri));
        }
        return false;
    }
}
