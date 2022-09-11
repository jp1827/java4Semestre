//Creación de clase genérica con tres parametros
class Estudiante <N, A, T> 
{
    private N n;
    private A a;
    private T t;
    

    public void setN(N n) {
        this.n = n;
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setT(T t) {
        this.t = t;
    }

    public N getN() {
        return n;
    }

    public A getA() {
        return a;
    }

    public T getT() {
        return t;
    }

    public Estudiante(N nombre, A apellido, T numeroTelefono)
    {
        n = nombre;
        a = apellido;
        t = numeroTelefono;
    }

    public String toString()
	{
		return String.format(n +  "-"  + a + "-" + t);
	}

    public static void main(String[] args) 
    {
        Estudiante<String, String, Integer> estudiante1 = new Estudiante<String,String,Integer>("Jose", "López", 55568789);
        System.out.println("Nombre:");
        System.out.println("-- " + estudiante1.n);
        System.out.println("Apellido:");
        System.out.println("-- " + estudiante1.a);
        System.out.println("Número de teléfono:");      
        System.out.println("-- " + estudiante1.t);
    }

   

}
