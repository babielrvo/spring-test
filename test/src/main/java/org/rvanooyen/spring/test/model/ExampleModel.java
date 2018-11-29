package org.rvanooyen.spring.test.model;

import javax.persistence.*;

@Entity
@Table(name = "exampleModel")
public class ExampleModel {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "text")
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
