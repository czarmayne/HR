package com.b2b.employee.monitoring.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Management {

    public long id;
    public long managerId;
    public long directReportId;
}
