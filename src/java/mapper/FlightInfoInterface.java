/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import entity.Airline;
import entity.Flight;
import exception.FlightNotFoundException;
import exception.NoTicketsException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rasmus
 */
public interface FlightInfoInterface
{

    public Airline createAirline(Airline airline);

    public Airline readAirline(String airlineName);

    public Airline updateAirline(Airline airline);

    public Airline deleteAirline(String airlineName);

    public String getBasedOnOrigin(String from, Date date, int numberOfTickets) throws FlightNotFoundException, NoTicketsException;

    public String getWithEndpoint(String from, String to, Date date, int numberOfTickets) throws FlightNotFoundException, NoTicketsException;

    public Airline getFromTo(String from, String to);

    public Flight createFlight(Flight flight);

    public Flight readSpecificFlight(String flightID);

    public Flight updateFlight(Flight flight);

    public Flight deleteFlight(String flightID);

    public List<Flight> readAllFlights();
}
