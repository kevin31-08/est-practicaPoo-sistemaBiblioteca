/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author katherine
 */
public class Usuario extends Persona  {
    private String correoElectronico;
    private String direccion;
    
    
    // composicion entre usuario y prestamo instancia al prestamo 
    private List<Prestamo> prestamos;
    

    public Usuario() {
        this.prestamos = new ArrayList<>();
    }

    public Usuario(String correoElectronico, String direccion, String cedula, String nombre, String apellido, String telefono, Date fechaNacimiento) {
        super(cedula, nombre, apellido, telefono, fechaNacimiento);
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.prestamos = new ArrayList<>();
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void socilitarPrestamo(){
        System.out.println("Prestamo salicitado");
        
    }
    public void devolucionLibro(){
        System.out.println("Libro devuelto");
        
    }
    
    // como tenemos la composiscion aqui se agrega el prestamo por eso este metodo
    
    
    public Prestamo crearPrestamo(Date fechaSalida,Date fechaLimite,Bibliotecario bibliotecario, List<Libro> libros ){
        Prestamo prestamo = new Prestamo (fechaSalida , null, fechaLimite,bibliotecario,this,libros );
    
    prestamos.add(prestamo);
    
    return prestamo;
    }
    public List<Prestamo> getprestamos(){
        return prestamos;
    }

    
    
}
