package com.company.common;

import java.util.List;

public class FlightSchedule {


    public static List<Flight> getFlights() {
        return List.of(
                // date format DD-MM-YYYY
                new Flight("Boston", "New York", "17-10-2023"),
                new Flight("Chicago", "New York", "15-10-2023"),
                new Flight("Houston", "Phoenix", "16-10-2023"),
                new Flight("Phoenix", "Detroit", "15-10-2023")
        );
    }
}
