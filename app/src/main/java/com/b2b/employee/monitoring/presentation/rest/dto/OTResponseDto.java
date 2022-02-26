package com.b2b.employee.monitoring.presentation.rest.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class OTResponseDto {
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
