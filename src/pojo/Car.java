package pojo;

import pojo.enums.TypeEngine;

import java.util.Objects;

public abstract class Car implements Comparable<Car>  {

    private String model;
    private int maxSpeed;
    private double weight;
    private TypeEngine typeEngine;

    public Car(String model, int maxSpeed, double weight, TypeEngine typeEngine) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.typeEngine = typeEngine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public TypeEngine getTypeEngine() {
        return typeEngine;
    }

    public void setTypeEngine(TypeEngine typeEngine) {
        this.typeEngine = typeEngine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed && Double.compare(car.weight, weight) == 0 && Objects.equals(model, car.model) && typeEngine == car.typeEngine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, weight, typeEngine);
    }


    @Override
    public int compareTo(Car o) {
        int result = getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        if (result == 0){
            result = model.compareTo(o.getModel());
        }
        return result;
    }
}
