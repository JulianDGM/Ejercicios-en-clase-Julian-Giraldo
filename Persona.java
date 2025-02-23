/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tt.clase.pkg4;

/**
 *
 * @author Soportedrai
 */
public abstract class Persona {
    private String identificacion;
    private String nombreCompleto;
    private String direccion;
    private String telefono;

    public Persona(String identificacion, String nombreCompleto, String direccion, String telefono) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    //Retorna el valor del objeto
    @Override
    public String toString() {
        return "Hemos agregado a la persona con " + "identificacion=" + identificacion + ", nombreCompleto=" + nombreCompleto + ", direccion=" + direccion + ", telefono=" + telefono;
    }
    
    
    
}
