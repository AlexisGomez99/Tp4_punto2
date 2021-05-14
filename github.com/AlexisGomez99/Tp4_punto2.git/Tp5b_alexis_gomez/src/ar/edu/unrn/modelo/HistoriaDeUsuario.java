package ar.edu.unrn.modelo;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements CalculadorHU{
	private List<Spike> items= new ArrayList<Spike>();
	private String nombre;
	public HistoriaDeUsuario(String nombre) {
		super();
		this.nombre = nombre;

	}
	@Override
	public int calcularTotalTiempo() {
		int total=calcularTiempo();
		for(CalculadorHU item: items) {
			total= total + item.calcularTotalTiempo();
		}
		return total;
	}

	@Override
	public int calcularTiempo() {
		System.out.println("Nombre de HU: "+ nombre);
		return 0;
	}

	public void agregarTarea(Spike tarea) {
		this.items.add(tarea);
	}
}
