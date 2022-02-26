package com.b2b.employee.monitoring.presentation.rest;

import com.b2b.employee.monitoring.presentation.rest.dto.OTResponse;
import com.b2b.employee.monitoring.presentation.rest.dto.OTRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/overtime")
public class OvertimeController {
    @PostMapping
    public ResponseEntity<OTResponse> createOTRequest(OTRequest request){
        return ResponseEntity.ok(new OTResponse());
    }
}
