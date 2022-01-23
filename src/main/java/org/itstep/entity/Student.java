package org.itstep.entity;


import lombok.Data;

import java.util.Date;


@Data
public class Student {
    private Long id;
    private String firstName;
    private String lastName;
    private Date birthDate;
}
