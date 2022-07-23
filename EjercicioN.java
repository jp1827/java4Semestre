 /***********************************************
 * EjercicioN.java
 * Jose López
 *
 * Declaración de los nodos a utilizar en el juego y en los demás archivos
 **********************************************/

public class EjercicioN
{
    //DECLARACION Y FUNCIONES PARA NODOS Y PUNTEROS DE TIPO STRING
    public String dato;            //Nodo para almacenar los datos
    public EjercicioN siguiente;   //Puntero para recoger entre datos

    //***********************************************************
   
    public EjercicioN(String dato)
    {
        this.dato = dato;
    }
   
    public EjercicioN(String dato, EjercicioN siguiente)
    {
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
