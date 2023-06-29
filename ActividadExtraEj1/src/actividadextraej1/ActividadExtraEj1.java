/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadextraej1;

import Entidad.Vehiculo;

/**
 *
 * @author Lorenzo
 */
public class ActividadExtraEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Vehiculo v1 = new Vehiculo();
        
        v1.setMarca("Ford");
        v1.setModelo("Ka");
        v1.setAnio(2008);
        v1.setTipo("auto");
        
        Vehiculo v2 = new Vehiculo("Honda","Biz",2011,"moto");
        
         Vehiculo v3 = new Vehiculo("Venzo","X5",1991,"bicicleta");
        
        Vehiculo[] misVehiculos = {v1,v2,v3};
  
        int [] tiempos = {5,10,60};
        
        for (int i = 0; i < misVehiculos.length; i++) {
            
            misVehiculos[i].Moverse(tiempos[i]);
            
        }
        
        for (Vehiculo misVehiculo : misVehiculos) {
            
            System.out.println("Los metros avanzados fueron "+misVehiculo.getMtsAvanzados());
            
        }
                
        
        for (Vehiculo vehiculo : misVehiculos) {
            vehiculo.Moverse(5*60);
            vehiculo.Frenar();
        }
        
        for (Vehiculo misVehiculo : misVehiculos) {
            
            System.out.println("Los metros avanzados fueron "+misVehiculo.getMtsAvanzados());
            
        }
        
        
    }
    
}
