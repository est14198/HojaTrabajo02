/**
 * iPila.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 02
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * @author Christopher Sandoval
 * 6 Enero 2017
 */



public interface iPila<E> {
	
	public void push (E algo);
	// post: elemento E se agrega a la pila
	
	public E pop();
	// pre: la pila no esta vacia
	// post: se elimina el ultimo elemento de la pila y se regresa su valor
	
	public boolean isEmpty();
	// post: regresa true si la pila se encuentra vacia

}
