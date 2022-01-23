package org.itstep.entity;


import lombok.Data;

import java.util.UUID;


@Data
public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String group;

    public Student(String firstName, String lastName, String group) {
        id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }
}
