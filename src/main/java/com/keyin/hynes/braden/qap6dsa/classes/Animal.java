package com.keyin.hynes.braden.qap6dsa.classes;
import com.keyin.hynes.braden.qap6dsa.enums.Species;
public class Animal {
    private int id;
    private String name;
    private Species species;
    private int age;
    public Animal(
        int id,
        String name,
        Species species,
        int age
    ) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
    }
    public Animal() {}
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
    public Species getSpecies() {
        return species;
    }
    public void setSpecies(Species species) {
        this.species = species;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}