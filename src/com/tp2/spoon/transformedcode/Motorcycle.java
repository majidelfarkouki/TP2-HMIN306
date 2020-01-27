package com.tp2.spoon.transformedcode;

public class Motorcycle {
    private java.lang.String color = "";

    protected java.lang.String brand;

    protected boolean engineState = false;

    public Motorcycle(java.lang.String brand, boolean engineState, java.lang.String color) {
        super();
        this.brand = brand;
        this.engineState = engineState;
        this.color = color;;
    }

    public java.lang.String showAtts() {
        return "Motorcycle : "
        + "color : " + color
        + "brand : " + brand
        + "engineState : " + engineState
        ;
    }

    public void startEngine() {
        System.out.println("The engine is now on.");
    }
}