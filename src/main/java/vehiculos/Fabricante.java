package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	private int vehiculos;
	
	public Fabricante(String nombre, Pais pais) {
		vehiculos = 0;
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public void setVehiculos() {
		vehiculos++;
	}
	
	public static ArrayList<Fabricante> getFabricantes(){
		return fabricantes;
	}
	
	public int getVehiculos() {
		return vehiculos;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante maximo = fabricantes.get(0);
		
		for(int i = 1; i < fabricantes.size(); i++) {
			if(fabricantes.get(i).getVehiculos() > maximo.getVehiculos()) {
				maximo = fabricantes.get(i);
			}
		}
		return maximo;
	}
}