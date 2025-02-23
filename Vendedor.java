/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tt.clase.pkg4;

/**
 *
 * @author Soportedrai
 */
public class Vendedor extends Persona {
    private String codigo_vendedor;

    public Vendedor(String codigo_vendedor, String identificacion, String nombreCompleto, String direccion, String telefono) {
        super(identificacion, nombreCompleto, direccion, telefono);
        this.codigo_vendedor = codigo_vendedor;
    }

    public void setCodigo_vendedor(String codigo_vendedor) {
        this.codigo_vendedor = codigo_vendedor;
    }

    public String getCodigo_vendedor() {
        return codigo_vendedor;
    }

    @Override
    public String toString() {
        return "Hemos agregado al vendedor con codigo_vendedor=" + codigo_vendedor;
    }
    
    
}
