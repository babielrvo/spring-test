package org.rvanooyen.spring.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExampleModel {

    @Id
    @GeneratedValue
    private Long id;
}
