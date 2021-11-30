package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected double velocidadMaxima;
	protected String nombre;
	protected double precio;
	protected double peso;
	protected String traccion;
	protected Fabricante fabricante;
	protected static int cantidadVehiculos = 0;
	
	public Vehiculo(String placa, int puertas, double velocidadMaxima, String nombre, double precio, double peso,
			String traccion, Fabricante fabricante) {
		cantidadVehiculos++;
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		fabricante.setVehiculos();
		fabricante.getPais().setVehiculos();
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
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
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
	
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.getAutomoviles()+"\n"
				+ "Camionetas: "+Camioneta.getCamionetas()+"\n"
				+ "Camiones: "+Camion.getCamiones()+"";
	}
}