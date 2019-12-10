package com.hcf.activity.config.mvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MvcConfigure extends WebMvcConfigurationSupport {


	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/statics/**").addResourceLocations("classpath:/statics/");// 静态资源路径css,js,img等
		registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");// 视图
		registry.addResourceHandler("/mapper/**").addResourceLocations("classpath:/mapper/");// mapper.xml
		super.addResourceHandlers(registry);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")// 配置允许跨域的路径
				.allowedOrigins("*")// 配置允许访问的跨域资源的请求域名
				.allowedMethods("PUT,POST,GET,DELETE,OPTIONS")// 配置允许访问该跨域资源服务器的请求方法，如：POST、GET、PUT、DELETE等
				.allowedHeaders("*"); // 配置允许请求header的访问，如 ：X-TOKEN
		super.addCorsMappings(registry);
	}

	//
	// public void addFormatters(FormatterRegistry registry) {
	// registry.addFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
	// }
	//
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("/index");// 默认视图跳转
		registry.addViewController("/index").setViewName("/index");
		registry.addViewController("/article").setViewName("/article");
		registry.addViewController("/error/404").setViewName("/error/404");
		registry.addViewController("/error/500").setViewName("/error/500");
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
		super.addViewControllers(registry);
	}

}
