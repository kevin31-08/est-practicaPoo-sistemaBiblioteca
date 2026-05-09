/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.util.Date;

/**
 *
 * @author katherine
 */
class Bibliotecario extends Persona{
    private String codigo ;
    private String turno;
    private String cargo;

    public Bibliotecario() {
    }

    public Bibliotecario(String codigo, String turno, String cargo) {
        this.codigo = codigo;
        this.turno = turno;
        this.cargo = cargo;
    }

    public Bibliotecario(String codigo, String turno, String cargo, String cedula, String nombre, String apellido, String telefono, Date fechaNacimiento) {
        super(cedula, nombre, apellido, telefono, fechaNacimiento);
        this.codigo = codigo;
        this.turno = turno;
        this.cargo = cargo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void registrarPrestamo(Libro libro , Prestamo prestamo){
        prestamo.setFechaDevolucion(new Date());
        System.out.println("Devolucion registrada del libro: " + libro.getTitulo());
       
    }
    public void registrarDevolucion(Libro libro){
        System.out.println("Devolucion registrada del libro: " + libro.getTitulo());
    }
    
}
