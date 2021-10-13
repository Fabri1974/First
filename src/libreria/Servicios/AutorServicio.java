
package libreria.Servicios;

import libreria.Entidades.Autor;
import libreria.persistencia.AutorDAO;


public class AutorServicio {
    AutorDAO ad=new AutorDAO();
    
    public Autor buscarAutorPorNombre(String nombre)
    {
        return ad.buscarAutorPorTitulo(nombre);
    }
    
    
}
