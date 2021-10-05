package com.example1.Spring_Project1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
final int speed = 80;
    public int getTime(int distance){
        System.out.println("Traveller is using Car to Travel ");
        int time = distance/speed;
    return time;
}
}
