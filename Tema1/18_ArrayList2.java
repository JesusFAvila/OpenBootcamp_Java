package com.company;

public class CochesMain {
    String marca = "Marca";

    public CochesMain (){}
    public CochesMain (String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "CochesMain{" +
                "marca='" + marca + '\'' +
                '}';
    }
}

