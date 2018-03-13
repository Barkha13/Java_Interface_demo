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
public class Hovercraft implements IsLandVehicle,IsSeaVessel {
    
    int wheels = 4;
    String name;
    int passengers = 4;
    int speed = 50;
    int displacement = 500;
   
    public Hovercraft(String name){
        
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
        return name+ " is driving the Hovercraft!!";
    }

    @Override
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String launch() {
        return name+" is launching the HoverCraft!!";
    }
    
    public String enterLand(){
        return "Entering into the Land!";
    }
    public String enterSea(){
        return "Entering into the Sea!";
    }

    @Override
    public String toString(){
        return "**HoverCraft Info**\n"+
                "Displacement: "+displacement+
                "\nNo of Wheels: "+wheels+
                "\nMax Passengers: "+passengers+
                "\nMax Speed: "+speed;
    }
    
}
