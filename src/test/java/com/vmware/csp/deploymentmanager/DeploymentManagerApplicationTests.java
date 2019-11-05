package com.vmware.csp.deploymentmanager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.vmware.csp.deploymentmanager.repository.FunctionRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeploymentManagerApplicationTests {

	@Autowired
	private FunctionRepository functionRepository;
	@Test
	public void contextLoads() {

		functionRepository.findAll();
	}

}
