package org.example.exercici1;

import org.example.exercici2.Persona;

import java.util.ArrayList;
import java.util.List;

public class NoGenericMethods {

    Persona persona1;
    Persona persona2;
    Persona persona3;
    List<Persona> personas = new ArrayList<>();

    public NoGenericMethods(Object persona1, Object persona2, Object persona3) {

        this.persona1 = (Persona) persona1;
        this.persona2 = (Persona) persona2;
        this.persona3 = (Persona) persona3;

        personas.add(this.persona1);
        personas.add(this.persona2);
        personas.add(this.persona3);

    }

    public void emmagatzemar(Persona persona) {
        personas.add(persona);
    }

    public Persona extreure(int index) {

        if (index < 0 || index >= personas.size()) {
            return null;
        }

        Persona personaEliminada = personas.get(index);
        personas.remove(personaEliminada);
        return personaEliminada;

    }

    public List<Persona> getPersonas() {
        return personas;
    }

}
