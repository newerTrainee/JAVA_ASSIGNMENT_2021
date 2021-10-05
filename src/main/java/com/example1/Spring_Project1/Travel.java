package com.example1.Spring_Project1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

interface Vehicle{
int getTime(int distance);
}

@Component
public class Travel {
@Autowired
 private Vehicle vehicle;
 public Travel(Vehicle vehicle){
  super();
  this.vehicle = vehicle;
 }
 public void travel_Info(int distance){
int time = vehicle.getTime(distance);
  System.out.println("Time by the vehicle: "+time);
 }
 }

