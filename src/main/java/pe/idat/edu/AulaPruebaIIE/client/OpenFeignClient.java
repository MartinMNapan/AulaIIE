package pe.idat.edu.AulaPruebaIIE.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import pe.idat.edu.AulaPruebaIIE.dto.Alumno;

@FeignClient(name ="idat-alumno", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/estudiante/v1/listar")
	public List<Alumno> listarAlumnosSeleccionados();
}
