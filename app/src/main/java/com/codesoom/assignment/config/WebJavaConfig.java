package com.codesoom.assignment.config;

import com.codesoom.assignment.interceptors.AuthenticationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebJavaConfig implements WebMvcConfigurer {
    @Autowired
    private AuthenticationInterceptor authenticationInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // SpringSecurity Filter 추가로 인해 주석 처리
//        registry.addInterceptor(authenticationInterceptor);
    }
}
