package com.springsecurity.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class projectSecurityConfig {
    //match the path which should secure and not
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests()
                .antMatchers("/api/v1/account/my-account","/api/v1/loan/my-loan").authenticated()
                .antMatchers("/api/v1/notice/my-notice").permitAll()
                .and().formLogin().and().httpBasic();

        return http.build();
    }
}
