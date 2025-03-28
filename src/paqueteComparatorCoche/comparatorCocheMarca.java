package paqueteComparatorCoche;

import java.util.Arrays;
import java.util.Comparator;

import paquete1.AccederVehiculo;


public class comparatorCocheMarca  implements Comparator<AccederVehiculo>{

	@Override
	public int compare(AccederVehiculo o1, AccederVehiculo o2) {
		
		return o1.getMarca().compareTo(o2.getMarca()); //(o1.getMarca(), o2.getMarca());
	}

}
