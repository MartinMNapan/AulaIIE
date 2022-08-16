package pe.idat.edu.AulaPruebaIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.AulaPruebaIIE.model.AlumnoAulaFK;
import pe.idat.edu.AulaPruebaIIE.model.Aula;
import pe.idat.edu.AulaPruebaIIE.model.AulaDetalle;
import pe.idat.edu.AulaPruebaIIE.repository.AulaRepository;
import pe.idat.edu.AulaPruebaIIE.repository.DetalleAulaRepository;

@Service
public class AulaServiceImpl implements AulaService {
	
	@Autowired
	private AulaRepository repository;
	
	@Autowired
	private DetalleAulaRepository repositoryDetalle;
	


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
	
	@Override
	public void asignarEstudianteAula() {
		
		AlumnoAulaFK fk = null;
		AulaDetalle detalle = null;
		
		fk = new AlumnoAulaFK();
		fk.setIdAlumno(4);
		fk.setIdAula(4);
		detalle = new AulaDetalle();
		detalle.setFk(fk);
		repositoryDetalle.save(detalle);
		
				
	}
}
