package com.hcf.activity;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivityDemoApplicationTests {


	ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
	
	@Test
	public void contextLoads() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Deployment deployment = processEngine.getRepositoryService()//与流程定义和部署对象相关的Service
				.createDeployment()//创建一个部署对象
				.name("helloworld")//添加部署的名称
				.addClasspathResource("processes/MyProcess.bpmn")//从classpath的资源中加载，一次只能加载一个文件
				.addClasspathResource("processes/MyProcess.png")//从classpath的资源中加载，一次只能加载一个文件
				.deploy();//完成部署
System.out.println("部署ID："+deployment.getId());//1
System.out.println("部署名称："+deployment.getName());//helloworld入门程序 
	}

	/**部署流程定义*/
	@Test
	public void deploymentProcessDefinition(){
		Deployment deployment = processEngine.getRepositoryService()//与流程定义和部署对象相关的Service
						.createDeployment()//创建一个部署对象
						.name("helloworld")//添加部署的名称
						.addClasspathResource("processes/MyProcess.bpmn")//从classpath的资源中加载，一次只能加载一个文件
						.addClasspathResource("processes/MyProcess.png")//从classpath的资源中加载，一次只能加载一个文件
						.deploy();//完成部署
		System.out.println("部署ID："+deployment.getId());//1
		System.out.println("部署名称："+deployment.getName());//helloworld入门程序  
	}
}
