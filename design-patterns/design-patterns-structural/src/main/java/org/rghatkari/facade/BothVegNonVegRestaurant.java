package org.rghatkari.facade;

import org.rghatkari.facade.Hotel;
import org.rghatkari.facade.menu.BothVegNonVeg;
import org.rghatkari.facade.menu.Menu;

public class BothVegNonVegRestaurant implements Hotel {
    @Override
    public String getMenu() {
        Menu menu = new BothVegNonVeg();
        return menu.getMenuItems();
    }
}
