package br.com.user.application.service;

import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public  String CheckMessage() {
        return "Server is running ...";
    }

}
