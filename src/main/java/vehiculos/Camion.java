package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	private static int camiones = 0;
	
	public Camion(String placa, String nombre, double precio, double peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		camiones++;
		this.ejes = ejes;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public static int getCamiones() {
		return camiones;
	}
}