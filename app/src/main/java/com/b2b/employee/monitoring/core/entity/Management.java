package com.b2b.employee.monitoring.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@Document("management")
public class Management {

    @Id
    public long id;
    public long managerId;
    public long directReportId;
}
