package com.workflow.engine;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class WorkflowEngineServiceApplication {


	
//	public static void setBuild_val(String build_v) {
//		WorkflowEngineServiceApplication.build = build_val;
//		System.out.println(build_v);
//	}
	
	public static void main(String[] args) {
//		System.setProperty("spring.config.name", "demo");;
//		System.out.println("----" + WorkflowEngineServiceApplication.build );
		SpringApplication.run(WorkflowEngineServiceApplication.class, args);
	}
}
/*
 * 
 * refere : https://jenkins.io/doc/pipeline/tour/deployment/ for jenkinsFile
 */