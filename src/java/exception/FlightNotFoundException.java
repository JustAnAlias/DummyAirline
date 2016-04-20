/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Rasmus
 */
public class FlightNotFoundException extends Exception
{

    public FlightNotFoundException(String message)
    {
        super(message);
    }

    public FlightNotFoundException()
    {
        super("So sorry! No flights at this specific time.");
    }
}
