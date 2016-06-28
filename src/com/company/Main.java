package com.company;

public class Main {

    static StopLight light = new StopLight("Green");

    static Car quattro = new Car("Black", "Audi", 150);

    public static void main(String[] args) {
	for (int i = 0; i <= 30; i++) {
        if(light.isGreen()){
            quattro.go();
            light.setLightColor("Green");
        }
        if(light.isYellow()){
            quattro.slow();
            light.setLightColor("Yellow");
        }
        if(light.isRed()){
            quattro.stop();
            light.setLightColor("Red");
        }
    }
    }
}
