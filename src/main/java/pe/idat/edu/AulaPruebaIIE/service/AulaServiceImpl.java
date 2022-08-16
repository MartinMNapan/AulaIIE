package pe.idat.edu.AulaPruebaIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.AulaPruebaIIE.model.Aula;
import pe.idat.edu.AulaPruebaIIE.repository.AulaRepository;

@Service
public class AulaServiceImpl implements AulaService {
	
	@Autowired
	private AulaRepository repository;
	

	@Override
	public List<Aula> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Aula obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Aula aula) {
		// TODO Auto-generated method stub
		repository.save(aula);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Aula aula) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(aula);

	}

}
