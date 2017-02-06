/**
 * iCalculadora.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 02
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * 6 Enero 2017
 */



public interface iCalculadora {
	
	public double operar (String n);
	// post: recive un string, lo agrega a una pila y traduce la operacion postfix para dar el resultado
	
	public double suma (double a, double b);
	// post: suma dos elementos y regresa el resultado
	
	public double resta (double a, double b);
	// post: resta dos elementos y regresa el resultado
	
	public double multiplicacion (double a, double b);
	// post: multiplica dos elementos y regresa el resultado
	
	public double division (double a, double b);
	// post: divide dos elementos y regresa el resultado

}