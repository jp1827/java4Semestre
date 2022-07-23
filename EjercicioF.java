 /***********************************************
 * EjercicioF.java
 * Jose López
 *
 * Funciones y métodos para el funcionamiento de los nodos y el juego
 **********************************************/

public class EjercicioF
{
    
    //DECLARACION DE VARIABLES A UTILIZAR EN EL PROGRAMA
    private EjercicioN inicio, fin, fuente;
    boolean comprobar = true;  //Varibale que verifica si ganó o perdió el juego

    //***********************************************************

    public EjercicioF()
    {

        //Se les da valor null al inicio del programa
        inicio = null;   //Variable nodo para la cola
        fin = null;      //Variable nodo para la cola
        fuente = null;   //Variable nodo para la pila
    }

    //***********************************************************

    //CREACION DE UNA COLA PARA GUARDAR TODOS LOS DATOS DEL STRING INGRESADO POR EL USUARIO
    public void push8(String valor)
    {
        EjercicioN nuevo = new EjercicioN(valor);
        if(inicio == null){
            inicio = nuevo;
        }else{
            fin.siguiente = nuevo;            
        }        
        fin = nuevo;       
    }

    //***********************************************************

    //FUNCION PARA GUARDAR LOS DATOS EN UNA NUEVA PILA EN CASO DE SER "("
    public void push9(String valor)
    {
        EjercicioN nuevo = new EjercicioN(valor);
        nuevo.siguiente = fuente;
        fuente = nuevo;       
    }

    //***********************************************************

    //FUNCION PARA LIMPIAR Y PARA SACAR LOS "(" CUANDO SEA EL CASO
    public String pop8()
    {
        String aux = fuente.dato;
        fuente = fuente.siguiente;
        return aux;
    }

    //***********************************************************

    //FUNCION PARA VALIDAR SI GANO O PERDIO EL USUARIO
    public void juego()
    {
        EjercicioN aux = inicio;
        while(aux != null)
        {                                          
            switch (aux.dato)
            {
                case "(":
                    push9(aux.dato); 
                    break;
                case ")":
                    if (fuente == null) 
                    {
                        comprobar = false;
                    }else{
                        pop8();
                    } // End If
                    break;
                default:
                    comprobar = false;
                    break;
            } // End Switch 
            if (comprobar == false) 
            {
               break; 
            } // End If 
            aux=aux.siguiente;    
        } // End While

        if (comprobar == true && fuente == null) 
        {
            System.out.println("Felicidades has ganado, Fin del juego");
            System.console().readLine("Presione enter para continuar...");
        }else{
            System.out.println("Incorrecto, Fin del juego");
            System.console().readLine("Presione enter para continuar...");
        }
    }
}