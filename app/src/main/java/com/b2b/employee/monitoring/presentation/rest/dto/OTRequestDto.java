package com.b2b.employee.monitoring.presentation.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class OTRequestDto {

    @NotNull(message = "Start date & time are required")
    private LocalDateTime startDateTime;

    @NotNull
    @Min(value = 1, message = "OT minimum is one hour")
    private double hours;

    @NotEmpty(message = "Reason is required")
    @Size(max = 250, message = "Reason cannot be more than 250 characters")
    private String reason;

    @NotNull(message = "Employee corporateId is required")
    @Size(min = 6, max = 6, message = "Invalid corporateId")
    private String corporateId;
}
