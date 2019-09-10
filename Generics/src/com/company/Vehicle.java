package com.company;

public class Vehicle<T> {
    public Vehicle(T t) {
        this.t = t;
    }

    T t;

    public void drive() {
        System.out.println(t.toString() + " driving");
    }
}
