package negocio;
import java.util.List;

import dao.EntradaDAO;
import dto.Entrada;

public class GestionEntrada {

	EntradaDAO entradaDAO;
	
	public boolean comprobarEntrada(Entrada entrada){
		return entradaDAO.comprobarEntrada(entrada);
	}
	
	public void guardarEntradas(List<Entrada> entradas){
		for (Entrada entrada : entradas) {
			entradaDAO.guardarEntrada(entrada);
		}
	}
	
	
	
}
