package com.hz.security03.config;

import com.hz.security03.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /* @Autowired
     private MyAccessDeniedHandler myAccessDeniedHandler;
 */
    @Autowired
    private UserServiceImpl userServiceImpl;

    @Autowired
    private DataSource dataSource;
    @Autowired
    private PersistentTokenRepository persistentTokenRepository;


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //自定义登录界面
        http.formLogin()
                .loginPage("/login.html")
                //自定义登录逻辑
                .loginProcessingUrl("/login")
                //登录成功跳转页面,必须是Post方式
                /*  .successForwardUrl("/toMain")*/

                .successForwardUrl("/toMain")
                //自定义成功跳转逻辑 重定向
                /*   .successHandler(new MyAuthenticationSuccessHandler("/index.html"))*/
                //登录失败跳转页面,必须是Post方式
                /* .failureForwardUrl("/toError")*/

                //自定义失败跳转逻辑 重定向
                .failureHandler(new MyAuthenticationFailureHandler("http://www.bilibili.com"))
                //自定义登录用户名参数
                .usernameParameter("username123")
                //自定义登录密码参数
                .passwordParameter("password123");


        //授权
        http.authorizeRequests()
                //放行登录界面
                .antMatchers("/login.html").access("permitAll()")
                //放行失败界面
                .antMatchers("/error.html").permitAll()
                /*  .antMatchers("/image/**").permitAll()*/
//                .antMatchers("/**/*.jpg").permitAll()

                //正则表达式
                .regexMatchers(".+[.]jpg").permitAll()
                /*.mvcMatchers("/image/**").servletPath("/xxxx").permitAll()*/

                //根据权限匹配,严格区分大小写
                /*     .antMatchers("/main.html").hasAuthority("admin")

                     //多匹配匹配一个即可访问
                     .antMatchers("/main.html").hasAnyAuthority("adMin","admin")*/

                .antMatchers("/index.html").hasAuthority("admin")

                .antMatchers("/index.html").hasRole("abc");
        //根据角色匹配 不能以ROLE_开头 严格区分大小写
                /*.antMatchers("/main.html").hasRole("abc")
                .antMatchers("/main.html").hasAnyRole("abC","abc")*/

        //根据Ip访问
//                .antMatchers("/main.html").hasIpAddress("127.0.0.1")
        //所有请求都必须被认证
        /* .anyRequest().authenticated();*/



        /*.anyRequest().access("@MyServiceImpl.hasPermission(request,authentication)");//自定义登录权限*/


        //异常处理
        http.exceptionHandling()
                .accessDeniedHandler(new MyAccessDeniedHandler());

        //记住我
        http.rememberMe()
                //自定义参数
//                .rememberMeParameter()
                //自定义失效时间,默认两周
//                .tokenValiditySeconds()
                //自定义功能实现逻辑
//                .rememberMeServices()
                //自定义登陆逻辑
                .userDetailsService(userServiceImpl)
                //指定存储位置
                .tokenRepository(persistentTokenRepository);


        http.logout()
                //退出登录
                .logoutUrl("/showLogin")
                //退出登录成功跳转页面
                .logoutSuccessUrl("/login.html");


        //关闭csrf防护
        http.csrf().disable();
    }


    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public PersistentTokenRepository persistentTokenRepository(){
        JdbcTokenRepositoryImpl jdbcTokenRepository = new JdbcTokenRepositoryImpl();
        //设置数据源
        jdbcTokenRepository.setDataSource(dataSource);
        //启动时是否创建表,第一次要之后注释掉
//        jdbcTokenRepository.setCreateTableOnStartup(true);
        return jdbcTokenRepository;
    }
}
