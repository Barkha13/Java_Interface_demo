/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacedemo;

/**
 *
 * @author amipatel
 */
public class Jeep implements IsLandVehicle {
    
    int wheels = 4;
    String name;
    int passengers = 5;
    int speed = 250;
    
    public Jeep(String name){
        this.name = name;
    }

    @Override
    public int getNumWheels() {
        return wheels;
    }

    @Override
    public void setNumWheels(int wheels) {
        this.wheels = wheels;
    }
    
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getMaxPassengers() {
        return passengers;
    }

    @Override
    public void setMaxPassengers(int passenger) {
        this.passengers = passengers;
    }

    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public void setMaxSpeed(int speed) {
        this.speed = speed;
    }
   
    @Override
    public String drive() {
        return name+" is driving the Jeep!!";
    }
    
    public String soundHorn(){
        return "Jeep is Honking!!";
    }

    @Override
    public String toString(){
        return "**Jeep Info**\n"+
                "No of Wheels: "+wheels+
                "\nMax Passengers: "+passengers+
                "\nMax Speed: "+speed;
    }
}
