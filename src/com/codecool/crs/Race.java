package com.codecool.crs;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Race {

    static boolean isRaining;
    final static int chanceOfRain = 30;
    static List<Vehicle> vehicleArray = new ArrayList<>(30);

    static void createVehicles(){
        for(int i=0; i<10; i++){
            vehicleArray.add(new Car());
            vehicleArray.add(new MotorCycle());
            vehicleArray.add(new Truck());
        }
    }

    static void simulateRace(){
        for(int i=0; i<50; i++){
            int randomPercent = (int) (Math.random() * 100 + 1);
            isRaining = randomPercent <= chanceOfRain;

            for (Vehicle vehicle: vehicleArray){
                if(vehicle instanceof Car){
                    Car car = (Car) vehicle;
                    if (isRaining) {
                        car.setSpeedLimit(70);
                    } else {
                        car.setSpeedLimit(110);
                    }
                }
                vehicle.moveForAnHour();
            }
        }
    }

    static void printRaceResults(){
        Collections.sort(vehicleArray, (first, second) ->
                second.getDistanceTraveled().compareTo(first.getDistanceTraveled()));
        for (Vehicle vehicle: vehicleArray){
            System.out.println(vehicle.getClass().getSimpleName() + " type " +
                    vehicle.name + " traveled " + vehicle.distanceTraveled + " km.");
        }
    }

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }

}