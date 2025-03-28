package paquete1;

public class Moto extends Vehiculo {
	private double cilindrada;
	
	
	
	public Moto(String marca, String modelo, double precio, double cilindrada) {
		super(marca, modelo, precio);
		 setCilindrada(cilindrada);
	}
	
	





	public double getCilindrada() {
		return cilindrada;
	}



	public void setCilindrada(double cilindrada) {
		this.cilindrada=0;
		if(cilindrada > 0 && cilindrada <= 500)
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void bocina() {
		System.out.println("Piummm");
		
	}







	@Override
	public String toString() {
		return "Moto [getCilindrada()=" + getCilindrada() + ", getMarca()=" + getMarca() + ", getModelo()="
				+ getModelo() + ", getPrecio()=" + getPrecio() + "]";
	}
	
	
	
	
	
	
	
	
}
