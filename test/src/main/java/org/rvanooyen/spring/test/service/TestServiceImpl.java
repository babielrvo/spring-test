package org.rvanooyen.spring.test.service;

import org.rvanooyen.spring.test.model.ExampleModel;
import org.rvanooyen.spring.test.repositories.ExampleRepository;

import java.util.ArrayList;

public class TestServiceImpl implements TestService {

    private ExampleRepository repository;

    @Override
    public boolean doSomething() {
        //something
        return true;
    }

    @Override
    public void addOne() {
        repository.save(new ExampleModel());
    }

    @Override
    public int getCount() {
        ArrayList<ExampleModel> exampleModels = new ArrayList<>();
        repository.findAll().forEach(exampleModels::add);
        return exampleModels.size();
    }

    public void setRepository(ExampleRepository repository) {
        this.repository = repository;
    }
}
