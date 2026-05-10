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
public class Prestamo {
    private Date fechaSalida;
    private Date fechaDevolucion;
    private Date fechaLimite;
    
    
    private Bibliotecario bibliotecario;
    private Usuario usuario;
    
    // aqui se hace la asigno asignacion entre libro y prestamo 
    private  List<Libro> libros;

    public Prestamo() {
    }

    public Prestamo(Date fechaSalida, Date fechaDevolucion, Date fechaLimite, Bibliotecario bibliotecario, Usuario usuario, List<Libro> libros) {
        this.fechaSalida = fechaSalida;
        this.fechaDevolucion = fechaDevolucion;
        this.fechaLimite = fechaLimite;
        this.bibliotecario = bibliotecario;
        this.usuario = usuario;
        this.libros = libros;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    
    // lo mismo si agregamos una condicion para no salga error en el programa pq al utilizar autor si este es nulo va a salir error 
    public String crearPrestamo(List<Libro> libros){
        
        if (usuario != null && libros != null){
            return "Prestamo creado correctamente para: " + usuario.getNombre();
        }
        return "Prestamo creado, pero sin usuario asignado";
    }
    

    
}
