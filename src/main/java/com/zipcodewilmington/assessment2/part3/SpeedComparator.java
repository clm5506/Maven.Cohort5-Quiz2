package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
       // int ans = o1.getClass().toString().compareTo(o2.getClass().toString());
        //return o1.getSpeed()-o2.getSpeed();
        return o2.getSpeed()-o1.getSpeed();

    }
}
