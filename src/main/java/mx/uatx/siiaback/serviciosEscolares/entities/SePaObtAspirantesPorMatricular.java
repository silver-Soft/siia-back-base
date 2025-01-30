package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtAspirantesPorMatricular {
	
	@Id	
	@Column(name="FOLIO")
	private Long folio;
	
	@Column(name="NOMBRE")
	private String nombre;

	@Column(name="CONTRASENA")
	private String contrasena;
	
	@Column(name="MATRICULA")
	private String matricula;

	@Column(name="COLOR")
	private String color;

	@Column(name="PERMITEMATRICULAR")
	private Integer permiteMatricular;

	public Long getFolio() {
		return folio;
	}

	public void setFolio(Long folio) {
		this.folio = folio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPermiteMatricular() {
		return permiteMatricular;
	}

	public void setPermiteMatricular(Integer permiteMatricular) {
		this.permiteMatricular = permiteMatricular;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
