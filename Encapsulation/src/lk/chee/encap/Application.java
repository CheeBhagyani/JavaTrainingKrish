package lk.chee.encap;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
//        for(Bus bus:BusStation.buses) {
//            System.out.println(bus);
//        }

//        BusStation busStation = new BusStation();
//        BusStation.Bus bus =  busStation.new Bus();
        BusStation busStation = new BusStation();
        busStation.addBuses("Green");
        busStation.addBuses(busStation.new Bus("Blue"));
        busStation.addBuses(new BusStation().new Bus("Yellow"));

//        for(BusStation.Bus bus: busStation.getBuses()){
//            System.out.println(bus);
//        }

        busStation.getBuses();

    }
}
