package paquete1;

import paqueteComparatorCoche.comparatorCocheMarca;
import paqueteComparatorCoche.comparatorCocheModelo;
import paqueteComparatorMoto.comparatorMotoMarca;
import paqueteComparatorMoto.comparatorMotoModelo;

public class App {

	public static void main(String[] args) {
		System.out.println("Pruebas de examen Tema 9");
		//public Coche(String marca, String modelo, double precio, int numAsientos) {
		Coche ferrari = new Coche("Ferrari", "california", 50, 2);
		System.out.println(ferrari);
		//public Moto(String marca, String modelo, double precio, double cilindrada) {
		Moto kawasaki = new Moto("Kawasaki", "aL", 25, 125);
		System.out.println(kawasaki);
		
		
		
		
		AccederVehiculo instanciaC = ferrari;
		AccederVehiculo instanciaM =kawasaki;
		
		
		//
		System.out.println(instanciaC.getMarca() + instanciaC.getModelo() + instanciaC.getPrecio());
		
		//numero Negativo
		System.out.println( ( (Coche)instanciaC).compareTo(instanciaM) );
		
		
		//numero positvo
		System.out.println( ( (Moto)instanciaM).compareTo(instanciaC) );
		
		//0
		System.out.println( ( (Moto)instanciaM).compareTo(kawasaki) );	
		
		
		//esto daria error 
		//System.out.println( ( (Coche)instanciaM).compareTo(kawasaki) );	
		
		//Pruebas Concesionario:
		
		
		Concesionario mercedez = new Concesionario();
		
		
		mercedez.agregarVehiculos(instanciaM);
		mercedez.agregarVehiculos(instanciaM);
		mercedez.agregarVehiculos(instanciaC);
		
		System.out.println("Lista sin cambios");
		mercedez.mostrarLista();
		
		
		
		
		//ordenar usando interfaz Comparator
		System.out.println("\n ###cocheMarca############################3");
		mercedez.ordenar(new comparatorCocheMarca());
		System.out.println("\n #####cocheModelo##################################3");
		mercedez.ordenar(new comparatorCocheModelo());
		System.out.println("\n #######motoMarca#########################3");
		mercedez.ordenar(new comparatorMotoMarca());
		System.out.println("\n #########motoModelo##############################3");
		mercedez.ordenar(new comparatorMotoModelo());
		
		
		Vehiculo x = new Vehiculo(null, null, 0) {

			@Override
			public String getMarca() {
				
				return this.getMarca();
			}

			@Override
			public String getModelo() {
				// TODO Auto-generated method stub
				return this.getModelo();
			}

			@Override
			public double getPrecio() {
				// TODO Auto-generated method stub
				return this.getPrecio();
			}

			@Override
			public void bocina() {
				// TODO Auto-generated method stub
				
			}
			
			
		};
		
		
		
		
		
		
		
	}
	
	
	
	
	

}
