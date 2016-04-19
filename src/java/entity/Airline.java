/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Rasmus
 */
@Entity
public class Airline implements Serializable
{

    @Id
    private String airline;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Flight> flights = new ArrayList();

    public Airline()
    {
    }

    public Airline(String airline)
    {
        this.airline = airline;
    }

    public void addFlightToAirline(Flight flight)
    {
        flights.add(flight);
    }

    public String getAirline()
    {
        return airline;
    }

    public void setAirline(String airline)
    {
        this.airline = airline;
    }

    public List<Flight> getFlights()
    {
        return flights;
    }

    public void setFlights(List<Flight> flights)
    {
        this.flights = flights;
    }

}
