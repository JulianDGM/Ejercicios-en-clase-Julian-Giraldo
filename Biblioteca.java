/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;
import java.util.ArrayList;
/**
 *
 * @author JulianG
 */
public class Biblioteca {
    // Usamos una lista para almacenar los libros y agregar, eliminar ver todos y buscar:
    private ArrayList<Libro> libros;
    
    //Constructor
    
    public Biblioteca(){
        libros = new ArrayList<>();
    }
    
    //Método para agregar un libro:
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro agregado exitosamente");
    }
    
    //Método para eliminar un libro por ISBN
    public void eliminarLibro(String ISBN){
        for(Libro libro : libros){
            if (libro.getISBN().equals(ISBN)){
                libros.remove(libro);
                System.out.println("Libro eliminado");
                return;
            }
        }
        System.out.println("Libro con ISBN "+ISBN+" no encontrado");
    }
    
    //Método para ver todos los libros
    public void verTodosLosLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros en la biblioteca");
        } else {
            for(Libro libro: libros){
                System.out.println(libro);
            }
        }
    }
    
    //Método para buscar libros por titulo o autor:
    
    public void buscarLibro(String query){
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(query.toLowerCase()) ||
                libro.getAutor().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        
         if (!encontrado) {
            System.out.println("No se encontraron libros que coincidan con la búsqueda.");
            
    }        
}
