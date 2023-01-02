package br.com.user.usecases.service;

import br.com.user.usecases.service.dto.HealthCheckDto;
import br.com.user.usecases.service.interfaces.HealthCheckService;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckServiceImp implements HealthCheckService {
    @Override
    public HealthCheckDto checkMessage() {
        var dto = new HealthCheckDto();
        dto.setMessage("Service is running");

        return dto;
    }
}
