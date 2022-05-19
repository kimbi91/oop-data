package hu.progmatic.lesson_05_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*try {
            System.out.println("Itt még nincs hiba ez a sor lefut!");
            String numberString = "a";
            int number = Integer.parseInt(numberString);
        } catch (NumberFormatException e) {
            System.out.println("Itt kezeljük a hibát");
        } catch (Exception e) {
            // ez minden hibát megfog
        } finally {
            // ez minden esetben lefut
        }*/

        // unchecked exeption (runtime, nullpointer, aritmetic) azért töténik mert rossz a programkód
            // ezek közül az errorokra nem vonatkozik a fent leirt

        // checked exeption erre elvileg nem tudsz felkészülni, kötelező kezelni ezeket pl.: adatbázis nem elérhető

        File file = new File("src/main/java/hu/progmatic/lesson_05_18/lol.txt");

        try {
            Scanner sc = new Scanner(file);

            List<String> lines = new ArrayList<>();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines.add(line);
            }

            System.out.println(lines);

        } catch (FileNotFoundException e) {

        }


    }

    public static String divide(int n1, int n2) {
        try {
            return "" + (n1 / n2);
        } catch (ArithmeticException e) {
            return  "Nullával nem osztunk";
        }
    }

    public static void swap(Object[] o, int index1, int index2) {
        try {
            Object temp = o[index1];
            o[index1] = o[index2];
            o[index2] = temp;
        } catch (Exception e) {
            e.printStackTrace(); // kiirja a hibát, ez informatív
            e.getMessage(); // rovid info a hibáról
        }
    }

    public static boolean isCorrectPasswordFormat( String password ) throws RuntimeException{
        int digitCount = 0;
        int letteCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char current = password.charAt(i);

            if (Character.isDigit(current)) {
                digitCount++;
            } else if (Character.isLetter(current)) {
                letteCount++;
            }
        }

        if (digitCount >= 1 && letteCount >= 1) {
            return true;
        }

       throw new RuntimeException();
    }
}
