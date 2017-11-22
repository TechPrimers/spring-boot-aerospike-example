package com.techprimers.springbootaerospikeexample.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private Integer id;
    private String name;
    private Long salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
