package org.rghatkari.facade.menu;

public class NonVegMenu implements Menu {

    @Override
    public String getMenuItems() {
        StringBuffer sb = new StringBuffer();
        sb.append("Mutton Biryani").append(",");
        sb.append("Chicken Biryani").append(",");
        sb.append("Chicken 65");
        return sb.toString();
    }
}
