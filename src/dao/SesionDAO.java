package dao;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.List;

import dto.Pelicula;
import dto.Sala;
import dto.Sesion;

public class SesionDAO {
	
	Connection conexion;
	
	
	public List<Sesion> getSesionesPorPelicula (Pelicula pelicula){
		return null;
	}
	
	public List<Sesion> getSesionesPorFecha (){
		return null;
	}
	
	public void crearSesion (Sesion sesion) {
		
	}
	
	public List<Sesion> getSesiones (){
		return null;
	}
	
	public void eliminarSesion (Sesion sesion) {
		
		
	}
	
	public boolean comprobarSesionDisponible (Sala sala, LocalDateTime fecha_hora) {
		
		return true;
	}
	
	
}