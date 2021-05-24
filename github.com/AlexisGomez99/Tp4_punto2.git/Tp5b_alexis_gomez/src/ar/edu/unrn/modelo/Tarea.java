package ar.edu.unrn.modelo;

public class Tarea implements CalculadorHU{
	private String nombre;
	private int tiempoEstimado;
	
	
	
	public Tarea(String nombre, int tiempoEstimado) {
		this.nombre = nombre;
		this.tiempoEstimado = tiempoEstimado;
	}
	@Override
	public int calcularTotalTiempo() {
		System.out.println("Nombre: " +nombre);
		return tiempoEstimado;
	}

	@Override
	public int calcularTiempo() {
		return calcularTiempo();
	}

}
