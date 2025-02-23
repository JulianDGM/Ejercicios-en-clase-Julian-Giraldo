/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tt.clase.pkg4;

/**
 *
 * @author Soportedrai
 */
public class Cliente extends Persona {
    
    private String codigo_cliente;

    public Cliente(String codigo_cliente, String identificacion, String nombreCompleto, String direccion, String telefono) {
        super(identificacion, nombreCompleto, direccion, telefono);
        this.codigo_cliente = codigo_cliente;
    }

    public void setCodigo_cliente(String codigo_cliente) {
        this.codigo_cliente = codigo_cliente;
    }

    public String getCodigo_cliente() {
        return codigo_cliente;
    }

    @Override
    public String toString() {
        return "Hemos agregado un cliente con codigo_cliente=" + codigo_cliente;
    }
    
}
