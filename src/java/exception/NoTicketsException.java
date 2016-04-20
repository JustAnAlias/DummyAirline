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
public class NoTicketsException extends Exception
{

    public NoTicketsException(String message)
    {
        super(message);
    }

    public NoTicketsException()
    {
        super("There is no space on this flight for that amount of tickets.");
    }
}
