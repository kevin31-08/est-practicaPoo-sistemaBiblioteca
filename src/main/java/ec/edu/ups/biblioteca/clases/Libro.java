/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.biblioteca.clases;

/**
 *
 * @author katherine
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String editorial;
    private String anioPublicacion;

    private Autor autor;

    public Libro() {
    }

    public Libro(String isbn, String titulo, String editorial, String anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean verificarDisponibilidad() {
        return true;
    }

    public void mostarInformacion() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Titulo: " + titulo);
        System.out.println("Editorial: " + editorial);
        System.out.println("Año de publicacion: " + anioPublicacion);
        // Muestra el autor : como tenemos un atributo autor en esta clase, esto significa que puede tener un objeto Autor o puede ser nulo , si este es null habra un error en el programa porque no puedes utilizar algp que no existe.
        if (autor != null) {
            System.out.println("Autor: " + autor.getNombre() + autor.getApellido());
        }

    }

}
