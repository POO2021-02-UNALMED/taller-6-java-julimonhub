package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected float peso;
	protected String traccion;
	protected Fabricante fabricante;
	private static int vehiculos = 0;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, float peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		vehiculos ++;
		fabricante.setContador();
		fabricante.getPais().setContador();
		Fabricante.getFabricantes().add(fabricante);
		Pais.getPaises().add(fabricante.getPais());
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String getTraccion() {
		return traccion;
	}
	
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return vehiculos;
	}
	

	public static void setCantidadVehiculos(int vehiculos) {
		Vehiculo.vehiculos = vehiculos;
	}

	public static String vehiculosPorTipo () {
		return "Automoviles: " + Automovil.getAutomoviles() + "\nCamionetas: " + Camioneta.getCamionetas() + "\nCamiones: " + 
				Camion.getCamiones();
	}
	
	
	
	
}