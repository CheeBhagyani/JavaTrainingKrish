package lk.chee.encap;

import java.util.ArrayList;

public class BusStation {
    public BusStation() {
    }

    private ArrayList<Bus> buses = new ArrayList<>();

//    public ArrayList<Bus> getBuses() {
//        return buses;
//    }

    //3rd level
    public void getBuses() {
        for(Bus bus: buses) {
            validate(bus.getColour());
            System.out.println(bus.getColour());
        }
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public BusStation(String color) {
        buses.add(new Bus(color));
    }

    public void addBuses(String color) {
        buses.add(new Bus(color));
    }

    public void addBuses(Bus bus) {
        buses.add(bus);
    }

    //3rd level of encap
    public void validate(String color) {
        new Object() {
            public void colorValidate () {
                if ("Green".equalsIgnoreCase(color)) {
                    System.out.println("valid");
                } else {
                    System.out.println("invalid");
                }
            }
        }.colorValidate();
    }

//    static  {
//        buses = new ArrayList<>();
//        buses.add(new Bus("Red"));
//        buses.add(new Bus("Green"));
//        buses.add(new Bus("White"));
//        buses.add(new Bus("Blue"));
//        buses.add(new Bus("Pink"));
//    }

    //second level encapsulation by creating a member class
    class Bus {

        public Bus() {
        }

        private String colour;

        public String getColour() {
            return colour;
        }

        public void setColour(String colour) {
            this.colour = colour;
        }

        public Bus(String colour) {
            this.colour = colour;
        }

        @Override
        public String toString() {
            return "Bus{" +
                    "colour='" + colour + '\'' +
                    '}';
        }
    }
}

//how does the array list get resized? how does its size increased dynamically?
