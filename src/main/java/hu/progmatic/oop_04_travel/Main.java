package hu.progmatic.oop_04_travel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Travel> travels = new ArrayList<>();

        String data;

        System.out.println("kérem az utazások adatait, ha végeztél irjál egy üres sort.");

        do {
            data = sc.nextLine();
            Travel travel = new Travel(data);

            if (!travels.contains(travel)) {
                travels.add(travel);
            } else {
                int index = travels.indexOf(travel);
                travels.set(index, travel);
            }
        } while (!data.isBlank());


        System.out.println("A megadott utazások adatai:");

        for (Travel travel : travels) {
            System.out.println(travel);
        }
    }

}
