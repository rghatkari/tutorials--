package org.rghatkari.facade;

import org.rghatkari.facade.menu.Menu;
import org.rghatkari.facade.menu.NonVegMenu;

public class NonVegRestaurant implements Hotel {

    @Override
    public String getMenu() {

        Menu menu = new NonVegMenu();
        return menu.getMenuItems();
    }
}
