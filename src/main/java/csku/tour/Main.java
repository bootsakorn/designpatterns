package csku.tour;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        Tour waterMarket = new SingleTour("ตลาดน้ำ", 250, 10);
        Tour watPraKaew = new SingleTour("วัดพระแก้ว", 500, 15);

        System.out.println("ทัวร์"+waterMarket.getName()+" ราคา "+waterMarket.getPrice()+"  ว่าง " +waterMarket.getAvailableSeats()+" ที่นั่ง");
        waterMarket.reserve(2);
        System.out.println("ทัวร์"+waterMarket.getName()+" ราคา "+waterMarket.getPrice()+" ว่าง " +waterMarket.getAvailableSeats()+" ที่นั่ง");
        System.out.println();

        System.out.println("ทัวร์"+watPraKaew.getName()+" ราคา "+watPraKaew.getPrice()+" ว่าง " +watPraKaew.getAvailableSeats()+" ที่นั่ง");
        watPraKaew.reserve(5);
        System.out.println("ทัวร์"+watPraKaew.getName()+" ราคา "+watPraKaew.getPrice()+" ว่าง " +watPraKaew.getAvailableSeats()+" ที่นั่ง");
        System.out.println();

        List<Tour> tours = new ArrayList<Tour>();
        tours.add(new SingleTour("ตลาดน้ำ", 250, 10));
        tours.add(new SingleTour("วัดพระแก้ว", 500, 15));
        PackageTour package1 = new PackageTour("ตลาดน้ำและวัดพระแก้ว",tours);
        System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" ว่าง " +package1.getAvailableSeats()+" ที่นั่ง");
        package1.reserve(5);
        System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" ว่าง " +package1.getAvailableSeats()+" ที่นั่ง");
        package1.reserve(5);
        System.out.println("ทัวร์"+package1.getName()+" ราคา "+package1.getPrice()+" ว่าง " +package1.getAvailableSeats()+" ที่นั่ง");
    }
}
