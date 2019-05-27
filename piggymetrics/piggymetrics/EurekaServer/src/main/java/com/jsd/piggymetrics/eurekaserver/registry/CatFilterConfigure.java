package com.jsd.piggymetrics.eurekaserver.registry;

import com.jsd.piggymetrics.eurekaserver.cathelper.CatServletFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatFilterConfigure {
    @Bean
    public FilterRegistrationBean catFilter(){
        FilterRegistrationBean registrationBean=new FilterRegistrationBean();
        CatServletFilter filter=new CatServletFilter();
         registrationBean.setFilter(filter);
         registrationBean.addUrlPatterns("/*");
         registrationBean.setName("cat-filter");
         registrationBean.setOrder(1);
         return registrationBean;
    }
}
