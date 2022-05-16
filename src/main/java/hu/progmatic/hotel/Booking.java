package hu.progmatic.hotel;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking>{

    private final Integer id;
    private String date;
    private String citizenship;
    private int numberOfGuests;
    private int numberOfNights;
    private double price;

    public Booking(Integer id) {
        this.id = id;
    }

    public Booking(Integer id, String date, String citizenship, int numberOfGuests, int numberOfNights, double price) {
        this.id = id;
        this.date = date;
        this.citizenship = citizenship;
        this.numberOfGuests = numberOfGuests;
        this.numberOfNights = numberOfNights;
        this.price = price;
    }

    public Booking(String csv) {
        String[] parts = csv.split(" ");
        this.id = Integer.parseInt(parts[0]) ;
        this.date = parts[1];
        this.citizenship = parts[2];
        this.numberOfGuests = Integer.parseInt(parts[3]);
        this.numberOfNights = Integer.parseInt(parts[4]);
        this.price = Double.parseDouble(parts[5]);
    }

    public Integer getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return id == booking.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", citizenship='" + citizenship + '\'' +
                ", numberOfGuests=" + numberOfGuests +
                ", numberOfNights=" + numberOfNights +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Booking o) {
        return id.compareTo(o.id);
    }
}
