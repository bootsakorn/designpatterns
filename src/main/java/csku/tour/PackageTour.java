package csku.tour;

import java.util.ArrayList;
import java.util.List;

public class PackageTour implements Tour {
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();
    private int indexMin;
    public PackageTour (String name, List<Tour> tours){
        this.packageName = name;
        this.tours = tours;
    }
    @Override
    public String getName() {
        return packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Tour t : tours) {
            total+=t.getPrice();
        }
        return total*0.9;
    }

    @Override
    public int getAvailableSeats() {
        int availableSeats = tours.get(0).getAvailableSeats();
        for (Tour i : tours){
            if (i.getAvailableSeats()<availableSeats){
                availableSeats = i.getAvailableSeats();
                indexMin = tours.indexOf(i);
            }
        }
        return availableSeats;
    }

    @Override
    public void reserve(int num_of_seats) {
        tours.get(indexMin).reserve(num_of_seats);
    }
}
