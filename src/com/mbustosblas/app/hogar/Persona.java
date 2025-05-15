package com.mbustosblas.app.hogar;

public class Persona {
    private String name;
    private String surname;

    public static final String MASCULINE_GENDER = "Male";
    public static final String FEMALE_GENDER = "Female";

    private HairColor color;

    public HairColor getColor() {
        return color;
    }

    public void setColor(HairColor color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String playWithDog() {
        return "Lanzando la pelota al perrito";
    }

    public static String saludar() {
        return "Hola, estoy en mi hogar bien sabroso";
    }

}
