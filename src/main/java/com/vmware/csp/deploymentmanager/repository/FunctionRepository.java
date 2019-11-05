package com.vmware.csp.deploymentmanager.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vmware.csp.deploymentmanager.model.Function;

public interface FunctionRepository extends MongoRepository<Function, String> {

}
