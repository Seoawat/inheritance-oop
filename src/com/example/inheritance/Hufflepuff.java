// Hufflepuff.java
package com.example.inheritance;

public class Hufflepuff extends Student {
    private int diligence;     // трудолюбие
    private int loyalty;       // верность
    private int honesty;       // честность

    public Hufflepuff(String name, int magicPower, int transgressionDistance,
                      int diligence, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() { return diligence; }
    public int getLoyalty() { return loyalty; }
    public int getHonesty() { return honesty; }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", трудолюбие = %d, верность = %d, честность = %d",
                        diligence, loyalty, honesty);
    }

    public static void compareHufflepuffs(Hufflepuff first, Hufflepuff second) {
        int firstPoints = first.getDiligence() + first.getLoyalty() + first.getHonesty();
        int secondPoints = second.getDiligence() + second.getLoyalty() + second.getHonesty();

        String winner = firstPoints > secondPoints ? first.getName() : second.getName();
        String loser = firstPoints > secondPoints ? second.getName() : first.getName();

        System.out.printf("%s — лучший Пуффендуец, чем %s%n", winner, loser);
    }
}