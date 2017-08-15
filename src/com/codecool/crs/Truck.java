package com.codecool.crs;

import static com.codecool.crs.Race.randBetween;

public class Truck extends Vehicle {

    private int normalSpeed = 100;
    int breakdownTurnsLeft = 0;
    private static int chanceOfBreakDown = 5;

    void moveForAnHour(){
        if (breakdownTurnsLeft == 0 && randBetween(1, 100) <= chanceOfBreakDown){
            breakdownTurnsLeft = 2;
        }
        if (breakdownTurnsLeft == 0){
            distanceTraveled += normalSpeed;
        } else {
            breakdownTurnsLeft--;
        }
    }

    Truck(){
        name = Integer.toString(randBetween(0, 1000));
    }

}
