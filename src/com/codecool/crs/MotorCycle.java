package com.codecool.crs;

import static com.codecool.crs.Race.isRaining;
import static com.codecool.crs.Race.randBetween;

class MotorCycle extends Vehicle {

    private int normalSpeed = 100;
    static int nameNumber = 1;

    void moveForAnHour(){
        distanceTraveled += (isRaining ? normalSpeed - randBetween(5, 50) : normalSpeed);
    }

    MotorCycle(){
        name = "Motorcycle " + nameNumber++;
    }

}
