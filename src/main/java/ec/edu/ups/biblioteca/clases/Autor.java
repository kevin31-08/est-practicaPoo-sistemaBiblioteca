/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.util.Date;
import java.util.List;

/**
 *
 * @author katherine
 */
public class Autor extends Persona  {
    private String nacionalidad;
    private String generoLiterario;
    private String bibliografia;
    
    // Esto es por la relacion de autor y libros un autor tiene uno o muchos libros 
    private List<Libro>libros;

    public Autor() {
    }

    public Autor(String nacionalidad, String generoLiterario, String bibliografia, List libros, String cedula, String nombre, String apellido, String telefono, Date fechaNacimiento) {
        super(cedula, nombre, apellido, telefono, fechaNacimiento);
        this.nacionalidad = nacionalidad;
        this.generoLiterario = generoLiterario;
        this.bibliografia = bibliografia;
        this.libros = libros;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void listarObras(){
        for(Libro libro : libros ){
            System.out.println(libro.getTitulo());
        }
          
    }
    
    
    
    
    
}
