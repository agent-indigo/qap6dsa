package com.keyin.hynes.braden.qap6dsa.classes;
import com.keyin.hynes.braden.qap6dsa.enums.Species;
public class Animal {
    private String name;
    private Species species;
    public Animal(
        String name,
        Species species
    ) {
        this.name = name;
        this.species = species;
    }
    public Animal() {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
}