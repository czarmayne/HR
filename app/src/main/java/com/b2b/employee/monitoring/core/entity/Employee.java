package com.b2b.employee.monitoring.core.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Document("employee")
public class Employee {

    @Id
    private long id;
    private String corporateId;
    private String firstName;
    private String lastName;
    private String department;
    private long shiftId;
    private String email;
}
