/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.menu;

import javax.swing.JOptionPane;
import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;
import libreria.Servicios.AutorServicio;
import libreria.Servicios.EditorialServicio;
import libreria.Servicios.LibroServicio;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author FabricioPc
 */
public class menu {
    
    private int isbn;
    private int ejemplares;
    private int ejemplaresprestados;
    private int ejemplaresrestantes;
    private int año;
    private String autor;
  
    private String titulo;
    private String editorial;

    public menu() {
         Libro libro1=new Libro(); 
       Autor autor=new Autor();
       EditorialServicio es=new EditorialServicio();
       AutorServicio as=new AutorServicio();
       LibroServicio ls=new LibroServicio();
       LibroDAO ld=new LibroDAO();
    }
    
    public Libro crearLibro(Libro lib)
    {   Editorial ed=new Editorial();
        Autor au=new Autor();
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el isbn"));
        lib.setIsbn(isbn);
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ejemplares"));
        lib.setEjemplares(ejemplares);
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ejemplares prestados"));
        lib.setEjemplaresprestados(ejemplaresprestados);
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ejemplares restantes"));
        lib.setEjemplaresrestantes(ejemplaresrestantes);
        JOptionPane.showInputDialog("Ingrese el nombre del autor");
        
        au.setNombre(autor);
        JOptionPane.showInputDialog("Ingrese el nombre del libro");
        lib.setTitulo(titulo);
        JOptionPane.showInputDialog("Ingrese el nombre de la editorial");
        ed.setNombre(editorial);
        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año"));
        lib.setAño(año);
        return lib;
    }
    public void inicializar()
    {
        Libro libro1=new Libro(); 
       Autor autor=new Autor();
       EditorialServicio es=new EditorialServicio();
       AutorServicio as=new AutorServicio();
       LibroServicio ls=new LibroServicio();
       LibroDAO ld=new LibroDAO();
    }
    
}
