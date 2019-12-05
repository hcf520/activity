package com.hcf.activity.config.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MvcConfigure  extends WebMvcConfigurationSupport {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/static/");// 静态资源路径																					// css,js,img等
		registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");// 视图
		registry.addResourceHandler("/mapper/**").addResourceLocations("classpath:/mapper/");// mapper.xml
		super.addResourceHandlers(registry);
	}

//	public void addCorsMappings(CorsRegistry registry) {
//		// 匹配所有的URI，允许所有的外域发起跨域请求，允许外域发起请求POST/GET，允许跨域请求包含任意的头信息。
//		registry.addMapping("/**").allowedOrigins("*").allowedMethods("POST", "GET").allowedHeaders("*")
//				.allowCredentials(true);
//	}
//
//	public void addFormatters(FormatterRegistry registry) {
//		registry.addFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
//	}
//
//	public void addViewControllers(ViewControllerRegistry registry) {
//		// 将/index重定向到/index.html
//		registry.addRedirectViewController("/index", "/index.html");
//	}
}
