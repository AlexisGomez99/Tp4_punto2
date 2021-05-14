package ar.edu.unrn.modelo;

import java.util.ArrayList;
import java.util.List;

public class ProyectoScrum implements CalculadorHU{
	private String nombre;
	private List<HistoriaDeUsuario> historiasDeUsuario= new ArrayList<HistoriaDeUsuario>();
	
	
	
	public ProyectoScrum(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int calcularTotalTiempo() {
		int total=calcularTiempo();
		for(CalculadorHU item: historiasDeUsuario) {
			total= total + item.calcularTotalTiempo();
		}
		return total;
	}

	@Override
	public int calcularTiempo() {
		System.out.println("Nombre proyecto: "+ nombre);
		return 0;
	}
	public void agregarHU(HistoriaDeUsuario historiaUsuario) {
		historiasDeUsuario.add(historiaUsuario);
	}

}
