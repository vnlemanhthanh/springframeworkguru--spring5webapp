/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring.pets.service;

public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats are the Best!";
    }
}
