package com.b2b.employee.monitoring.core.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@Document("overtimerequest")
public class OvertimeRequest {

    @Id
    private long id;
    private LocalDateTime requestDateTime;
    private long employeeId;
    private long managerId;
    private String reason;
    private String status;
    private String createdBy;
    private LocalDateTime createdDateTime;
    private String updatedBy;
    private LocalDateTime updatedDateTime;

}
