package ar.edu.unrn.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unrn.modelo.HistoriaDeUsuario;
import ar.edu.unrn.modelo.Spike;
import ar.edu.unrn.modelo.Tarea;

public class CalculadorHUTest {
	
	@Test
	public void calcularElTiempoEstimadoDeUnaTarea() {
		//set up
		Spike tarea= new Spike("Calcular tiempo", 8);
		//exercise
		assertEquals(8,tarea.calcularTotalTiempo());
		System.out.println("--------------------------");
		
	}
	@Test
	public void calcularElTiempoEstimadoDeUnaHistoriaDeUsuario() {
		//set up
		Spike tarea1= new Spike("Calcular tiempo", 8);
		Tarea tarea2= new Tarea("Verificar resultado", 3);
		Spike tarea3= new Spike("Cargar resultado", 5);
		HistoriaDeUsuario historiaUsuario= new HistoriaDeUsuario("Calculadora de tiempo");
		historiaUsuario.agregarTarea(tarea1);
		historiaUsuario.agregarTarea(tarea2);
		historiaUsuario.agregarTarea(tarea3);
		
		//exercise
		assertEquals(16,historiaUsuario.calcularTotalTiempo());
		System.out.println("--------------------------");
		
	}
}
