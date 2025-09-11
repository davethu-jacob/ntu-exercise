package com.headfirst.ch12;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class FilteringElements {

    record Car(String type, String make, String model, Integer engineCapacity) {}

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("sedan", "BMW", "530", 1998),
                new Car("sedan", "Audi", "A5", 1998),
                new Car("sedan", "Mercedes", "E-Class", 2500),
                new Car("hatchback", "Skoda", "Octavia", 1600),
                new Car("hatchback", "Toyota", "TypeR", 1450)
        );

        List<Car> sedanCars = cars.stream().filter(car -> car.type.equals("sedan")).toList();
        List<Car> hatchBack = cars.stream().filter(car -> car.type.equals("hatchback")).toList();
        System.out.println(sedanCars);
        System.out.println(hatchBack);

        // Partitioning by
        Map<Boolean, List<Car>> partitionedCars = cars.stream().collect(partitioningBy(car -> car.type.equals("sedan")));
        System.out.println("Partitioned cars: " + partitionedCars);

        // (type, (make, engineCapacity))
        Map<String, Map<String, Integer>> groupedCars = cars.stream().collect(groupingBy(Car::type, toMap(Car::make, Car::engineCapacity)));
        System.out.println("Grouped cars: " + groupedCars);

        Stream<Integer> integerStream = Stream.of(10, 11, 12, 13, 14);
        Stream<Integer> filteredIntegerStream = integerStream.filter(i -> {
            System.out.println("Filtering integer");
            return i % 2 == 0;
        });
        System.out.println("Count = " + filteredIntegerStream.count());
    }
}
