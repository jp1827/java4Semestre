import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;


public class Baraja
{
    private Map <Integer, Carta> colecion1;
    private Map <Integer, Carta> colecion2;
    private Map <Integer, Carta> colecion3;
    private Map <Integer, Carta> colecion4;

    public static void main(String[] args) 
    {
        Baraja ba = new Baraja();
        ba.pDiamante();
        ba.pCorazon();
        ba.pPica();
        ba.pTrebol();
        
    }

    public void pDiamante()
    {
        colecion1 = new TreeMap<Integer, Carta>();

        colecion1.put(1, new Carta("As", "Diamante"));
        colecion1.put(2, new Carta("2", "Diamante"));
        colecion1.put(3, new Carta("3", "Diamante"));
        colecion1.put(4, new Carta("4", "Diamante"));
        colecion1.put(5, new Carta("5", "Diamante"));
        colecion1.put(6, new Carta("6", "Diamante"));
        colecion1.put(7, new Carta("7", "Diamante"));
        colecion1.put(8, new Carta("8", "Diamante"));
        colecion1.put(9, new Carta("9", "Diamante"));
        colecion1.put(10, new Carta("10", "Diamante"));
        colecion1.put(11, new Carta("J", "Diamante"));
        colecion1.put(12, new Carta("Q", "Diamante"));
        colecion1.put(13, new Carta("K", "Diamante"));

        for (Entry<Integer, Carta> ca : colecion1.entrySet()){
            Integer clave = ca.getKey();
            Carta valor = ca.getValue();
            System.out.println(clave+"  ->  "+valor.toString());
        }
    }

    public void pCorazon()
    {
        colecion2 = new TreeMap<Integer, Carta>();

        colecion2.put(1, new Carta("As", "Corazón"));
        colecion2.put(2, new Carta("2", "Corazón"));
        colecion2.put(3, new Carta("3", "Corazón"));
        colecion2.put(4, new Carta("4", "Corazón"));
        colecion2.put(5, new Carta("5", "Corazón"));
        colecion2.put(6, new Carta("6", "Corazón"));
        colecion2.put(7, new Carta("7", "Corazón"));
        colecion2.put(8, new Carta("8", "Corazón"));
        colecion2.put(9, new Carta("9", "Corazón"));
        colecion2.put(10, new Carta("10", "Corazón"));
        colecion2.put(11, new Carta("J", "Corazón"));
        colecion2.put(12, new Carta("Q", "Corazón"));
        colecion2.put(13, new Carta("K", "Corazón"));

        for (Entry<Integer, Carta> ca : colecion2.entrySet()){
            Integer clave = ca.getKey();
            Carta valor = ca.getValue();
            System.out.println(clave+"  ->  "+valor.toString());
        }
    }

    public void pPica()
    {
        colecion3 = new TreeMap<Integer, Carta>();

        colecion3.put(1, new Carta("As", "Picas"));
        colecion3.put(2, new Carta("2", "Picas"));
        colecion3.put(3, new Carta("3", "Picas"));
        colecion3.put(4, new Carta("4", "Picas"));
        colecion3.put(5, new Carta("5", "Picas"));
        colecion3.put(6, new Carta("6", "Picas"));
        colecion3.put(7, new Carta("7", "Picas"));
        colecion3.put(8, new Carta("8", "Picas"));
        colecion3.put(9, new Carta("9", "Picas"));
        colecion3.put(10, new Carta("10", "Picas"));
        colecion3.put(11, new Carta("J", "Picas"));
        colecion3.put(12, new Carta("Q", "Picas"));
        colecion3.put(13, new Carta("K", "Picas"));

        for (Entry<Integer, Carta> ca : colecion3.entrySet()){
            Integer clave = ca.getKey();
            Carta valor = ca.getValue();
            System.out.println(clave+"  ->  "+valor.toString());
        }
    }

    public void pTrebol()
    {
        colecion4 = new TreeMap<Integer, Carta>();

        colecion4.put(1, new Carta("As", "Trebol"));
        colecion4.put(2, new Carta("2", "Trebol"));
        colecion4.put(3, new Carta("3", "Trebol"));
        colecion4.put(4, new Carta("4", "Trebol"));
        colecion4.put(5, new Carta("5", "Trebol"));
        colecion4.put(6, new Carta("6", "Trebol"));
        colecion4.put(7, new Carta("7", "Trebol"));
        colecion4.put(8, new Carta("8", "Trebol"));
        colecion4.put(9, new Carta("9", "Trebol"));
        colecion4.put(10, new Carta("10", "Trebol"));
        colecion4.put(11, new Carta("J", "Trebol"));
        colecion4.put(12, new Carta("Q", "Trebol"));
        colecion4.put(13, new Carta("K", "Trebol"));

        for (Entry<Integer, Carta> ca : colecion4.entrySet()){
            Integer clave = ca.getKey();
            Carta valor = ca.getValue();
            System.out.println(clave+"  ->  "+valor.toString());
        }
    }
    
}
