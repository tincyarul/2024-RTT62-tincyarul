package org.example.PA_303_10_1_PolymorphismandInheritance;

public class FireMonster implements Monster {

    public String name;

    public FireMonster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return name;
    }
}
