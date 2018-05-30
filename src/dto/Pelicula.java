package dto;

import java.time.LocalDateTime;

public class Pelicula {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public LocalDateTime getFecha_estreno() {
		return fecha_estreno;
	}
	public void setFecha_estreno(LocalDateTime fecha_estreno) {
		this.fecha_estreno = fecha_estreno;
	}
	public LocalDateTime getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(LocalDateTime fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	int id;
	String titulo;
	String sinopsis;
	int duracion;
	LocalDateTime fecha_estreno;
	LocalDateTime fecha_fin;
}
