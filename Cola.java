import java.util.LinkedList;
//import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class Cola 
{
    
    public static void main(String[] args) 
    {
        int cont = 1;

        Deque dequeA = new LinkedList();
                 
        dequeA.add("Rebeca López");
        dequeA.addFirst("Jorge Mario");
        dequeA.add("Manuel Asturias");
        dequeA.addLast("Rodolfo Estrada");
        dequeA.add("Alejandra Recinos");
        
        Iterator iterator = dequeA.iterator();
        Object element = dequeA.element();

        System.out.println("Listado de pacientes del día de hoy:");
        while (iterator.hasNext()) 
        {
            String elementoIterador = (String) iterator.next();
            System.out.println("Paciente No. " + cont + " - " + elementoIterador);
            cont++;                         
        }

        System.out.println("----------------------------------------------------------");  

        Object firstElement = dequeA.getFirst();
        System.out.println("El siguiente paciente a atender es: " + firstElement);
    }

}