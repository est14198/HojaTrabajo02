/**
 * Calculadora.java
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos Seccion 10
 * Hoja de Trabajo 02
 * Maria Fernanda Estrada 14198
 * Christopher Sandoval 13660
 * 6 Enero 2017
 */



public class Calculadora implements iCalculadora {

	private double operacionDivision;
	private double operacionSuma;
	private double operacionResta;
	private double operacionMultiplicacion;
	
	@Override
	public double operar(String n) {
		// cosas
		return 0;
	}

	@Override
	public double suma(double a, double b) {
		operacionSuma = a+b;
		return operacionSuma;
	}

	@Override
	public double resta(double a, double b) {
		operacionResta = a-b;
		return operacionResta;
	}

	@Override
	public double multiplicacion(double a, double b) {
		operacionMultiplicacion = a*b;
		return operacionMultiplicacion;
	}

	@Override
	public double division(double a, double b) {
		operacionDivision = a/b;
		return operacionDivision;
	}
	
}
