package com.codecool.crs;

import static com.codecool.crs.Race.isRaining;

class MotorCycle extends Vehicle {

    private int normalSpeed = 100;
    static int nameNumber = 1;

    void moveForAnHour(){
        int randomSpeedDecrement = (int) (Math.random() * 46 + 5);
        distanceTraveled += (isRaining ? normalSpeed - randomSpeedDecrement : normalSpeed);
    }

    MotorCycle(){
        name = "Motorcycle " + nameNumber++;
    }

}
