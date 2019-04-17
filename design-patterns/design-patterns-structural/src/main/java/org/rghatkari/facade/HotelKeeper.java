package org.rghatkari.facade;

import org.rghatkari.facade.menu.VegMenu;

public class HotelKeeper {
    public String getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();
        return vegRestaurant.getMenu();
    }

    public String getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        return nonVegRestaurant.getMenu();
    }

    public String getBoth() {
        BothVegNonVegRestaurant both = new BothVegNonVegRestaurant();
        return both.getMenu();
    }
}
