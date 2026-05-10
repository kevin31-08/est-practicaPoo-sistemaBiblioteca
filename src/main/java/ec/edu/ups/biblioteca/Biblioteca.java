package ec.edu.ups.biblioteca;

import java.util.Date;
import java.util.Scanner;
import ec.edu.ups.biblioteca.clases.Autor;
import ec.edu.ups.biblioteca.clases.Bibliotecario;
import ec.edu.ups.biblioteca.clases.Libro;
import ec.edu.ups.biblioteca.clases.Prestamo;
import ec.edu.ups.biblioteca.clases.Usuario;
import java.util.ArrayList;

public class Biblioteca {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Autor> autores = new ArrayList<>();
        ArrayList<Libro> libros = new ArrayList<>();
        ArrayList<Bibliotecario> bibliotecarios = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\nINICIANDO EL SISTEMA DE BIBLIOTECA\n");
            System.out.println("1. Autor ");
            System.out.println("2. Libro ");
            System.out.println("3. Bibliotecario ");
            System.out.println("4. Usuario ");
            System.out.println("5. Devolucion ");
            System.out.println("6. Salir ");

            System.out.print("\nElija una opcion del 1 al 6: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {

                case 1: {

                    do {

                        System.out.println("\nMENU AUTOR\n");
                        System.out.println("1. Ingresar Autor. ");
                        System.out.println("2. Mostrar Infromacion del autor.");
                        System.out.println("3. Volver");

                        System.out.print("Selecione una opcion. ");
                        opcion = entrada.nextInt();
                        entrada.nextLine();

                        switch (opcion) {

                            case 1: {
                                System.out.println("\nREGISTRAR AUTOR \n");

                                System.out.print("Ingrese el numero de cedula: ");
                                String cedula = entrada.nextLine();

                                System.out.print("Ingrese el nombre: ");
                                String nombre = entrada.nextLine();

                                System.out.print("Ingrese el apellido: ");
                                String apellido = entrada.nextLine();

                                System.out.print("Ingrese el numero de telefono: ");
                                String telefono = entrada.nextLine();

                                System.out.print("Ingrese el dia de nacimiento: ");
                                int dia = entrada.nextInt();

                                System.out.print("Ingrese el mes de nacimiento: ");
                                int mes = entrada.nextInt();

                                System.out.print("Ingrese el año de nacimiento: ");
                                int anio = entrada.nextInt();
                                entrada.nextLine();

                                java.util.Date fNacimiento
                                        = new java.util.Date(anio - 1900, mes - 1, dia);

                                System.out.print("Ingrese la nacionalidad: ");
                                String nacionalidad = entrada.nextLine();

                                System.out.print("Ingrese el genero literario: ");
                                String generoLiterario = entrada.nextLine();

                                System.out.print("Ingrese una pequeña bibliografia: ");
                                String bibliografia = entrada.nextLine();

                                Autor autor = new Autor(cedula, nombre, apellido, telefono, fNacimiento, nacionalidad, generoLiterario, bibliografia);
                                autores.add(autor);

                                System.out.println("Se guardo su autor :) ");
                                break;
                            }

                            case 2: {
                                if (!autores.isEmpty()) {
                                    System.out.println("\nTUS AUTORES REGISTRADOS");
                                    for (Autor autor : autores) {
                                        System.out.println(autor);
                                    }
                                } else {
                                    System.out.println("\nNo existen autores registrados. ");
                                }
                                break;
                            }

                            case 3: {
                                System.out.println("\nVolviendo...:)");
                                break;
                            }

                        }

                    } while (opcion != 3);

                }
                break;

                case 2: {

                    do {

                        System.out.println("\nMENU LIBRO\n");
                        System.out.println("1. Ingresar libro.");
                        System.out.println("2. Mostrar Infromacion del libro.");
                        System.out.println("3. Volver.");

                        System.out.print("Selecione una opcion: ");
                        opcion = entrada.nextInt();
                        entrada.nextLine();

                        switch (opcion) {

                            case 1: {
                                System.out.println("\nREGISTRAR LIBRO \n");

                                if (!autores.isEmpty()) {

                                    System.out.print("Ingrese el ISBN del libro: ");
                                    String isbn = entrada.nextLine();

                                    System.out.print("Ingrese el titulo: ");
                                    String titulo = entrada.nextLine();

                                    System.out.print("Ingrese la editorial: ");
                                    String editorial = entrada.nextLine();

                                    System.out.print("Ingrese el año de publicacion: ");
                                    String anioPublicacion = entrada.nextLine();

                                    Libro libro = new Libro(isbn, titulo, editorial, anioPublicacion);

                                    boolean fueAutorEncontrado = false;

                                    do {

                                        System.out.println("Ingrese la cedula del autor: ");
                                        String cedulaBuscada = entrada.nextLine();

                                        for (Autor autorEncontrado : autores) {
                                            if (autorEncontrado.getCedula().equals(cedulaBuscada)) {
                                                libro.setAutor(autorEncontrado);
                                                fueAutorEncontrado = true;
                                                break;
                                            }
                                        }

                                        if (!fueAutorEncontrado) {
                                            System.out.println("No se encontro al autor");
                                        }

                                    } while (!fueAutorEncontrado);

                                    libros.add(libro);
                                    System.out.println("Se guardo su libro");

                                } else {
                                    System.out.println("No existen autores registrados");
                                }
                                break;
                            }

                            case 2: {
                                if (!libros.isEmpty()) {
                                    System.out.println("\nTUS LIBROS REGISTRADOS");
                                    for (Libro libro : libros) {
                                        System.out.println(libro);
                                    }
                                } else {
                                    System.out.println("\nNo existen libros registrados.");
                                }
                                break;
                            }

                            case 3: {
                                System.out.println("\nVolviendo...");
                                break;
                            }
                        }

                    } while (opcion != 3);

                }
                break;

                case 3: {

                    do {

                        System.out.println("\nMENU BIBLIOTECARIO.\n");
                        System.out.println("1. Ingresar Bibliotecario.");
                        System.out.println("2. Mostrar Informacion");
                        System.out.println("3. Volver.");

                        System.out.print("Seleccione una opcion: ");
                        opcion = entrada.nextInt();
                        entrada.nextLine();

                        switch (opcion) {

                            case 1: {
                                System.out.println("\nREGISTRAR BIBLIOTECARIO \n");

                                System.out.print("Ingrese el numero de cedula: ");
                                String cedula = entrada.nextLine();

                                System.out.print("Ingrese el nombre: ");
                                String nombre = entrada.nextLine();

                                System.out.print("Ingrese el apellido: ");
                                String apellido = entrada.nextLine();

                                System.out.print("Ingrese el numero de telefono: ");
                                String telefono = entrada.nextLine();

                                System.out.print("Ingrese el dia de nacimiento: ");
                                int dia = entrada.nextInt();

                                System.out.print("Ingrese el mes de nacimiento: ");
                                int mes = entrada.nextInt();

                                System.out.print("Ingrese el año de nacimiento: ");
                                int anio = entrada.nextInt();
                                entrada.nextLine();

                                java.util.Date fNacimiento = new java.util.Date(anio - 1900, mes - 1, dia);

                                System.out.print("Ingrese el codigo del empleado: ");
                                String codigo = entrada.nextLine();

                                System.out.print("Ingrese el turno del empleado: ");
                                String turno = entrada.nextLine();

                                System.out.print("Ingrese cargo del empleado: ");
                                String cargo = entrada.nextLine();

                                Bibliotecario bibliotecario = new Bibliotecario(cedula, nombre, apellido, telefono, fNacimiento, codigo, turno, cargo);
                                bibliotecarios.add(bibliotecario);

                                System.out.println("Se guardo su bibliotecario :) ");
                                break;
                            }

                            case 2: {
                                if (!bibliotecarios.isEmpty()) {
                                    System.out.println("\nTUS BIBLIOTECARIOS REGISTRADOS");
                                    for (Bibliotecario bibliotecario : bibliotecarios) {
                                        System.out.println(bibliotecario);
                                    }
                                } else {
                                    System.out.println("\nNo existe bibliotecario.");
                                }
                                break;
                            }

                            case 3: {
                                System.out.println("\nVolviendo...");
                                break;
                            }
                        }

                    } while (opcion != 3);

                }
                break;

                case 4: {

                    do {

                        System.out.println("\nMENU USUARIO.\n");
                        System.out.println("1. Ingresar Usuario.");
                        System.out.println("2. Solicitar Prestamo.");
                        System.out.println("3. Mostrar Infromacion del usuario");
                        System.out.println("4. Volver. ");

                        System.out.print("Selecione una opcion. ");
                        opcion = entrada.nextInt();
                        entrada.nextLine();

                        switch (opcion) {

                            case 1: {
                                System.out.println("\nREGISTRAR USUARIO \n");

                                System.out.print("Ingrese el numero de cedula: ");
                                String cedula = entrada.nextLine();

                                System.out.print("Ingrese el nombre: ");
                                String nombre = entrada.nextLine();

                                System.out.print("Ingrese el apellido: ");
                                String apellido = entrada.nextLine();

                                System.out.print("Ingrese telefono: ");
                                String telefono = entrada.nextLine();

                                System.out.print("Ingrese el dia de nacimiento: ");
                                int dia = entrada.nextInt();

                                System.out.print("Ingrese el mes de nacimiento: ");
                                int mes = entrada.nextInt();

                                System.out.print("Ingrese el año de nacimiento: ");
                                int anio = entrada.nextInt();
                                entrada.nextLine();

                                java.util.Date fNacimiento
                                        = new java.util.Date(anio - 1900, mes - 1, dia);

                                System.out.print("Ingrese el correo electronico: ");
                                String correo = entrada.nextLine();

                                System.out.print("Ingrese la direccion: ");
                                String direccion = entrada.nextLine();

                                Usuario usuario = new Usuario(
                                        cedula,
                                        nombre,
                                        apellido,
                                        telefono,
                                        fNacimiento,
                                        correo,
                                        direccion
                                );

                                usuarios.add(usuario);

                                System.out.println("\nUsuario registrado correctamente.");
                                break;
                            }

                            case 2: {
                                System.out.println("\n Solicitar Prestamo \n");

                                System.out.println("\n Solicitar Prestamo \n");

                                System.out.print("Ingrese cedula del usuario: ");
                                String cusuario = entrada.nextLine();

                                System.out.print("Ingrese cedula bibliotecario: ");
                                String cbibliotecario = entrada.nextLine();

                                System.out.print("ISBN del libro: ");
                                String isbn = entrada.nextLine();

                                Usuario usuarioEncontrado = null;
                                Bibliotecario bibliotecarioEncontrado = null;
                                Libro libroEncontrado = null;

// BUSCAR USUARIO
                                for (Usuario usua : usuarios) {
                                    if (usua.getCedula().equals(cusuario)) {
                                        usuarioEncontrado = usua;
                                        break;
                                    }
                                }

// BUSCAR BIBLIOTECARIO
                                for (Bibliotecario bibli : bibliotecarios) {
                                    if (bibli.getCedula().equals(cbibliotecario)) {
                                        bibliotecarioEncontrado = bibli;
                                        break;
                                    }
                                }

// BUSCAR LIBRO
                                for (Libro lib : libros) {
                                    if (lib.getIsbn().equals(isbn)) {
                                        libroEncontrado = lib;
                                        break;
                                    }
                                }

// VALIDACIÓN DETALLADA
                                if (usuarioEncontrado == null) {
                                    System.out.println("Usuario no encontrado");
                                }

                                if (bibliotecarioEncontrado == null) {
                                    System.out.println("Bibliotecario no encontrado");
                                }

                                if (libroEncontrado == null) {
                                    System.out.println("Libro no encontrado");
                                }

// CREAR PRÉSTAMO SOLO SI TODO EXISTE
                                if (usuarioEncontrado != null
                                        && bibliotecarioEncontrado != null
                                        && libroEncontrado != null) {

                                    ArrayList<Libro> listaLibros = new ArrayList<>();
                                    listaLibros.add(libroEncontrado);

                                    Date fechaSalida = new Date();
                                    Date fechaLimite = new Date(fechaSalida.getTime() + (7L * 24 * 60 * 60 * 1000));

                                    Prestamo prestamo = usuarioEncontrado.crearPrestamo(
                                            fechaSalida,
                                            fechaLimite,
                                            bibliotecarioEncontrado,
                                            listaLibros
                                    );

                                    System.out.println("Préstamo creado correctamente");
                                }
                            }

                            case 4: {
                                System.out.println("\nVolviendo...:)");
                                break;
                            }
                        }

                    } while (opcion != 4);

                }
                break;

                case 5: {

                    System.out.println("\n REGISTRAR DEVOLUCION \n");

                    System.out.print("Ingrese cedula del usuario: ");
                    String cedulaUsuario = entrada.nextLine();

                    System.out.print("Ingrese codigo del bibliotecario: ");
                    String codigoBibliotecario = entrada.nextLine();

                    System.out.print("Ingrese ISBN del libro: ");
                    String isbn = entrada.nextLine();

                    Usuario usuarioEncontrado = null;
                    Bibliotecario bibliotecarioEncontrado = null;
                    Prestamo prestamoEncontrado = null;

// buscar usuario
                    for (Usuario u : usuarios) {
                        if (u.getCedula().equals(cedulaUsuario)) {
                            usuarioEncontrado = u;
                            break;
                        }
                    }

// buscar bibliotecario
                    for (Bibliotecario b : bibliotecarios) {
                        if (b.getCodigo().equals(codigoBibliotecario)) {
                            bibliotecarioEncontrado = b;
                            break;
                        }
                    }

// buscar prestamo dentro del usuario (COMPOSICIÓN)
                    if (usuarioEncontrado != null) {
                        for (Prestamo p : usuarioEncontrado.getprestamos()) {
                            for (Libro l : p.getLibros()) {
                                if (l.getIsbn().equals(isbn)) {
                                    prestamoEncontrado = p;
                                    break;
                                }
                            }
                            if (prestamoEncontrado != null) {
                                break;
                            }
                        }
                    }

// validar y ejecutar devolución
                    if (bibliotecarioEncontrado != null && prestamoEncontrado != null) {

                        bibliotecarioEncontrado.registrarDevolucion(prestamoEncontrado);

                        System.out.println("\nDevolucion registrada correctamente");

                    } else {
                        System.out.println("\nNo se encontro usuario, bibliotecario o prestamo");
                    }

                    break;
                }

            }

        } while (opcion != 6);
    }
}
