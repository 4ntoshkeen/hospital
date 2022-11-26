package ru.antoshkeen.springcourse.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Operation {

    private int id;
    @NotEmpty(message = "This field can't be empty")
    @Size(min = 2, max = 100, message = "Check size of 'Name'")
    private String name;
    private String type;
    private String description;


    public Operation(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public Operation() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
