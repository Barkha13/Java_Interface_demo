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

public interface IsVehicle{
    public abstract String getName();
    public abstract void setName(String name);
    public abstract int getMaxPassengers();
    public abstract void setMaxPassengers(int passengers);
    public abstract int getMaxSpeed();
    public abstract void setMaxSpeed(int speed);
    
}
interface IsSeaVessel extends IsVehicle {
    
    public abstract int getDisplacement();
    public abstract void setDisplacement(int displacement);
    public abstract String launch();
}

interface IsLandVehicle extends IsVehicle {
    public abstract int getNumWheels();
    public abstract void setNumWheels(int wheels);
    public abstract String drive();
}
