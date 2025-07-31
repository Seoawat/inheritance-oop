// Ravenclaw.java
package com.example.inheritance;

public class Ravenclaw extends Student {
    private int intelligence;   // ум
    private int wisdom;         // мудрость
    private int wit;            // остроумие
    private int creativity;     // творчество

    public Ravenclaw(String name, int magicPower, int transgressionDistance,
                     int intelligence, int wisdom, int wit, int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() { return intelligence; }
    public int getWisdom() { return wisdom; }
    public int getWit() { return wit; }
    public int getCreativity() { return creativity; }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", ум = %d, мудрость = %d, остроумие = %d, творчество = %d",
                        intelligence, wisdom, wit, creativity);
    }

    public static void compareRavenclaws(Ravenclaw first, Ravenclaw second) {
        int firstPoints = first.getIntelligence() + first.getWisdom() + first.getWit() + first.getCreativity();
        int secondPoints = second.getIntelligence() + second.getWisdom() + second.getWit() + second.getCreativity();

        String winner = firstPoints > secondPoints ? first.getName() : second.getName();
        String loser = firstPoints > secondPoints ? second.getName() : first.getName();

        System.out.printf("%s — лучший Когтевранец, чем %s%n", winner, loser);
    }
}