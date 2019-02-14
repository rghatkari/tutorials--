package com.rghatkari.test.creational.factory;

public class FactoryDriver {
    public static void main(String[] args){
        Polygon polygon = null;
        PolygonFactory factory = new PolygonFactory();

        polygon = factory.getPolygon(4);
        System.out.println("The shape with 4 sides is: " + polygon.getType());

        polygon = factory.getPolygon(8);
        System.out.println("The shape with 8 sides is: " + polygon.getType());
    }
}
