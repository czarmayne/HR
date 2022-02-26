package com.b2b.employee.monitoring.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Employee {

    private long id;
    private String corporateId;
    private String firstName;
    private String lastName;
    private String department;
    private long shiftId;
    private String email;
}
