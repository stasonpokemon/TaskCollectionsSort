package pojo;

import pojo.enums.TypeEngine;
import pojo.enums.TypeTruck;

public class Truck extends Car {
    private TypeTruck typeTruck;
    private int numOfAxes;
    private double loadCapacity;

    public Truck(String model, int maxSpeed, double weight, TypeEngine typeEngine, TypeTruck typeTruck, int numOfAxes, double loadCapacity) {
        super(model, maxSpeed, weight, typeEngine);
        this.typeTruck = typeTruck;
        this.numOfAxes = numOfAxes;
        this.loadCapacity = loadCapacity;
    }

    public TypeTruck getTypeTruck() {
        return typeTruck;
    }

    public void setTypeTruck(TypeTruck typeTruck) {
        this.typeTruck = typeTruck;
    }

    public int getNumOfAxes() {
        return numOfAxes;
    }

    public void setNumOfAxes(int numOfAxes) {
        this.numOfAxes = numOfAxes;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
