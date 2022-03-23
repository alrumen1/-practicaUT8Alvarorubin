package Vehiculos;
/**
 * 
 * @author alvarorm
 *@version 1.0
 */
public class Moto extends Vehiculo {
	//atributos
			private int numPlazas;
/**
 * 
 * @param matricula
 * @param color
 */
			//constructores
			Moto (String matricula, String color) {
				super(matricula,color,2);  
				/* 2 es el numero de ruedas que es necesario pasar al constructor definido 
				 * en la clase padre para que coincidan el número de parámetros */
			}
			/**
			 * 
			 * @param matricula
			 * @param color
			 * @param cilindrada
			 */
				
			Moto (String matricula,String color, int cilindrada) {
				super(matricula,color,2,cilindrada); 
				// 2 es el número de ruedas
			}
/**
 * 
 * @param matricula
 * @param color
 * @param cilindrada
 * @param potencia
 */
			Moto (String matricula,String color, int cilindrada, int potencia){
				super(matricula,color,2,cilindrada,potencia);
				// 2 es el número de ruedas
			}
			
			/**
			 * 
			 * @param matricula
			 * @param color
			 * @param cilindrada
			 * @param potencia
			 * @param numPlazas
			 */
			Moto (String matricula,String color, int cilindrada, int potencia,int numPlazas){
				super(matricula,color,2,cilindrada,potencia); 
				// 2 es el número de ruedas 
				this.numPlazas=numPlazas;
				}
				//otros métodos de uso de atributos
			/**
			 * 
			 * @param num
			 */
				public void setNumPlazas(int num){
					numPlazas=num;
				}
				/**
				 * 
				 * @return numero de plazas
				 */
				public int getNumPlazas(){
					return numPlazas;
				}
				
}

