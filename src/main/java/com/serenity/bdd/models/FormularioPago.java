package com.serenity.bdd.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class FormularioPago {
    private final String name;
    private final String country;
    private final String city;
    private final String creditCard;
    private final String month;
    private final String year;
}
