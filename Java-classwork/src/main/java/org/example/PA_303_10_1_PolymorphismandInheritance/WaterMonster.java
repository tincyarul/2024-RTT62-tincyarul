package org.example.PA_303_10_1_PolymorphismandInheritance;

public class WaterMonster implements Monster {

    public String name;

    public WaterMonster(String name) {
        this.name = name;
    }

    @Override
    public String attack() {
        return name;
    }
}
