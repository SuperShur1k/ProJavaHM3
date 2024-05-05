package org.example.lesson3.hwl3.task1;

public enum Quality {
    AUTRE(80),
    PREMIER(90),
    GRAND(100);

    private int quality;

    Quality(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }
}
