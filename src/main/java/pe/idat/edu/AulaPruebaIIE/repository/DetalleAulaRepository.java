package pe.idat.edu.AulaPruebaIIE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.idat.edu.AulaPruebaIIE.model.AulaDetalle;

@Repository
public interface DetalleAulaRepository extends JpaRepository<AulaDetalle, Integer>{

}
