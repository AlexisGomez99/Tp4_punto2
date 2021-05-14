package ar.edu.unrn.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unrn.modelo.HistoriaDeUsuario;
import ar.edu.unrn.modelo.ProyectoScrum;
import ar.edu.unrn.modelo.Spike;

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
		Spike tarea2= new Spike("Verificar resultado", 3);
		Spike tarea3= new Spike("Cargar resultado", 5);
		HistoriaDeUsuario historiaUsuario= new HistoriaDeUsuario("Calculadora de tiempo");
		historiaUsuario.agregarTarea(tarea1);
		historiaUsuario.agregarTarea(tarea2);
		historiaUsuario.agregarTarea(tarea3);
		
		//exercise
		assertEquals(16,historiaUsuario.calcularTotalTiempo());
		System.out.println("--------------------------");
		
	}
	@Test
	public void calcularElTiempoEstimadoDeUnProyectoDeScrum() {
		//set up
		Spike tarea1= new Spike("Pedir numeros", 5);
		Spike tarea2= new Spike("Verificar datos", 3);
		Spike tarea3= new Spike("Enviar datos", 2);
		HistoriaDeUsuario historiaUsuario1= new HistoriaDeUsuario("Registrar tiempo");
		Spike tarea4= new Spike("Calcular tiempo", 8);
		Spike tarea5= new Spike("Verificar resultado", 3);
		Spike tarea6= new Spike("Cargar resultado", 5);
		HistoriaDeUsuario historiaUsuario2= new HistoriaDeUsuario("Calcular");
		Spike tarea7= new Spike("Mostrar resultado", 2);
		HistoriaDeUsuario historiaUsuario3= new HistoriaDeUsuario("Mostrar tiempo estimado");
		historiaUsuario1.agregarTarea(tarea1);
		historiaUsuario1.agregarTarea(tarea2);
		historiaUsuario1.agregarTarea(tarea3);
		historiaUsuario2.agregarTarea(tarea4);
		historiaUsuario2.agregarTarea(tarea5);
		historiaUsuario2.agregarTarea(tarea6);
		historiaUsuario3.agregarTarea(tarea7);
		ProyectoScrum proyecto= new ProyectoScrum("Calculadora de tiempo");
		proyecto.agregarHU(historiaUsuario1);
		proyecto.agregarHU(historiaUsuario2);
		proyecto.agregarHU(historiaUsuario3);
		//exercise
		assertEquals(28,proyecto.calcularTotalTiempo());
		System.out.println("--------------------------");
		
		
	}
}
