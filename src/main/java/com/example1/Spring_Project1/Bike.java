package com.example1.Spring_Project1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
    public int getTime(int distance){
        final int speed = 100;
        System.out.println("Traveller Using Bike to Travel");
        int time = distance/speed;
        return time;
    }
}
