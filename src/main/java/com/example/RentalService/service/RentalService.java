package com.example.RentalService.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RentalService {

    private final RestTemplate restTemplate;

    public RentalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getId(Long id) {
        String forEntity = restTemplate.getForEntity("http://localhost:8080/movie/" + id, String.class).getBody();
        return forEntity;
    }
}
