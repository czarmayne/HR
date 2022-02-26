package com.b2b.employee.monitoring.configuration;

import com.b2b.employee.monitoring.core.service.DefaultOvertimeService;
import com.b2b.employee.monitoring.core.service.OvertimeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public OvertimeService overtimeService() {
        return new DefaultOvertimeService();
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
