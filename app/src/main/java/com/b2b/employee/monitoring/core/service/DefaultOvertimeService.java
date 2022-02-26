package com.b2b.employee.monitoring.core.service;

import com.b2b.employee.monitoring.core.entity.OvertimeRequest;
import org.springframework.stereotype.Service;

@Service
public class DefaultOvertimeService implements OvertimeService {
    @Override
    public OvertimeRequest createOTRequest(OvertimeRequest overtimeRequest) {
        return OvertimeRequest.builder().build();
    }
}
