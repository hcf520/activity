package com.hcf.activity;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;

@EnableTransactionManagement
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
//@MapperScan(basePackages = "com.hcf.activity.mapper") //扫描自定义的Mapper接口，并注入对应的SqlSession实例 (mybatis-plus配置里已有)
public class ActivityDemoApplication {

	 private static ApplicationContext ctx;
	 
	public static void main(String[] args) {
		ctx = SpringApplication.run(ActivityDemoApplication.class, args);
		
		try {
            String host = InetAddress.getLocalHost().getHostAddress();
            TomcatServletWebServerFactory tomcatServletWebServerFactory= (TomcatServletWebServerFactory) ctx.getBean("tomcatServletWebServerFactory");
            int port = tomcatServletWebServerFactory.getPort();
            String contextPath = tomcatServletWebServerFactory.getContextPath();
            System.out.println("http://"+host+":"+port+contextPath+"/");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
	}

}
