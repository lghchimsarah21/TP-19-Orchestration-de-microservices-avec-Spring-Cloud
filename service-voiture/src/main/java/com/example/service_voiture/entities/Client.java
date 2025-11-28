package com.example.service_voiture.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Long id;      // ← AJOUTEZ CETTE LIGNE
    private String nom;
    private Float age;
}