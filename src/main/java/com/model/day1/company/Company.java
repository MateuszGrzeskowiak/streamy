package com.model.day1.company;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Company {
    private String name; // nazwa firmy
    private String cityHeadquarters; // siedziba firmy
    private int employees; // ilość pracowników

    @ToString.Exclude
    private List<Purchase> purchaseList; // lista zakupów wykonanych przez firmę (co firma kupiła)
}

