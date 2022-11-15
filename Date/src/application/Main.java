package application;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate dia = LocalDate.now();
        System.out.println(dia.getMonth());
        System.out.println(dia.getYear());
    }
}