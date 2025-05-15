package com.mbustosblas.app.hogar;

public enum HairColor {
    BLACK("Black"),
    BLOND("Blond"),
    RED("Red");

    private final String color;

    HairColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.color; //p.getColor() devuelve "Black" directamente
    }

}
