package org.example.lesson3.hwl3.task2;

public class WeekdayTester {
    public static void main(String[] args) {
        System.out.println("MONDAY isWeekDay? " + Weekday.MONDAY.isWeekDay());
        System.out.println("SUNDAY isWeekDay? " + Weekday.SUNDAY.isWeekDay());

        System.out.println("-------------------------------------");

        System.out.println("MONDAY isWeekEnd? " + Weekday.MONDAY.isWeekEnd());
        System.out.println("SUNDAY isWeekEnd? " + Weekday.SUNDAY.isWeekEnd());
    }
}
