package paquete1;

import java.util.Objects;

public abstract class Vehiculo implements AccederVehiculo , Comparable<AccederVehiculo>{
	private final String marca;
	private final String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	
	
	
	abstract public void bocina();
	
	@Override
	public String getMarca() {
		return this.marca;
	}
	
	@Override
	public String getModelo(){
		return this.modelo;
	}
	
	@Override
	public double getPrecio(){
		return this.precio;
	}




	public void setPrecio(double precio) {
		this.precio =0;
		if(precio > 0) {
			this.precio =precio;
		}
		
	}




	@Override
	public String toString() {
		return "Vehiculo [Marca()=" + getMarca() + ", Modelo()=" + getModelo() + ", Precio()=" + getPrecio()
				+ "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, precio);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	
	
	@Override
	public int compareTo(AccederVehiculo o) {
		return (int)getPrecio() - (int)o.getPrecio();
	}
	
	
	
	
	
	
	
	
}
