package com.mbustosblas.app.jardin;
import com.mbustosblas.app.hogar.HairColor;
import com.mbustosblas.app.hogar.Persona;

import static com.mbustosblas.app.hogar.Persona.saludar;
import static com.mbustosblas.app.hogar.Persona.MASCULINE_GENDER;


public class MainGarden {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setName("Marco");
        System.out.println(p.getName());

        Perrito pulgoso = new Perrito();
        String jugando = pulgoso.play(p);
        System.out.println(jugando);

        String saludo1 = Persona.saludar();
        System.out.println(saludo1);

        String saludo2 = saludar();
        System.out.println(saludo2);
        
        String femaleGender = Persona.FEMALE_GENDER;
        String maleGender = MASCULINE_GENDER;

        System.out.println("femaleGender = " + femaleGender);
        System.out.println("maleGender = " + maleGender);

        p.setColor(HairColor.BLACK);
        System.out.println(p.getColor()); //Imprime "Black" (usa toString())


    }
}