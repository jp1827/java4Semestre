import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase define la Carretilla de compras del cliente
 * en ella pueden haber muchos productos, los cuales 
 * se van agregando de diferentes formas.
 */
public class Carretilla 
{
	// Atributo que define una lista de productos contenidos en la carretilla
	private List<Producto> lista = new ArrayList<Producto>();
	
	/**
	 * Constructor de la clase Carretilla
	 */
	public Carretilla() 
    {
	    super();        
	}
	
	/**
	 * Método que agrega un producto a la lista de la carretilla
	 * @param p Parámetro de tipo Producto a agregar a la lista
	 */
	public void agregar(Producto p) 
    {
		lista.add(p);        
        
	}
    /**
	 * Método para mostrar todos los productos que se han ingresado a la carretilla
	 */
	public void mostrar() 
    {
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println(lista.get(i));
        }
	}
    
}
