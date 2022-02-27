package com.b2b.employee.monitoring.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalTime;

@Builder
@Getter
@Setter
@Document("shift")
public class Shift {

    @Id
    private long id;
    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
}
