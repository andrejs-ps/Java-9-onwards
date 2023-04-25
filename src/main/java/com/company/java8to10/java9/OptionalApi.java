package com.company.java8to10.java9;

import com.company.common.Flight;
import com.company.common.FlightSchedule;

import java.util.Optional;

import static com.company.common.Utils.print;
import static java.util.Comparator.comparing;

public class OptionalApi {

    /**
     * Two new methods on Optional
     * ifPresentOrElse(if present - do this, else do that)
     * or(substitute optional of the same type)
     */
    public static void main(String[] args) {

        // get me the earliest flight
        Optional<Flight> earliestFlight =
                FlightSchedule.getFlights()
                        .stream()
                        .filter(f -> "Boston".equals(f.from()))
                        .filter(f -> "San Francisco".equals(f.to()))
                        .min(comparing(Flight::date));


        earliestFlight.ifPresentOrElse(x -> print("Flight found: " + earliestFlight),
                () -> print("Didn't find any flights for your search"));


        Optional<Flight> alternative = earliestFlight.or(
                () -> Optional.of(new Flight("A", "B", "17-10-2023"))
        );
        print(alternative.get());
    }
}
