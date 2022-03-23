package Vehiculos;

/**
 * 
 *@author Alvaro Rubin
 *@version 1.0
 */
public class Vehiculo {
	//atributos
			private String matricula;
			private String color;
			private int numRuedas;
			private int cilindrada;
			private int potencia;
			//aqui creo las variables y las defino segun el tipo que sean
			
			//constructores
			/**
			 * 
			 * @param matricula
			 * @param color
			 * @param numRuedas
			 */
			Vehiculo(String matricula, String color, int numRuedas) {
				this.matricula = matricula;
				this.color = color;
				this.numRuedas = numRuedas;
				
				//creo el objeto vehiculo y sus atributos
			}
			/**
			 * 
			 * @param matricula
			 * @param color
			 * @param numRuedas
			 * @param cilindrada
			 */

			Vehiculo(String matricula, String color, int numRuedas, int cilindrada) {
				this.matricula = matricula;
				this.color = color;
				this.numRuedas = numRuedas;
				this.cilindrada = cilindrada;
				
				//creo el objeto vehiculo y sus atributos
			}
			/**
			 * 
			 * @param matricula
			 * @param color
			 * @param numRuedas
			 * @param cilindrada
			 * @param potencia
			 */
			Vehiculo(String matricula, String color, int numRuedas, int cilindrada, int potencia) {
				this.matricula = matricula;
				this.color = color;
				this.numRuedas = numRuedas;
				this.cilindrada = cilindrada;
				this.potencia = potencia;
			}

			//metodos para  uso de los atributos
			public int getCilindrada() {
				return cilindrada;
			}
/**
 * 
 * @param cilindrada
 */
			public void setCilindrada(int cilindrada) {
				this.cilindrada = cilindrada;
			}
/**
 * 
 * @return
 */
			public int getPotencia() {
				return potencia;
			}
/**
 * 
 * @param potencia
 */
			public void setPotencia(int potencia) {
				this.potencia = potencia;
			}
/**
 * 
 * @return
 */
			public String getMatricula() {
				return matricula;
				
			}
/**
 * 
 * @return
 */
			public String getColor() {
				return color;
			}
/**
 * 
 * @return
 */
			public int getNumRuedas() {
				return numRuedas;
			}
		
			public String toString() {
				return "Matricula : " + matricula + " Color: "+ color+ "Numero Ruedas: "+ numRuedas +
					 "\nCilindrada: "+ cilindrada+ " Potencia :"+ potencia;
			}
		//aqui devuelvo los valores
}
