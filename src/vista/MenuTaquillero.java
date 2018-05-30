package vista;

import java.util.List;

import dto.Pelicula;
import dto.Sesion;
import negocio.GestionSesion;
import vista.utilidades.Escaner;

public class MenuTaquillero {
	
Escaner escaner = new Escaner();
	
	public void mostrarMenu() {
		
	}
	
	public void buscarSesionPorPelicula() {
		GestionSesion gestionSesion = new GestionSesion();
		
		String titulo = escaner.leerLinea();
		List<Sesion> sesiones = gestionSesion.getSesionesPorPelicula(titulo);
		
		for (Sesion sesion : sesiones) {
			System.out.println(sesion);
		}
		
	}
	
	public void mostrarSesionesPorPelicula(Pelicula pelicula) {
		
	}
	
	public void mostrarGraficoSala(Sesion sesion) {
		
	}
	
	public void comprar(Sesion sesion) {
		
	}
	
	public void mostrarSesionesPorFecha() {
		
	}

}
