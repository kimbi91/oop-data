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

            if (!data.isBlank()) {
                if (!travels.contains(travel)) {
                    travels.add(travel);
                } else {
                    int index = travels.indexOf(travel);
                    travels.set(index, travel);
                }
            }

        } while (!data.isBlank());


        System.out.println("A megadott utazások adatai:");

        for (Travel travel : travels) {
            System.out.println(travel);
        }

        int distance = sc.nextInt();

        List<Travel> filtered = filterTravelsByMinDistance(travels, distance);

        for (Travel travel : filtered) {
            System.out.println(travel);
        }

    }

    private static List<Travel> filterTravelsByMinDistance(List<Travel> travels, int minDistance) {
        List<Travel> fileteredList = new ArrayList<>();

        for (Travel travel : travels) {
            if (travel.getDistance() >= minDistance) {
                fileteredList.add(travel);
            }
        }

        return fileteredList;
    }
}
