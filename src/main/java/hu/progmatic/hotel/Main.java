package hu.progmatic.hotel;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String csv;
        List<Booking> history = new ArrayList<>();
        Set<Booking> bookings = new TreeSet<>();


        do {
            System.out.println("Kérem a foglalás adatait!");
            csv = sc.nextLine();

            if (!csv.isBlank()) {
                Booking booking = new Booking(csv);
                history.add(booking);

                bookings.remove(booking);
                bookings.add(booking);
            }



        } while (!csv.isBlank());

        System.out.println("Jav sz: " + (history.size() - bookings.size()));

        Map<String, Integer> bookingByCitizenship = new TreeMap<>();

        for (Booking booking : bookings) {
            if (!bookingByCitizenship.containsKey(booking.getCitizenship())) {
                bookingByCitizenship.put(booking.getCitizenship(), 0);
            }

            int total = bookingByCitizenship.get(booking.getCitizenship()) + booking.getNumberOfGuests();
        }

        for (String citizenShip : bookingByCitizenship.keySet()) {
            System.out.println(citizenShip + ": " );
        }


    }
}
