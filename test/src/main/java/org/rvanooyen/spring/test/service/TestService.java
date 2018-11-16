package org.rvanooyen.spring.test.service;

import org.rvanooyen.spring.test.model.ExampleModel;
import org.rvanooyen.spring.test.repositories.ExampleRepository;

import java.util.ArrayList;

public class TestService {

    ExampleRepository repository;

    public boolean doSomething() {
        //something
        return true;
    }

    public void addOne() {
        repository.save(new ExampleModel());
    }

    public int getCount() {
        ArrayList<ExampleModel> exampleModels = new ArrayList<ExampleModel>();
        repository.findAll().forEach(exampleModels::add);
        return exampleModels.size();
    }

    public void setRepository(ExampleRepository repository) {
        this.repository = repository;
    }
}
