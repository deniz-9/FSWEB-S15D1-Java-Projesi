package com.workintech.pazarArabasi.model;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pazar {
    public static boolean checkItemIsInList(List<String> liste, String item) {
        return liste.contains(item);
    }

    public static void printSorted(List<String> liste) {
        Collections.sort(liste);
        System.out.println(liste);
    }

    public static void addItems(List<String> liste) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains(",")) {
            String[] items = input.split(",");
            for (String element : items) {
                if (!checkItemIsInList(liste, element.trim())) {
                    liste.add(element.trim());
                } else {
                    System.out.println(element.trim() + " Zaten var!");
                }
            }
        } else {
            if (!checkItemIsInList(liste, input.trim())) {
                liste.add(input.trim());
            } else {
                System.out.println(input.trim() + " Zaten var!");
            }
        }
        printSorted(liste);
    }

    public static void removeItems(List<String> liste) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains(",")) {
            String[] items = input.split(",");
            for (String element : items) {
                if (checkItemIsInList(liste, element)) {
                    liste.remove(element.trim());
                } else {
                    System.out.println(element.trim() + " Zaten yok!");
                }
            }
        } else {
            if (checkItemIsInList(liste, input.trim())) {
                liste.remove(input.trim());
            } else {
                System.out.println(input.trim() + " Zaten var!");
            }
        }
        printSorted(liste);
    }

}

