package paquete1;

import java.util.Arrays;
import paqueteComparatorCoche.*;
import paqueteComparatorMoto.*;
public class Concesionario {
	private AccederVehiculo[] listadoVehiculos;

	public Concesionario() {
		super();
		this.listadoVehiculos = getListadoVehiculosI();
	}
	
	
	private AccederVehiculo[] getListadoVehiculosI(){
		listadoVehiculos = new AccederVehiculo[0];
		return listadoVehiculos;
	}
	
	
	public void agregarVehiculos(AccederVehiculo vehiculo) {
		this.listadoVehiculos = Arrays.copyOf(this.listadoVehiculos, this.listadoVehiculos.length + 1);
		this.listadoVehiculos[listadoVehiculos.length - 1] = vehiculo;
	}
	
	
	public void ordenar(Object seleccion) {
		
		
		if(seleccion instanceof comparatorCocheMarca) 
			Arrays.sort(this.listadoVehiculos, new comparatorCocheMarca());
		
		if(seleccion instanceof comparatorCocheModelo)
			Arrays.sort(this.listadoVehiculos, new comparatorCocheModelo());
			
		if(seleccion instanceof comparatorMotoMarca)
			Arrays.sort(this.listadoVehiculos, new comparatorMotoMarca());
		
		if(seleccion instanceof comparatorMotoModelo)
			Arrays.sort(this.listadoVehiculos, new comparatorMotoModelo());
		
		this.mostrarLista();
		
	}
	
	
	
	
	
	public void mostrarLista() {
		for(AccederVehiculo x : this.listadoVehiculos) {
			System.out.println(x.getMarca() + x.getModelo() + x.getPrecio());
		}
	}
	
}
