package com.b2b.employee.monitoring.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Builder
@Getter
@Setter
public class Shift {

    private long id;
    private String name;
    private LocalTime startTime;
    private LocalTime endTime;
}
