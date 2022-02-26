package com.b2b.employee.monitoring.presentation.rest;

import com.b2b.employee.monitoring.core.entity.Employee;
import com.b2b.employee.monitoring.core.entity.OvertimeRequest;
import com.b2b.employee.monitoring.core.service.OvertimeService;
import com.b2b.employee.monitoring.presentation.rest.dto.OTResponseDto;
import com.b2b.employee.monitoring.presentation.rest.dto.OTRequestDto;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@AllArgsConstructor
@RestController
@RequestMapping("/overtime")
public class OvertimeController {

    private OvertimeService overtimeService;
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<OTResponseDto> createOTRequest(@Valid OTRequestDto request) {
        OvertimeRequest createdOTRequest = overtimeService.createOTRequest(convertToEntity(request));
        return ResponseEntity.ok(convertToDto(createdOTRequest));
    }

    @SneakyThrows
    private OvertimeRequest convertToEntity(OTRequestDto request) {
        OvertimeRequest requestEntity = modelMapper.map(request, OvertimeRequest.class);
        Employee employee = Employee.builder().corporateId(request.getCorporateId()).build();
        requestEntity.setEmployee(employee);

        return requestEntity;
    }

    private OTResponseDto convertToDto(OvertimeRequest createdOTRequest) {
        return modelMapper.map(createdOTRequest, OTResponseDto.class);
    }
}
