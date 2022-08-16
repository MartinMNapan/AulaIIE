package pe.idat.edu.AulaPruebaIIE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//esta anotacion indica los atributos que son FK
@Embeddable
public class AlumnoAulaFK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7242361965764494419L;

	@Column(name = "id_aula", nullable = false, unique = true)
	private Integer idAula;
	
	@Column(name = "id_alumno", nullable = false, unique = true)
	private Integer idAlumno;

	public Integer getIdAula() {
		return idAula;
	}

	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}

	public Integer getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}
}
