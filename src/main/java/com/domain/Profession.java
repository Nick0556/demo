package com.domain;

import lombok.Data;

@Data
public class Profession {

    private Integer id;

    private String profession;


    public static void main(String[] args) {
        Profession profession = new Profession();
        System.out.println(profession.getId());
    }
}