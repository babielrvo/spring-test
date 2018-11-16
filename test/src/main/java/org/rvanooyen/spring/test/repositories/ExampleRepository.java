package org.rvanooyen.spring.test.repositories;

import org.rvanooyen.spring.test.model.ExampleModel;
import org.springframework.data.repository.CrudRepository;

public interface ExampleRepository extends CrudRepository<ExampleModel, Long> {
}
