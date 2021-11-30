package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private int contador;

	public Pais(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getContador() {
		return contador;
	}

	public void setContador() {
		contador++;
	}

	public static ArrayList<Pais> getPaises() {
		return paises;
	}
	
	public static Pais paisMasVendedor() {
		Pais max = paises.get(0);
		for(int i = 1; i < paises.size(); i++) {
			if(paises.get(i).getContador() > max.getContador()) {
				max = paises.get(i);
			}
		}
		return max;
	}
	
}