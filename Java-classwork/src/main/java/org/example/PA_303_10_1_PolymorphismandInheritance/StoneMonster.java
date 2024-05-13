package org.example.PA_303_10_1_PolymorphismandInheritance;

public class StoneMonster implements Monster {

    public String name;

    public StoneMonster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return name;
    }
}
