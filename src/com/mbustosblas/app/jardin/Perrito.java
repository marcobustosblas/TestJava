package com.mbustosblas.app.jardin;

import com.mbustosblas.app.hogar.Persona;

public class Perrito {
    protected String name;
    protected String breed;

    String play(Persona p) {
        return p.playWithDog();
    }
}
