package company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void SearchEng (ArrayList<infa> info) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение фразеологизма на русском: ");
        String name = sc.nextLine();
        for (int i = 0; i < info.size(); i++) {
            if (name.equalsIgnoreCase(info.get(i).rus)) {
                info.get(i).print_all_infa();
            }} }

    public static void SearchReversoinfo (ArrayList<infa> info) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите значение фразеологизма на английском: ");
        String name1 = sc1.nextLine();
        for (int i = 0; i < info.size(); i++) {
            if (name1.equalsIgnoreCase(info.get(i).eng)) {
                info.get(i).print_all_reversoinfo();
            }

        }
    }
    public static void Show_discribesRus (ArrayList<infa> info){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите фразеологизм, который необходимо найти: ");
        String ph = sc2.nextLine();
        for (int i = 0; i < info.size(); i++) {
            if (ph.equalsIgnoreCase(info.get(i).eng)) {
                info.get(i).print_all_discribesRus();
            }
            else if (ph.equalsIgnoreCase(info.get(i).rus )) {
                info.get(i).print_all_discribesRus();
            }
    }
}
    public static void Show_discribesEng (ArrayList<infa> info){
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите фразеологизм, который необходимо найти: ");
        String ph = sc2.nextLine();
        for (int i = 0; i < info.size(); i++) {
            if (ph.equalsIgnoreCase(info.get(i).eng)) {
                info.get(i).print_all_discribesEng();
            }
            else if (ph.equalsIgnoreCase(info.get(i).rus )) {
                info.get(i).print_all_discribesEng();
            }
        }
    }
}