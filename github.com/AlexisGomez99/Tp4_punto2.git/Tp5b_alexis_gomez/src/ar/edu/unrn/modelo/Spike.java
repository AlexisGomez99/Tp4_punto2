package ar.edu.unrn.modelo;

import java.util.ArrayList;
import java.util.List;

public class Spike implements CalculadorHU{
	private String nombre;
	private int tiempoEstimado;
	
	
	
	public Spike(String nombre, int tiempoEstimado) {
		this.nombre = nombre;
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public int calcularTiempo() {
		System.out.println("Nombre: " +nombre);
		return tiempoEstimado;
	}

	@Override
	public int calcularTotalTiempo() {
		return calcularTiempo();
	}

}
