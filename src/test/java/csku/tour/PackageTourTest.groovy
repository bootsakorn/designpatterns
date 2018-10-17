package csku.tour

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import static org.junit.jupiter.api.Assertions.assertEquals

class PackageTourTest {
    List<Tour> tours;
    PackageTour package1;
    @BeforeEach
    void init() {
        tours = new ArrayList<Tour>();
        tours.add(new SingleTour("ตลาดน้ำ", 250, 10));
        tours.add(new SingleTour("วัดพระแก้ว", 500, 15));
        PackageTour package1 = new PackageTour("ตลาดน้ำและวัดพระแก้ว",tours);
    }

    @Test
    void testGetName() {
        assertEquals("ตลาดน้ำและวัดพระแก้ว", package1.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(750*0.9, package1.getPrice());
    }

    @Test
    void testGetAvailableSeatsNotReserve() {
        assertEquals(10, package1.getAvailableSeats());
    }

    @Test
    void testReserve() {
        package1.reserve(5);
        assertEquals(5, package1.getAvailableSeats());
    }
}
