package com.taraskina.top.recipes.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    private String text;
    private String ingredients;
    private String type;
    private String category;

    public Recipe(String name, String text, String ingredients, String type, String category) {
        this.name = name;
        this.text = text;
        this.ingredients = ingredients;
        this.type = type;
        this.category = category;
    }

    public Recipe() {
    }
}
