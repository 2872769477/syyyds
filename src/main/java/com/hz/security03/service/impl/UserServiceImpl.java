package com.hz.security03.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //1.根据username查询数据库

        System.out.println("执行自定义逻辑方法");
        if (!"admin".equals(username)){
            throw new UsernameNotFoundException("用户名或密码错误!");
        }

        //2.根据查询的对象比较密码
        String password = passwordEncoder.encode("123456");
        return new User("admin",password,AuthorityUtils
                .commaSeparatedStringToAuthorityList("admin,normal,ROLE_abc,/index.html,/insert"));
    }
}