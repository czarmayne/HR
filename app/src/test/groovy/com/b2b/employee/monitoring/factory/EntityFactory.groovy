package com.b2b.employee.monitoring.factory

import com.b2b.employee.monitoring.core.entity.Employee

class EntityFactory {

    static Employee defaultEmployee(Map customAttrs = [:]) {
        def attrs = [
                     id         : 1L,
                     corporateId: "12AB3C",
                     firstName  : "Uno",
                     lastName   : "Dos",
                     department : "Engineering"]

        attrs.putAll(customAttrs)
        new Employee(attrs)
    }
}
