package csku.tour;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reservedSeats;
    public SingleTour (String name, double price, int allSeays){
        this.allSeats = allSeays;
        this.name = name;
        this.price = price;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getAvailableSeats() {
        return allSeats-reservedSeats;
    }

    @Override
    public void reserve(int num_of_seats) {
        if (reservedSeats<=getAvailableSeats()) {
            reservedSeats+=num_of_seats;
        }
    }
}
