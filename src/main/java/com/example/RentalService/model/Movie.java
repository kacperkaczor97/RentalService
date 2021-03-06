package com.example.RentalService.model;

public class Movie {

    private Long id;
    private String name;
    private Category category;
    private boolean isAvailable;

    public Movie(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Movie() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

}

