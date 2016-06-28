package com.company;

/**
 * Created by raymour on 6/28/16.
 */
public class Car {
    String mColor;
    String mBrand;
    int mTopSpeed;

//Create Constructor

public Car(String Color, String Brand, int TopSpeed) {
    mColor = Color;
    mBrand = Brand;
    mTopSpeed = TopSpeed;
}
//Implement go, slow, and stop methods that print something out. (You can print whatever is appropriate for the methods)
    public static void go () {
        System.out.println("Speed Up!!!");
    }
    public static void slow () {
        System.out.println("Apply the Break, Slow Down!!!");
    }
    public static void stop () {
        System.out.println("Slam on the breaks, Stop!!!");
    }

    //Create individual setter methods that set the color, brand, and topSpeed of the car.

    public void setColor(String color) {
        mColor = color;
    }
    public void setBrand(String brand) {
        mBrand = brand;
    }
    public void setTopSpeed(int topSpeed) {
        mTopSpeed = topSpeed;
    }
    // Create individual getter methods that print out the color, brand, and topSpeed of the car.

    public String getColor() {
        return mColor;
    }
    public String getmBrand() {
        return mBrand;
    }
    public int getmTopSpeed() {
        return mTopSpeed;
    }


}
