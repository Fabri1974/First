
package libreria.Servicios;

import libreria.Entidades.Editorial;
import libreria.persistencia.EditorialDAO;


public class EditorialServicio {
    
    EditorialDAO ed1=new EditorialDAO();
    public Editorial buscarporNombre(String nombre)
    {
     return   ed1.buscareditorialPorNombre(nombre);
    }
}
