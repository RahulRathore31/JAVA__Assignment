package javaAssignment;

import java.time.LocalTime;

public class DisplaySystemTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Current system time: " + time);
    }
}
