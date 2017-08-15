package com.codecool.crs;

import static com.codecool.crs.Race.randBetween;

class Car extends Vehicle {

    private int normalSpeed;
    private static String[] namesList = {"Warrior", "Shadow", "Vision",
            "Liberty", "Sliver", "Universe", "Marvel", "Prime", "Revelation", "Centaur"};
    private static int maxSpeed = 110;

    void moveForAnHour(){
        distanceTraveled += Math.min(maxSpeed, normalSpeed);
    }

    static void setSpeedLimit(int limit){
        maxSpeed = limit;
    }

    Car(){
       normalSpeed = randBetween(80, 110);
       name = namesList[randBetween(0, 9)] + " " + namesList[randBetween(0, 9)];
    }

}
