package com.b2b.employee.monitoring.entity


import spock.lang.Specification
import spock.lang.Unroll

import static com.b2b.employee.monitoring.factory.EntityFactory.defaultEmployee

class EntitySpec extends Specification {

    @Unroll
    def "Sample test for entity with value #test"() {
        given: "a default value"
        def emp = input

        when: "value is assigned"
        def fieldId = emp.getId()

        then: "validate the record"
        fieldId == expected

        where: "input"
        test   | input                   | expected
        "ID 1" | defaultEmployee()       | 1L
        "ID 1" | defaultEmployee(id: 2L) | 2L
    }

}
