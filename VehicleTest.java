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
public class VehicleTest {
    
    public static void main(String[] args){
        
        IsVehicle[] vehicles = new IsVehicle[3];
        
        vehicles[0] = new Jeep("Bob");
        vehicles[1] = new Hovercraft("Jack");
        vehicles[2] = new Frigate("Mike");
        
        for(int i = 0; i< vehicles.length; i++){
            
            if (vehicles[i] instanceof IsLandVehicle && vehicles[i] instanceof IsSeaVessel){
                IsLandVehicle l = (IsLandVehicle)vehicles[i];
                IsSeaVessel s = (IsSeaVessel)vehicles[i];
                System.out.println(vehicles[i]);
                System.out.println(l.drive());
                System.out.println(s.launch());
                
            }
            else if(vehicles[i] instanceof IsLandVehicle){
                IsLandVehicle l = (IsLandVehicle)vehicles[i];
                System.out.println(vehicles[i]);
                System.out.println(l.drive());
            }
            else if(vehicles[i] instanceof IsSeaVessel){
                    IsSeaVessel s = (IsSeaVessel)vehicles[i];
                    System.out.println(vehicles[i]);
                    System.out.println(s.launch());
                 }
        }
    }
    
}
