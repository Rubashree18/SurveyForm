package com.project.SurveyForm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String email;
    private String location;
    private String phone;

    private String frequency;
    private String purchasePlace;
    private String doorstep;
    private String clothingType;
    private String priceRange;
    private String fabric;
    private String priority;
    private String visitTime;

    @Column(length = 1000)
    private String feedback;
}

