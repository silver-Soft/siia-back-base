package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtSolicitudesBecasAdmin {
	
	@Id
	@Column(name="FOLIO")
	private Long folio;
	
	@Column(name="MATRICULA")
	private String matricula;
	
	@Column(name="IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;
	
	@Column(name="NOMBRE")
	private String nombre;
	
	@Column(name="FCSOLICITUD")
	private Date fcSolicitud;
	
	@Column(name="GRADO")
	private String grado;
	
	@Column(name="PROGRAMAEDUCATIVO")
	private String dsProgramaEducativo;
	
	@Column(name="PERMITECONSTANCIA")
	private Integer permiteConstancia;

	public Long getFolio() {
		return folio;
	}

	public void setFolio(Long folio) {
		this.folio = folio;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getDsProgramaEducativo() {
		return dsProgramaEducativo;
	}

	public void setDsProgramaEducativo(String dsProgramaEducativo) {
		this.dsProgramaEducativo = dsProgramaEducativo;
	}

	public Integer getPermiteConstancia() {
		return permiteConstancia;
	}

	public void setPermiteConstancia(Integer permiteConstancia) {
		this.permiteConstancia = permiteConstancia;
	}

}
