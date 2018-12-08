//package com.billwang2001.security;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .withUser("admin").password(encoder().encode("adminPass")).roles("ADMIN")
//                .and()
//                .withUser("user").password(encoder().encode("userPass")).roles("USER")
//                .and()
//                .passwordEncoder(encoder());
//    }
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/api/v1/contact-form").authenticated()
//                .and()
//                .formLogin()
//                .loginProcessingUrl("/api/v1/login");
//    }
//
//    @Bean
//    public PasswordEncoder encoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
