package dto;

public class Entrada {

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getNo_asiento() {
		return no_asiento;
	}
	public void setNo_asiento(int no_asiento) {
		this.no_asiento = no_asiento;
	}
	public Sesion getSesion() {
		return sesion;
	}
	public void setSesion(Sesion sesion) {
		this.sesion = sesion;
	}
	int id;
	int fila;
	int no_asiento;
	Sesion sesion;
}
