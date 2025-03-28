package paqueteComparatorMoto;

import java.util.Comparator;

import paquete1.AccederVehiculo;

public class comparatorMotoModelo implements Comparator<AccederVehiculo> {

	@Override
	public int compare(AccederVehiculo o1, AccederVehiculo o2) {
		
		return o1.getModelo().compareTo(o2.getModelo());
	}
	
}
