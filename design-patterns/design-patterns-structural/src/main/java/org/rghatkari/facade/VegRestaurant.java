package org.rghatkari.facade;

import org.rghatkari.facade.Hotel;
import org.rghatkari.facade.menu.Menu;
import org.rghatkari.facade.menu.VegMenu;

public class VegRestaurant implements Hotel {

    @Override
    public String getMenu() {
        Menu menu = new VegMenu();
        return menu.getMenuItems();
    }
}
