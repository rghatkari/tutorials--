package org.rghatkari.facade;

/**
 * Facade Design Pattern!
 *
 */
public class App
{
    public static void main( String[] args ) {
        System.out.println( "Facade Design Pattern!" );
        HotelKeeper keeper = new HotelKeeper();
        System.out.println(keeper.getVegMenu());
        System.out.println(keeper.getNonVegMenu());
        System.out.println(keeper.getBoth());
    }
}
