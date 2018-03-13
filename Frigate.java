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
public class Frigate implements IsSeaVessel{
    
    
    String name;
    int passengers = 500;
    int speed = 16;
    int displacement = 2500;
    
    public Frigate(String name){
        
        this.name = name;
        
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
    public int getDisplacement() {
        return displacement;
    }

    @Override
    public void setDisplacement(int displacement) {
        this.displacement = displacement;}

    @Override
    public String launch() {
        return name+" is launching the Frigate!";
    }
    
    public String fireGun(){
        return "Firing Gun!";
    }
    
    @Override
    public String toString(){
        return "**Frigate Info**\n"+
                "Displacement: "+displacement+
                "\nMax Passengers: "+passengers+
                "\nMax Speed: "+speed;
    }

}
