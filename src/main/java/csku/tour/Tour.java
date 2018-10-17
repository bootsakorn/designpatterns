package csku.tour;

public interface Tour {
    String getName();
    double getPrice();
    int getAvailableSeats();
    void reserve(int num_of_seats);
}
