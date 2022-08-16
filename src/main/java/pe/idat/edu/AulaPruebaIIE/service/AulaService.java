package pe.idat.edu.AulaPruebaIIE.service;

import java.util.List;

import pe.idat.edu.AulaPruebaIIE.model.Aula;

public interface AulaService {
	
	List<Aula> listar();
	Aula obtenerId(Integer id);
	void guardar(Aula aula);
	void eliminar(Integer id);
	void actualizar(Aula aula);

}
