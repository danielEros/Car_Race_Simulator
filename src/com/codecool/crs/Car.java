package com.codecool.crs;

class Car extends Vehicle {

    private int normalSpeed;
    private static String[] namesList = {"Warrior", "Shadow", "Vision", "Liberty", "Sliver", "Universe", "Marvel", "Prime", "Revelation", "Centaur"};
    private static int maxSpeed = 110;

    void moveForAnHour(){
        distanceTraveled += Math.min(maxSpeed, normalSpeed);
    }

    static void setSpeedLimit(int limit){
        maxSpeed = limit;
    }

    Car(){
       normalSpeed = (int) (Math.random() * 31 + 80);
       int randomIndex1 = (int) (Math.random() * 10);
       int randomindex2 = (int) (Math.random() * 10);
       name = namesList[randomIndex1] + " " + namesList[randomindex2];
    }

}
