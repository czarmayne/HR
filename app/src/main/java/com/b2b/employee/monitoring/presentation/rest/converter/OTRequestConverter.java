package com.b2b.employee.monitoring.presentation.rest.converter;

import com.b2b.employee.monitoring.core.entity.Employee;
import com.b2b.employee.monitoring.core.entity.OvertimeRequest;
import com.b2b.employee.monitoring.presentation.rest.dto.OTRequestDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Another way of implementing a mapper without using a third party library like ModelMapper
 */
@Component
public class OTRequestConverter implements Converter<OTRequestDto, OvertimeRequest> {
    @Override
    public OvertimeRequest convert(OTRequestDto source) {
        Employee employee = Employee.builder().corporateId(source.getCorporateId()).build();
        return OvertimeRequest.builder()
                .startDateTime(source.getStartDateTime())
                .hours(source.getHours())
                .reason(source.getReason())
                .employee(employee)
                .build();
    }
}
