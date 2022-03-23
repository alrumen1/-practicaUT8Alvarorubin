package Vehiculos;
/**
 * 
 * @author alvarorm
 *@version 1.0
 */
public class Coche extends Vehiculo {
private int numPuertas;
	
	public Coche(String matricula, String color, int cilindrada, int potencia, int numPuertas) {
		super(matricula, color, 4, cilindrada, potencia);
		this.numPuertas = numPuertas;
	}
	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param cilindrada
	 * @param numPuertas
	 */
	public Coche(String matricula, String color, int cilindrada, int numPuertas) {
		super(matricula, color, 4, cilindrada);
		this.numPuertas = numPuertas;
	}
	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param numPuertas
	 */
	public Coche(String matricula, String color, int numPuertas) {
		super(matricula, color,4);
		this.numPuertas = numPuertas;
	}
	/**
	 * 
	 * @param matricula
	 * @param color
	 */
	public Coche(String matricula, String color) {
		super(matricula, color,4);
		
	}
	/**
	 * 
	 * @return
	 */
	
	public int getNumPuertas() {
		return numPuertas;
	}
	/**
	 * 
	 * @param numPuertas
	 */
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}
	
	public String toString() {
		String puertas= "Numero de puertas " + numPuertas;
		return super.toString() + "\n" + puertas;  
		/* llamo al método toString de la superclase para que visualice el resto de los campos 
		y añado el atributo numPuertas */
	}

}
