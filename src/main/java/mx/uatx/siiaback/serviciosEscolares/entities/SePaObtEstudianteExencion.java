package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEstudianteExencion {
	
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;
	
	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "DSPERIODOCURSADO")
	private String dsGrado;
	
	
	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}
	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDsGrado() {
		return dsGrado;
	}
	public void setDsGrado(String dsGrado) {
		this.dsGrado = dsGrado;
	}
	
	

}
