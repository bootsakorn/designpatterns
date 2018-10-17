package csku.tour
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class SingleTourTest {
    Tour watPraKaew ;

    @BeforeEach
    void init() {
        watPraKaew = new SingleTour("วัดพระแก้ว", 500, 15);
    }

    @Test
    void testGetName() {
        assertEquals("วัดพระแก้ว", watPraKaew.getName());
    }

    @Test
    void testGetPrice() {
        assertEquals(500, watPraKaew.getPrice());
    }

    @Test
    void testGetAvailableSeatsNotReserve() {
        assertEquals(15, watPraKaew.getAvailableSeats());
    }

    @Test
    void testReserve() {
        watPraKaew.reserve(2)
        assertEquals(13, watPraKaew.getAvailableSeats());
    }
}
