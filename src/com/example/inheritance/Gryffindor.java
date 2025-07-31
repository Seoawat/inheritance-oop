// Gryffindor.java
package com.example.inheritance;

public class Gryffindor extends Student {
    private int nobility;    // благородство
    private int honor;       // честь
    private int bravery;     // храбрость

    public Gryffindor(String name, int magicPower, int transgressionDistance,
                      int nobility, int honor, int bravery) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() { return nobility; }
    public int getHonor() { return honor;   }
    public int getBravery() { return bravery;    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", благородство = %d, честь = %d, храбрость = %d",
                        nobility, honor, bravery);
    }

    // Метод для сравнения двух гриффиндорцев
    public static void compareGryffindors(Gryffindor first, Gryffindor second) {
        int firstPoints = first.getNobility() + first.getHonor() + first.getBravery();
        int secondPoints = second.getNobility() + second.getHonor() + second.getBravery();

        String winner = firstPoints > secondPoints ? first.getName() : second.getName();
        String loser = firstPoints > secondPoints ? second.getName() : first.getName();

        System.out.printf("%s — лучший Гриффиндорец, чем %s%n", winner, loser);
    }
}