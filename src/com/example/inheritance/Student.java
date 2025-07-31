// Student.java
package com.example.inheritance;

public class Student {
    private String name;
    private int magicPower;       // сила магии (0–100)
    private int transgressionDistance; // расстояние трансгрессии (0–100)

    public Student(String name, int magicPower, int transgressionDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    @Override
    public String toString() {
        return String.format("%s: сила магии = %d, трансгрессия = %d м",
                name, magicPower, transgressionDistance);
    }
}