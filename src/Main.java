import pojo.*;
import pojo.enums.TypeEngine;
import pojo.enums.TypeTruck;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Car> autoPark = new ArrayList<>();
        autoPark.add(new PassengerCar("Tesla", 250, 1500, TypeEngine.ELECTRIC, 5));
        autoPark.add(new PassengerCar("Tesla", 270, 1670, TypeEngine.ELECTRIC, 5));
        autoPark.add(new PassengerCar("Mercedes", 280, 1900, TypeEngine.PETROL, 5));
        autoPark.add(new PassengerCar("Mercedes", 260, 1800, TypeEngine.PETROL, 5));
        autoPark.add(new PassengerCar("Mercedes", 280, 1960, TypeEngine.DIESEL, 5));
        autoPark.add(new PassengerCar("Audi", 290, 1500, TypeEngine.PETROL, 2));
        autoPark.add(new Truck("Scania", 200, 3100, TypeEngine.PETROL, TypeTruck.DUMP_TRUCK, 3, 20000));
        autoPark.add(new Truck("Iveco", 180, 3000, TypeEngine.DIESEL, TypeTruck.DUMP_TRUCK, 3, 18000));
        autoPark.add(new Truck("Iveco", 170, 3120, TypeEngine.ELECTRIC, TypeTruck.TANKER_TRUCK, 3, 48000));
        autoPark.add(new Truck("Iveco", 170, 3230, TypeEngine.DIESEL, TypeTruck.DUMP_TRUCK, 3, 18000));
        autoPark.add(new Truck("Maz", 190, 3200, TypeEngine.DIESEL, TypeTruck.TRACTOR, 2, 35000));


        Map<Car, Integer> autoParkMap = new TreeMap<>();
        for (Car car : autoPark) {
            if (!autoParkMap.containsKey(car)) {
                autoParkMap.put(car, 1);
            } else {
                int value = autoParkMap.get(car);
                autoParkMap.put(car, ++value);
            }
        }

        Set<Map.Entry<Car, Integer>> entrySet = autoParkMap.entrySet();
        for (Map.Entry<Car, Integer> stringIntegerEntry : entrySet) {
            System.out.println(stringIntegerEntry.getKey().getClass().getSimpleName() + ": " + stringIntegerEntry.getKey().getModel() + " - " + stringIntegerEntry.getValue());
        }
    }
}
