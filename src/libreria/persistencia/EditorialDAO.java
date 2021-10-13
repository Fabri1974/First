
package libreria.persistencia;

import libreria.Entidades.Editorial;


public class EditorialDAO extends DAO{
    
    public void crearLibro(Editorial ed) throws Exception
    {  
        try{
        em.getTransaction().begin();
        em.persist(ed);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al insertar el libro");
    }
    }
    public void modificarLibro(Editorial ed) throws Exception
    {
         try{
        em.getTransaction().begin();
        em.merge(ed);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al  modificar el libro");
    }
    }
    public void eliminarLibro(Editorial ed) throws Exception
    {
         try{
        em.getTransaction().begin();
        em.remove(ed);
        em.getTransaction().commit();
    }
    catch(Exception e)
    {
       throw new Exception("Error al borrar el libro");
    }
    }
   
    public Editorial buscareditorialPorNombre(String nombreEditorial)
    {
        return (Editorial) em.createQuery("SELECT e from Editorial e where e.nombre= :nombreEditorial").setParameter("nombreEditorial",nombreEditorial).getSingleResult();
                
                
                
    }
    
}
