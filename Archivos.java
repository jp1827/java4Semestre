import java.io.*;

/**
 * Esta clase tiene como objetivo leer los datos
 * presentes en un archivo de texto con extensión .txt
 * 
 */
public class Archivos {
	/**
	 * Método main que lee un archivo de texto y muestra su contenido en pantalla
	 * @throws FileNotFoundException
	 * @throws IOException Excepción que indica que no se pudo leer el archivo
	 */
	public static void main(String[] args) throws IOException 
    {
		String nombreArchivo = "C:/prueba.txt"; /* Definición del archivo de texto a leer */
		FileInputStream archivo; // Definición de flujo de datos
		InputStreamReader conversor; // Definición del flujo de lectura
		BufferedReader filtro; // Definición del buffer
		String línea;
		/* Crea los objetos FileInputStream, BufferedReader y BufferedReader */
		archivo = new FileInputStream(nombreArchivo);
		conversor = new InputStreamReader(archivo);
		filtro = new BufferedReader(conversor);
		try {
			línea = filtro.readLine();
			while (línea != null) 
        	{
			System.out.println(línea); /* Imprime en pantalla una línea del archivo */
			línea = filtro.readLine(); // Lee la siguiente línea 
			} 
		} catch (IOException e) {
			e.printStackTrace();
		}	
		filtro.close(); // Cierra el archivo
	}
}