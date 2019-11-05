package com.vmware.csp.deploymentmanager.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.csp.deploymentmanager.model.Function;
import com.vmware.csp.deploymentmanager.repository.FunctionRepository;

@RestController
@RequestMapping("pull")
public class PullController {

    @Autowired
    private FunctionRepository functionRepository;

    @GetMapping(produces = "application/json")
    public List<Function> findAll(){
        List<Function> list = functionRepository.findAll();//todo by user
        //parse to yaml
        //write to file
        //commit and push to git

        return  list;

    }

}
