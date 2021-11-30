package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	private int contador;
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		contador = 0;
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

	public static ArrayList<Fabricante> getFabricantes() {
		return fabricantes;
	}

	public int getContador() {
		return contador;
	}

	public void setContador() {
		contador++;
	}

	public static Fabricante fabricaMayorVentas() {
		Fabricante max = fabricantes.get(0);
		for(int i = 1; i < fabricantes.size(); i++) {
			if(fabricantes.get(i).getContador() > max.getContador()) {
				max = fabricantes.get(i);
			}
		}
		return max;
	}
	
	
}