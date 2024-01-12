package com.javatechie.bookingliquibase.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name",nullable = false, unique = true)
    private String name;

}
