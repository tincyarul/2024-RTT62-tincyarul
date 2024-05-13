package org.example.PA_303_10_1_PolymorphismandInheritance;

public class TestMonster {
    public static void main(String[] args) {
// Program at the "interface" defined in the superclass.
// Declare instances of the superclass, substituted by subclasses.
        Monster m1 = new FireMonster("FireMonster"); // upcast
        Monster m2 = new WaterMonster("WaterMonster"); // upcast
        Monster m3 = new StoneMonster("StoneMonster"); // upcast
// Invoke the actual implementation
        System.out.println(m1.attack()); // Run FireMonster's attack()
        System.out.println(m2.attack()); // Run WaterMonster's attack()
        System.out.println(m3.attack()); // Run StoneMonster's attack()
// m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("StoneMonster"); // upcast
        System.out.println(m1.attack()); // Run StoneMonster's attack()
// We have a problem here!!!

        Monster dsfsdf = new Monster() {
            String name = "Tincy";

            @Override
            public String attack() {
                return name;
            }
        };
        System.out.println(dsfsdf.attack());


    }
}

