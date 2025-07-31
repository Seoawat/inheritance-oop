// HogwartsMain.java
package com.example.inheritance;

public class HogwartsMain {
    public static void main(String[] args) {
        // Гриффиндор
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 95, 80, 90, 95, 85);
        Gryffindor ron = new Gryffindor("Рон Уизли", 70, 60, 75, 80, 85);
        Gryffindor harry = new Gryffindor("Гарри Поттер", 88, 85, 80, 85, 90);

        // Слизерин
        Slytherin draco = new Slytherin("Драко Малфой", 80, 75, 85, 70, 90, 75, 80);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 65, 60, 70, 65, 75, 60, 70);
        Slytherin gregory = new Slytherin("Грегори Гойл", 50, 40, 55, 45, 50, 40, 45);

        // Пуффендуй
        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 60, 55, 65, 60, 55);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 85, 90, 90, 95, 85);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 70, 65, 75, 70, 65);

        // Когтевран
        Ravenclaw cho = new Ravenclaw("Чжоу Чанг", 82, 80, 85, 80, 88, 83);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 88, 85, 90, 85, 80, 90);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 75, 70, 80, 75, 70, 78);

        // Вывод информации о студентах
        System.out.println("=== Студенты Хогвартса ===");
        System.out.println(hermione);
        System.out.println(ron);
        System.out.println(draco);
        System.out.println(cedric);
        System.out.println(cho);
        System.out.println();

        // Сравнение студентов одного факультета
        System.out.println("=== Сравнение студентов ===");
        Gryffindor.compareGryffindors(hermione, ron);
        Slytherin.compareSlytherins(draco, graham);
        Hufflepuff.compareHufflepuffs(cedric, zacharias);
        Ravenclaw.compareRavenclaws(padma, cho);
    }
}