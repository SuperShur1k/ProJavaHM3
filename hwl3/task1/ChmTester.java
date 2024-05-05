package org.example.lesson3.hwl3.task1;

public class ChmTester {
    public static void main(String[] args) {
        Champagne cru1 = new Champagne("Ambonnay", Quality.PREMIER);
        Champagne cru2 = new Champagne("Aÿ", Quality.GRAND);
        Champagne cru3 = new Champagne("Avize", Quality.AUTRE);

        cru1.info();
        cru2.info();
        cru3.info();
    }
}
