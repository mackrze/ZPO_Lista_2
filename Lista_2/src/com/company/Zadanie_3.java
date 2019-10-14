package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Zadanie_3 {
    public static void main(String[] args) {
        System.out.println("Proszę podać kolejno: Imię i nazwisko razem, płeć, datę urodzenia (RRRR-MM-DD),wzrost, wagę ");
        Scanner scanner = new Scanner(System.in);
        String imięNazwisko=scanner.nextLine();
        String plec=scanner.nextLine();
        String dataString=scanner.nextLine();
        LocalDate date=LocalDate.parse(dataString);
        String wzrostString=scanner.nextLine();
        int wzrost= Integer.valueOf(wzrostString);
        String wagaString=scanner.nextLine();
        int waga= Integer.valueOf(wagaString);
        HealthProfile t1 = new HealthProfile(imięNazwisko,plec,date,wzrost,waga);
        System.out.println(t1.wiek());

    }
}
