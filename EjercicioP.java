 /***********************************************
 * EjercicioP.java
 * Jose López
 *
 * Archvio principal en donde el usuario ingresara los datos para el juego y donde llega toda la información 
 * para su realización
 **********************************************/

public class EjercicioP 
{
    EjercicioF ej = new EjercicioF();   //Conexión con la clase EjercicioF
   
    public static void main(String[] args) 
    {
        EjercicioP ep = new EjercicioP();
        ep.obtenerDato();
    }

    //***********************************************************

    //Función para obtener el dato del usuario y comenzar el juego
    public void obtenerDato()
    {
        String elemento;  //Variable para poder almacenar el dato que ingrese el usuario
        String c;         //Variable para almacenar caracter por caracter en formato String
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese la cadena de parentesis para el juego");
        elemento = System.console().readLine();
        for (int i = 0; i < elemento.length(); i++) 
        {
            char elemento1 = elemento.charAt(i);  //Declaración de Variable para obtener caracter por caracter
            c = "";
            c = c + elemento1;   //El caracter en tipo "char" se convierte en tipo "String"
            ej.push8(c);                              
        }   // End For
        ej.juego();
    }
}