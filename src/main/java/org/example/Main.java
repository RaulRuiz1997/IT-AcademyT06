package org.example;

import org.example.exercici1.NoGenericMethods;
import org.example.exercici2.Persona;

public class Main {

    public static void main(String[] args) {

        // Exercici 1 --------------------------------------------------------------------------------------------------
        Persona persona1 = new Persona("Raul", "Ruiz", 25);
        Persona persona2 = new Persona("Carmen", "García", 21);
        Persona persona3 = new Persona("Miquel", "Giol", 19);
        // Comprova que els arguments es poden posar en qualsevol posició en la crida al constructor.
        // Yo aquí puedo poner el orden que quiera que siempre va a funcionar. Estos 3 funcionan igual

        /*
        NoGenericMethods ngm = new NoGenericMethods(persona1, persona2, persona3);
        NoGenericMethods ngm2 = new NoGenericMethods(persona2, persona1, persona3);
        NoGenericMethods ngm3 = new NoGenericMethods(persona3, persona2, persona1);
         */

        NoGenericMethods ngm = new NoGenericMethods(persona1, persona2, persona3);

        System.out.println(ngm.getPersonas());

        ngm.emmagatzemar(persona1);

        System.out.println(ngm.getPersonas());

        ngm.extreure(3);

        System.out.println(ngm.getPersonas());


        // Exercici 2 --------------------------------------------------------------------------------------------------



    }

}