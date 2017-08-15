package com.codecool.crs;

public class Truck extends Vehicle {

    private int normalSpeed = 100;
    int breakdownTurnsLeft = 0;
    private static int chanceOfBreakDown = 5;

    void moveForAnHour(){
        int randomPercent = (int) (Math.random() * 100 + 1);
        if (breakdownTurnsLeft == 0 && randomPercent <= chanceOfBreakDown){
            breakdownTurnsLeft = 2;
        }
        if (breakdownTurnsLeft == 0){
            distanceTraveled += normalSpeed;
        } else {
            breakdownTurnsLeft--;
        }
    }

    Truck(){
        int randomNumber = (int) (Math.random() * 1001);
        name = Integer.toString(randomNumber);
    }

}
