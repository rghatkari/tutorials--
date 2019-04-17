package org.rghatkari.facade.menu;

public class BothVegNonVeg implements Menu{

    @Override
    public String getMenuItems() {
        StringBuffer sb = new StringBuffer();
        sb.append("Mutton Biryani").append(",");
        sb.append("Chicken Biryani").append(",");
        sb.append("Chicken 65").append(",");
        sb.append("Palak Paneer").append(",");
        sb.append("Mashroom 65").append(",");
        sb.append("Dal Fry").append(",");
        sb.append("Alu Curry");
        return sb.toString();
    }
}
