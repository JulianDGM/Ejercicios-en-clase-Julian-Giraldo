package tt.clase.pkg4;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Soportedrai
 */
public class Concesionario {
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Venta> ventas;
    private Inventario inventario;
    // Contador estático para generar el código de cliente
    private static int contadorCliente = 1;
    
    public Concesionario(){
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario();
    }
    
        //Método para agregar clientes:
        public void agregarCliente(Cliente cliente){
            clientes.add(cliente);
        }
        
        public ArrayList<Cliente>getClientes(){
        return clientes;
    }
        //método para agregar vendedores:
        public void agregarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
        }
        //Método get para vendedores
        public ArrayList<Vendedor> getVendedores(){
            return vendedores;
        }
        //método para gestion de invetarios
        public void agregarVehiculo(Vehiculo vehiculo){
            inventario.agregarVehiculo(vehiculo);
        }
        public void eliminarVehiculo(Vehiculo vehiculo){
            inventario.eliminarVehiculo(vehiculo);
        }
        public ArrayList<Vehiculo> getInventario(){
            return inventario.getVehiculos();
        }
        //Gestión ventas:
        public void registrarVenta(Vendedor vendedor, Cliente cliente, Vehiculo vehiculo, String fecha_venta){
            Venta venta = new Venta(vendedor, cliente, vehiculo, fecha_venta);
            ventas.add(venta);
        }
        
    public static void main(String[] args){
    //Insstancia clases:
        Concesionario concesionario = new Concesionario();
        
        //Creamos el objeto Scanner para leer las entradas del usuario
        
        Scanner scanner = new Scanner(System.in);
        
        //Pedir información al Cliente:
        System.out.println("Ingrese el ID del Cliente: ");
        String idCliente = scanner.nextLine();
        System.out.println("Ingrese el nombre del Cliente: ");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingrese la direccion del Cliente: ");
        String direccionCliente = scanner.nextLine();
        System.out.println("Ingrese el telefono del Cliente: ");
        String telefonoCliente = scanner.nextLine();
        String codigoCliente = "C" + String.format("%03d", contadorCliente);
        contadorCliente++;
        Cliente cliente_2 = new Cliente(codigoCliente,idCliente,nombreCliente,direccionCliente,telefonoCliente);
        concesionario.agregarCliente(cliente_2);
        
        //Crear objetos Cliente, Vendedor y Vehiculo:
        
        Cliente cliente_1 = new Cliente("C001","100001","Juan Bedoya","Copacabana","3147652287");
        
        Vendedor vendedor_1 = new Vendedor("V001","200001","Edier Campo","Itagui","3245567423");
        
        Vehiculo vehiculo_1 = new Vehiculo("Ford","2024","Fiesta",300000000);
        
        //Agregar estos objetos a sus clases:
        concesionario.agregarCliente(cliente_1);
        concesionario.agregarVendedor(vendedor_1);
        concesionario.agregarVehiculo(vehiculo_1);
        
        //Registramos la venta:
        String fecha_venta = "2025/02/23";
        concesionario.registrarVenta(vendedor_1, cliente_1, vehiculo_1, fecha_venta);
        
        //Imprimimos el objeto concesionario:
        
        System.out.println(concesionario);
    }

    @Override
    public String toString() {
        return "El día de " + "el cliente" +clientes+ vendedores + ventas + inventario;
    }
}


