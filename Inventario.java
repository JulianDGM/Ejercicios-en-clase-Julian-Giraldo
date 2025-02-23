/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tt.clase.pkg4;
import java.util.ArrayList;
/**
 *
 * @author Soportedrai
 */
public class Inventario {
    private ArrayList<Vehiculo> vehiculos;
    
    //Constructor:
    public Inventario(){
        this.vehiculos= new ArrayList<>();
    }
    
    //Metodo para agregar vehiculo:
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    //Método para eliminar vehículo:
    public void eliminarVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }
    
    //Getter:

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    @Override
    public String toString() {
        return "Se ha agregado al inventario el vehiculo" + vehiculos;
    }
    
    
}
