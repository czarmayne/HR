package com.b2b.employee.monitoring.factory

import com.b2b.employee.monitoring.presentation.rest.dto.OTRequestDto

import java.time.LocalDateTime

class OTRequestDtoFactory {

    static OTRequestDto defaultOvertimeRequest(Map customAttrs = [:]) {
        def attrs = [startDateTime: LocalDateTime.now(),
                     hours        : 2.5,
                     reason       : "urgent request",
                     corporateId  : "12AB3C"]

        attrs.putAll(customAttrs)
        new OTRequestDto(attrs)
    }
}
