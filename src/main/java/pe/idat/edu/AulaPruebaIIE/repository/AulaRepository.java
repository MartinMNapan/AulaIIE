package pe.idat.edu.AulaPruebaIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.AulaPruebaIIE.model.Aula;

@Repository
public interface AulaRepository extends JpaRepository<Aula, Integer> {

}
