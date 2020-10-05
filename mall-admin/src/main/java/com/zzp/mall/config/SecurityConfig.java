package com.zzp.mall.config;

import com.zzp.mall.bo.AdminUserDetails;
import com.zzp.mall.model.UmsAdmin;
import com.zzp.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * SpringSecurity的配置
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private UmsAdminService adminService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests() //配置权限
//                .antMatchers("/").access("hasRole('TEST')")
//                .antMatchers("/brand/list").authenticated()
//                .antMatchers("/brand/list").hasAuthority("TEST")
                .antMatchers("/**").permitAll()
                .and()
                .httpBasic()
                .realmName("/")
                .and() //配置登录界面
                .formLogin()
                .loginPage("/login")
                .failureUrl("/login?error=true")
                .and()
                .logout()
                .logoutSuccessUrl("/")
//                .and() // 记住密码功能
//                .rememberMe()
//                .tokenValiditySeconds(60 * 60 * 24)
//                .key("rememberMeKey")
                .and()
                .csrf()
                .disable();

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService()).passwordEncoder(new Md5PasswordEncoder());
    }

    @Bean
    public UserDetailsService userDetailsService() {
        // 获取登录用户信息
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                UmsAdmin admin = adminService.getAdminByUsername(username);
                if (admin != null) {
                    return new AdminUserDetails(admin);
                }
                throw new UsernameNotFoundException("用户名或密码错误");
            }
        };
    }
}
