package ec.edu.ups.biblioteca.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario extends Persona {

    private String correoElectronico;
    private String direccion;

    // composicion entre usuario y prestamo
    private List<Prestamo> prestamos;

    public Usuario(String cedula,
                   String nombre,
                   String apellido,
                   String telefono,
                   Date fNacimiento,
                   String correo,
                   String direccion) {

        super(cedula, nombre, apellido, telefono, fNacimiento);

        this.correoElectronico = correo;
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

    public Prestamo crearPrestamo(Date fechaSalida,
                                  Date fechaLimite,
                                  Bibliotecario bibliotecario,
                                  List<Libro> libros) {

        Prestamo prestamo = new Prestamo(
                fechaSalida,
                null,
                fechaLimite,
                bibliotecario,
                this,
                libros
        );

        prestamos.add(prestamo);

        return prestamo;
    }

    public List<Prestamo> getprestamos() {
        return prestamos;
    }

    @Override
    public String toString() {

        String resultado = super.toString();

        resultado += "\nCorreoElectronico: " + correoElectronico
                + "\nDireccion: " + direccion + "\n";

        return resultado;
    }
}