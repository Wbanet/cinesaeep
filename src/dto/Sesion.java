package dto;

import java.awt.List;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sesion {

	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public LocalDateTime getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(LocalDateTime fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	public ArrayList<Entrada> getEntradasVendidas() {
		return entradasVendidas;
	}
	public void setEntradasVendidas(ArrayList<Entrada> entradasVendidas) {
		this.entradasVendidas = entradasVendidas;
	}
	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}
	Pelicula pelicula;
	LocalDateTime fecha_hora;
	ArrayList<Entrada> entradasVendidas;
	Sala sala;
	

}

