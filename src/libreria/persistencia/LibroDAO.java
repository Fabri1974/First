
package libreria.persistencia;

import java.util.List;
import libreria.Entidades.Libro;


public class LibroDAO extends DAO{
    public void crearLibro(Libro libro) throws Exception
    {  
        try{
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al insertar el libro");
    }
    }
    public void modificarLibro(Libro libro) throws Exception
    {
         try{
        em.getTransaction().begin();
        em.merge(libro);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al  modificar el libro");
    }
    }
    public void eliminarLibro(Libro libro) throws Exception
    {
         try{
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al borrar el libro");
    }
    }
    public Libro buscarPorISBN(long isbn)
    {
        return em.find(Libro.class, isbn);
    }
    public Libro buscarLibroPorTitulo(String titulo)
    {
        return (Libro) em.createQuery("SELECT l from Libro l where l.titulo= :titulo").setParameter("titulo", titulo).getSingleResult();
                
                
                
    }
    public List<Libro> MostrarLibros()
    {
        return  em.createQuery("SELECT l from Libro l ").getResultList();
                
                
                
    }
    public int mostrarUltimo()
    {
        return(int) em.createQuery("SELECT MAX(id) from libro l").getMaxResults();
    }
}
