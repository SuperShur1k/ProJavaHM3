package org.example.lesson3.hwl3.task1;

/*Шампань - создать перечисление Cru для деревень Шампани
с указанием уровня качества AUTRE(80), PREMIER(90), GRAND(100)
Добавьте int quality, конструктор и геттер
*/
public class Champagne {
    private String village;
    private Quality quality;

    public String getVillage() {
        return village;
    }

    public Quality getQuality() {
        return quality;
    }

    public Champagne(String village, Quality quality) {
        this.village = village;
        this.quality = quality;
    }

    public void info () {
        System.out.println("Village - " + getVillage() + ", Quality - " + getQuality());
    }
}
