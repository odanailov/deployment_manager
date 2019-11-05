package com.vmware.csp.deploymentmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

@SpringBootApplication
public class DeploymentManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeploymentManagerApplication.class, args);
	}

	public @Bean MongoClientFactoryBean mongo() {
		MongoClientFactoryBean mongo = new MongoClientFactoryBean();
		mongo.setHost("localhost");
		mongo.setPort(32768);
		return mongo;
	}

}
