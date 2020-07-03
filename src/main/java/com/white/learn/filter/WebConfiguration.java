package com.white.learn.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfiguration {
	@Bean
	public FilterRegistrationBean userFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new UserFilter());
		registration.addUrlPatterns("/user/*");
		registration.setName("user filter");
		return registration;
	}
}
