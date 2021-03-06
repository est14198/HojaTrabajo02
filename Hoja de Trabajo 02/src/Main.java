/**
 * Main.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 02
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author FER ESTRADA
 * @since 6 Enero 2017
 */



public class Main {

    private static String datos;

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	// Leer los datos del archivo
    	Leer dats = new Leer ();
    	datos = dats.textoLeer("C:/Users/FER ESTRADA/git/HojaTrabajo02/Hoja de Trabajo 02/src/datos.txt");
    	System.out.println(datos);
    	
    	iCalculadora miCalcu = new Calculadora();
    	
    	// Imprimir resultado
    	System.out.println(miCalcu.operar(datos));
    }
    
}
