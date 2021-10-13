
package libreria.Entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Libro implements Serializable {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    
    private long isbn;
    private String titulo;
    private int año;
    private int ejemplares;
    private int ejemplaresprestados;
    private int ejemplaresrestantes;
    private boolean alta;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;

    public Libro() {
    }

    public Libro(long isbn, String titulo, int año, int ejemplares, int ejemplaresprestados, int ejemplaresrestantes, boolean alta, Autor autor, Editorial editorial) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.año = año;
        this.ejemplares = ejemplares;
        this.ejemplaresprestados = ejemplaresprestados;
        this.ejemplaresrestantes = ejemplaresrestantes;
        this.alta = alta;
        this.autor = autor;
        this.editorial = editorial;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresprestados() {
        return ejemplaresprestados;
    }

    public void setEjemplaresprestados(int ejemplaresprestados) {
        this.ejemplaresprestados = ejemplaresprestados;
    }

    public int getEjemplaresrestantes() {
        return ejemplaresrestantes;
    }

    public void setEjemplaresrestantes(int ejemplaresrestantes) {
        this.ejemplaresrestantes = ejemplaresrestantes;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", a\u00f1o=" + año + ", ejemplares=" + ejemplares + ", ejemplaresprestados=" + ejemplaresprestados + ", ejemplaresrestantes=" + ejemplaresrestantes + ", alta=" + alta + ", autor=" + autor + ", editorial=" + editorial + '}';
    }

   
    
    
    
    
    
}
