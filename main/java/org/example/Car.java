package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class Car {
    private int id;
    private String model;
    private int engine;

//    private Car() {
//    }

    public static Car createNewCar () {
        return new Car();
    }

}
