package Vehiculos;
/**
 * 
 * @author alvarorm
 *@version 1.0
 */
public class PruebaVehiculos {

	/**
	 * 
	 * @param args
	 */
	
	//En esta clase uso todos los metodos y clases para comprobar que funciona correctamente el programa
	public static void main(String[] args) {
		Coche cochePepe, cocheMaria;
		cochePepe = new Coche("0000BBB", "gris plata");
		cocheMaria = new Coche("1111CCC", "rojo");
		//cocheMaria = new Coche ("1111CCC", "rojo",12000,5);
		cochePepe.setNumPuertas(3);
		cocheMaria.setNumPuertas(5);
		System.out.println("Datos del Coche Pepe:");
		System.out.println("Matrícula "+ cochePepe.getMatricula());
		System.out.println("Color "+ cochePepe.getColor());
		System.out.println("Número de puertas "+ cochePepe.getNumPuertas());
		System.out.println("\nDatos del Coche María:");
		System.out.println("Matrícula "+ cocheMaria.getMatricula());
		System.out.println("Color "+ cocheMaria.getColor());
		System.out.println("Numero de puertas "+ cocheMaria.getNumPuertas());
		System.out.println("******Coche Maria*******");
		System.out.println(cocheMaria.toString());//llama al metodo toString de Coche
		Moto motoPepe;
		motoPepe= new Moto("2222BBBB","negro");
		motoPepe.setNumPlazas(2);
		System.out.println("\nDatos de la Moto de Pepe");
		System.out.println("Matricula  "+motoPepe.getMatricula());
		System.out.println("Color  "+motoPepe.getColor());
		System.out.println("Número de plazas  "+ motoPepe.getNumPlazas());
	}
	
}
