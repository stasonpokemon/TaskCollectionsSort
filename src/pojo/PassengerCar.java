package pojo;

import pojo.enums.TypeEngine;

public class PassengerCar extends Car {

    private int numOfSeats;

    public PassengerCar(String model, int maxSpeed, double weight, TypeEngine typeEngine, int numOfSeats) {
        super(model, maxSpeed, weight, typeEngine);
        if (numOfSeats > 9){
//            Тут должен быть собственный эксепшн
        }
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

}
