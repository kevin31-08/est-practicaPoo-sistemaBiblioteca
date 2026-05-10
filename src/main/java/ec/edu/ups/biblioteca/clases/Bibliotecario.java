/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Bibliotecario extends Persona {

    private String codigo;
    private String turno;
    private String cargo;

    public Bibliotecario(String cedula, String nombre, String apellido, String telefono, Date fNacimiento, String codigo1, String turno1, String cargo1) {
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

    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += "\nCodigo: " + codigo + "\nTurno: " + turno + "\nCargo: " + cargo + "\n";
        return resultado;
    }

    public void registrarDevolucion(Prestamo prestamo) {
    if (prestamo != null) {
        prestamo.setFechaDevolucion(new Date());
        System.out.println("Devolucion registrada por: " + codigo);
    } else {
        System.out.println("Prestamo no valido");
    }
}

}
