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
            isRaining = randBetween(1, 100) <= chanceOfRain;
            if (isRaining) {
                Car.setSpeedLimit(70);
            } else {
                Car.setSpeedLimit(110);
            }
            for (Vehicle vehicle: vehicleArray){
                if (vehicle instanceof Car){
                    Car car = (Car) vehicle;
                    car.moveForAnHour();
                } else  if (vehicle instanceof MotorCycle){
                    MotorCycle motorCycle = (MotorCycle) vehicle;
                    motorCycle.moveForAnHour();
                } else if (vehicle instanceof Truck){
                    Truck truck = (Truck) vehicle;
                    truck.moveForAnHour();
                }
            }
        }
    }

    static void printRaceResults(){
        Collections.sort(vehicleArray, (first, second) ->
                second.getDistanceTraveled().compareTo(first.getDistanceTraveled()));
        for (Vehicle vehicle: vehicleArray){
            System.out.println(vehicle.getClass().getSimpleName() + " type " +
                    vehicle.getName() + " traveled " + vehicle.getDistanceTraveled() + " km.");
        }
    }

    static int randBetween(int min, int max){
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        createVehicles();
        simulateRace();
        printRaceResults();
    }

}