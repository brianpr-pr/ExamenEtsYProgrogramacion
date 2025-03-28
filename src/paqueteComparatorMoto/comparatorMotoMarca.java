package paqueteComparatorMoto;
import paquete1.AccederVehiculo;
import java.util.Comparator;

public class comparatorMotoMarca implements Comparator<AccederVehiculo> {

	@Override
	public int compare(AccederVehiculo o1, AccederVehiculo o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}

}
