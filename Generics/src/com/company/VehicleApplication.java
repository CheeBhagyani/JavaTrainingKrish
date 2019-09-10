package com.company;

public class VehicleApplication {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();

        Vehicle<Car> carVehicle = new Vehicle<>(car);
        Vehicle<Bus> busVehicle = new Vehicle<>(bus);

        carVehicle.drive();
        busVehicle.drive();
    }
}
