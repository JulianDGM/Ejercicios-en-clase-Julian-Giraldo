/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Soportedrai
 */
public class Libro {
    // Atributos de la clase:
    private String titulo;
    private String autor;
    private String ISBN;
    
    // Constructor:
    public Libro(String titulo, String autor, String ISBN){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }
    
    // Métodos getters
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public String getISBN(){
        return ISBN;
    }
    
    // Método toString para mostrar la información del libro
    @Override
    public String toString() {
        return "Hemos registrado los siguientes libros"+ "\ntitulo:" + titulo + ", autor: " + autor + "\nISBN: " + ISBN;
    }
    
    
}
