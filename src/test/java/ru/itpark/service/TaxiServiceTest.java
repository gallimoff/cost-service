package ru.itpark.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiServiceTest {

    @Test
    @DisplayName("Trip without discount ")
    void costWithoutDiscount() {
        TaxiService service = new TaxiService();

        int distance = service.cost(13);

        assertEquals(320, distance);
    }
    @Test
    @DisplayName("Discounted fare")
    void costWithDiscount ()
    {
        TaxiService service = new TaxiService();

        int distance = service.cost(50);

        assertEquals(1_007, distance);
    }

    @Test
    @DisplayName("Maximum Discount Ride")
    void costWithMaxDiscount ()
    {
        TaxiService service = new TaxiService();

        int distance = service.cost(150);

        assertEquals(2960, distance);
    }

}