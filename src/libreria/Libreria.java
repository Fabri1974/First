
package libreria;

import java.awt.Menu;
import java.util.List;
import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;
import libreria.Servicios.AutorServicio;
import libreria.Servicios.EditorialServicio;
import libreria.Servicios.LibroServicio;
import libreria.menu.menu;
import libreria.persistencia.LibroDAO;


public class Libreria {

   
    public static void main(String[] args) {
       
       menu menu=new menu();
       
      Libro libro1=new Libro(); 
       Autor autor=new Autor();
       EditorialServicio es=new EditorialServicio();
       AutorServicio as=new AutorServicio();
       LibroServicio ls=new LibroServicio();
       LibroDAO ld=new LibroDAO();
       ls.buscarPorIsbn(45454);
       autor=as.buscarAutorPorNombre("Asimov,Isaac");
       List<Libro> Listalibros=ld.MostrarLibros();
        for (int i = 0; i <Listalibros.size(); i++) {
            System.out.println(Listalibros.get(i));
            
        }
       libro1=ls.buscarPorTitulo("Cronicas Marcianas");
        
            
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getEjemplaresprestados());
        System.out.println(autor);
      Editorial editorial=new Editorial();
      editorial=es.buscarporNombre("minotauro");
        System.out.println(editorial.getNombre());
       menu.crearLibro(libro1);
       ld.mostrarUltimo();
    }
    
}
