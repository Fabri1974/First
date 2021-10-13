
package libreria.persistencia;

import libreria.Entidades.Autor;


public class AutorDAO extends DAO{
    public void crearAutor(Autor autor) throws Exception
    {  
        try{
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al insertar el libro");
    }
    }
     public void modificarAutor(Autor autor) throws Exception
    {
         try{
        em.getTransaction().begin();
        em.merge(autor);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al  modificar el libro");
    }
    }
     public void eliminarLibro(Autor autor) throws Exception
    {
         try{
        em.getTransaction().begin();
        em.remove(autor);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al borrar el autor");
    }
    }
      public Autor buscarAutorPorTitulo(String nombre)
    {
        return (Autor) em.createQuery("SELECT a from Autor a where a.nombre= :nombre").setParameter("nombre", nombre).getSingleResult();
                
                
                
    }
    
}
