// Slytherin.java
package com.example.inheritance;

public class Slytherin extends Student {
    private int trickery;         // хитрость
    private int decisiveness;     // решительность
    private int ambition;         // амбициозность
    private int resourcefulness;  // находчивость
    private int thirstForPower;   // жажда власти

    public Slytherin(String name, int magicPower, int transgressionDistance,
                     int trickery, int decisiveness, int ambition,
                     int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.trickery = trickery;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getTrickery() { return trickery; }
    public int getDecisiveness() { return decisiveness; }
    public int getAmbition() { return ambition; }
    public int getResourcefulness() { return resourcefulness; }
    public int getThirstForPower() { return thirstForPower; }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", хитрость = %d, решительность = %d, амбиции = %d, находчивость = %d, жажда власти = %d",
                        trickery, decisiveness, ambition, resourcefulness, thirstForPower);
    }

    public static void compareSlytherins(Slytherin first, Slytherin second) {
        int firstPoints = first.getTrickery() + first.getDecisiveness() + first.getAmbition() +
                first.getResourcefulness() + first.getThirstForPower();
        int secondPoints = second.getTrickery() + second.getDecisiveness() + second.getAmbition() +
                second.getResourcefulness() + second.getThirstForPower();

        String winner = firstPoints > secondPoints ? first.getName() : second.getName();
        String loser = firstPoints > secondPoints ? second.getName() : first.getName();

        System.out.printf("%s — лучший Слизеринец, чем %s%n", winner, loser);
    }
}