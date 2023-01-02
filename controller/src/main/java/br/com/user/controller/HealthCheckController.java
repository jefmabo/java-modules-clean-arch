package br.com.user.controller;

import br.com.user.usecases.service.dto.HealthCheckDto;
import br.com.user.usecases.service.interfaces.HealthCheckService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/health-check")
public class HealthCheckController {

    private final HealthCheckService healthCheckService;

    public HealthCheckController(HealthCheckService healthCheckService) {
        this.healthCheckService = healthCheckService;
    }

    @GetMapping
    public ResponseEntity<HealthCheckDto> check() {
        var dto = healthCheckService.checkMessage();
        return ResponseEntity.ok(dto);
    }
}
