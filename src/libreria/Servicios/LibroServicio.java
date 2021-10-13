
package libreria.Servicios;

import libreria.Entidades.Libro;
import libreria.persistencia.LibroDAO;


public class LibroServicio {
    LibroDAO librod=new LibroDAO();
    
    
  public void crearLibro(Libro libro) throws Exception
    {
    libro.setIsbn(libro.getIsbn());
    libro.setAño(libro.getAño());
    libro.setAutor(libro.getAutor());
    libro.setEditorial(libro.getEditorial());
    libro.setEjemplaresprestados(libro.getEjemplaresprestados());
    libro.setEjemplaresrestantes(libro.getEjemplaresrestantes());
    libro.setTitulo(libro.getTitulo());
    librod.crearLibro(libro);
    
    
}
    
    
    public Libro buscarPorTitulo(String titulo)
    {
        return librod.buscarLibroPorTitulo(titulo);
    }
    public Libro buscarPorIsbn(long isbn)
    {
        return librod.buscarPorISBN(isbn);
    }
    
}
