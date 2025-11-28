package com.example.service_voiture.clients;


import com.example.service_voiture.entities.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "client")
public interface ClientService {
    @GetMapping(path = "/client/{id}")
    Client clientById(@PathVariable Long id);
}