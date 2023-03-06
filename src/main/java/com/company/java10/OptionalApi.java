package com.company.java10;

import com.company.common.Flight;
import com.company.common.FlightNotFoundException;
import com.company.common.FlightSchedule;

import java.util.Optional;

import static java.util.Comparator.comparing;

public class OptionalApi {

    /**
     * new .orElseThrow()
     */
    public static void main(String[] args) {

        Optional<Flight> earliestFlight = FlightSchedule.getFlights()
                .stream()
                .filter(f -> "Boston".equals(f.from()))
                .filter(f -> "San Francisco".equals(f.to()))
                .min(comparing(Flight::date));

        earliestFlight.orElseThrow(FlightNotFoundException::new);
    }
}
