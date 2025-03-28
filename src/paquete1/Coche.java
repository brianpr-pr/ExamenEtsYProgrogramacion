package paquete1;

public class Coche  extends Vehiculo  implements AccederVehiculo{
	private final int numAsientos;

	
	
	
	public Coche(String marca, String modelo, double precio, int numAsientos) {
		super(marca, modelo, precio);
		this.numAsientos = getNumAsientos( numAsientos);
	}




	@Override
	public void bocina() {
		System.out.println("PIPIIIII");
		
	}



	public int getNumAsientos(int numAsientos) {
		if(numAsientos > 1)
		return numAsientos;
		return 4;
	}

	public int getNumAsientos() {
		return numAsientos;
	}




	@Override
	public String toString() {
		return "Coche [getNumAsientos()=" + getNumAsientos() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getPrecio()=" + getPrecio() + "]";
	}




	
	
	
	
	
	

}
