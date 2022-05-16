package hu.progmatic.lesson_05_16;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, String> dataBase = new HashMap<>();
        String data;

        System.out.println("Irj be ország - főváros párokat szóközzel elválasztva!");


        do {

            System.out.println("Kérem az adatot");
            data = sc.nextLine();

            if (!data.isBlank()) {
                String[] temp = data.split(" ");

                dataBase.put(temp[0], temp[1]);
            }


        } while (!data.isBlank());

        System.out.println("adatbázis mérete: " + dataBase.size());

        System.out.println("Ird be egy ország nevet!");
        String toCheck = sc.nextLine();

        System.out.println(dataBase.get(toCheck));

        Map<City, String> cities = new HashMap<>();
        Set<String> cityNames = new HashSet<>();

        do {
            System.out.println("Kérem az adatot.");
            data = sc.nextLine();

            if (!data.isBlank()) {
                String[] parts = data.split(" ");
                cityNames.add(parts[1]);
                cities.put(new City(Integer.parseInt(parts[0]), parts[1]), parts[2]);
            }
        } while (!data.isBlank());

        System.out.println("Adatbázis mérete: " + cities.size());

        System.out.println("Különböző városok:");

        for (String cityName : cityNames) {
            System.out.println(cityName);
        }

        System.out.println("Kérem az azonosítot.");
        int id = sc.nextInt();
        City city = new City(id);

        System.out.println("A megadott városhoz tartozó ország: " + cities.get(city) );
    }
}
