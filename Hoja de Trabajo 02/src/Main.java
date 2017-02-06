/**
 * Main.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 02
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * 6 Enero 2017
 */



public class Main {

    private static String datos;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Leer dats = new Leer ();
    	datos = dats.textoLeer("datos.txt");
    	System.out.println(datos);
    }
    
}
