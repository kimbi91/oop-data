package hu.progmatic.lesson_05_14;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> carsOnStreet = new ArrayList<>();

        carsOnStreet.add("BMW");
        carsOnStreet.add("Opel");
        carsOnStreet.add("Skoda");
        carsOnStreet.add("Vw");
        carsOnStreet.add("Opel");
        carsOnStreet.add("BMW");
        carsOnStreet.add("Skoda");
        carsOnStreet.add("Vw");


        List<String> otherCars = new ArrayList<>(
                Arrays.asList("BMW", "Opel", "Skoda", "Vw", "Opel", "BMW", "Skoda", "Vw")
        );

        // kulcsa adattipusa, ertek adattipusa
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "egy");
        map.put(2, "kettő");
        map.put(3, "három");

        String firstValue = map.get(1);

        /*for (Integer key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }*/

        Set<Integer> mapKeys = map.keySet();

        Map<Integer, String> map2;
        Map<String, Integer> map3;
        Map<Integer, List<String>> map4;

        Map<List<String>, String> map5;   // nem javasolt, kulcs legyen minel egyszerubb es konnyen kezelheto

        /*
        add = put(K , V)

         */

        Map<Integer, List<String>> mapList = new HashMap<>();

        mapList.putIfAbsent(1, new ArrayList<>());
        mapList.get(1).add("Lol");

        System.out.println(collectLettersPositions("hello"));

        List<Name> names = new ArrayList<>();
        names.add(new Name("Dezideráta", Gender.FEMALE));
        names.add(new Name("Pompónia", Gender.FEMALE));
        names.add(new Name("Szemirámisz", Gender.FEMALE));
        names.add(new Name("Zseraldina", Gender.FEMALE));
        names.add(new Name("Jukundusz", Gender.MALE));
        names.add(new Name("Tonuzóba", Gender.MALE));
        names.add(new Name("Arlen", Gender.MALE));
        names.add(new Name("Buzád", Gender.MALE));
        names.add(new Name("Dorián", Gender.MALE));

        Map<Gender, List<Name>> namesByGender = new HashMap<>();




    }

    public static void createPersonData() {
        Map<String, String> personData = new HashMap<>();

        personData.putIfAbsent("név", "Dezideráta");
        personData.putIfAbsent("születési év", "1970");
        personData.putIfAbsent("kedvenc szín", "sárga");
        personData.putIfAbsent("allergia", "hülyeség");

        Map<String, String> person2 = new HashMap<>();

        personData.putIfAbsent("név", "Józsi");
        personData.putIfAbsent("születési év", "1972");
        personData.putIfAbsent("kedvenc szín", "zöld");
        personData.putIfAbsent("allergia", "liszt");

    }

    public static int countCarBrand( List<String> cars, String carBrand ) {
        int counter = 0;

        for (String item : cars) {
            if (item.equalsIgnoreCase(carBrand)) {
                counter++;
            }
        }

        return counter;
    }

    public static int countDifferentCarBrands( List<String> cars ) {

        Set<String> brands = new HashSet<>(cars);

        return brands.size();
    }

    /*public static String[] countAllBrands(List<String> cars) {

        Set<String> brands = new HashSet<>(cars);

        String[] countedBrands = new String[brands.size()];
        int index = 0;

        for (String brand : brands) {
            countedBrands[index] = brand + " = " + countCarBrand(cars, brand);
            index++;
        }

        return countedBrands;
    }*/

    public static Map<String, Integer> countAllInMap( List<String> cars) {

        Map<String, Integer> counts = new HashMap<>();

        /*for (String car : cars) {
            Integer value = countCarBrand(cars, car);

            counts.putIfAbsent(car, value);
        }*/

        for (String car : cars) {
            counts.putIfAbsent(car, 0);
            int increasedValue = counts.get(car) + 1;
            counts.put(car, increasedValue);
        }

        return counts;
    }

    public static Map<Character, Integer> countLettersInText(String text) {

        Map<Character, Integer> counted = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            counted.putIfAbsent(letter, 0);
            int increasedValue = counted.get(letter) + 1;
            counted.put(letter, increasedValue);
        }

        return counted;
    }

    public static Map<Character, List<Integer>> collectLettersPositions(String text) {

        Map<Character, List<Integer>> collected = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {

            collected.putIfAbsent(text.charAt(i), new ArrayList<>());

            collected.get(text.charAt(i)).add(i);
        }

        return collected;
    }

    public static List<Name> findNamesByGender(List<Name> names, Gender gender) {

        List<Name> foundNames = new ArrayList<>();

        for (Name name : names) {
            if (name.getGender().equals(gender)) {
                foundNames.add(name);
            }
        }

        return foundNames;
    }

    public static Map<Gender, List<Name>> sortNamesByGender(List<Name> names) {

        Map<Gender, List<Name>> sorted = new HashMap<>();

        for (Name name : names) {

            sorted.putIfAbsent(name.getGender(), new ArrayList<>());

            sorted.get(name.getGender()).add(name);
        }

        return sorted;
    }


}