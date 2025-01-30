package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtProrrogasExaAdmi {
	@Id
	@Column(name = "IDPRORROGAEXADMI")
	private Long idProrrogaExAdmi;
	
	@Column(name = "IDSOLICITUDINGRESO")
	private Long idSolicitudIngreso;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCFIN")
	private Date fcFin;
	
	@Column(name = "NOMBRE")
	private String nombreAspirante;
	
	@Column(name = "PROGRAMA")
	private String programaEducativo;
	
	@Column(name = "FACULTAD")
	private String facultad;
	
	@Column(name = "TIPOPRORROGA")
	private String tipoProrroga;

	public Long getIdProrrogaExAdmi() {
		return idProrrogaExAdmi;
	}

	public void setIdProrrogaExAdmi(Long idProrrogaExAdmi) {
		this.idProrrogaExAdmi = idProrrogaExAdmi;
	}

	public Long getIdSolicitudIngreso() {
		return idSolicitudIngreso;
	}

	public void setIdSolicitudIngreso(Long idSolicitudIngreso) {
		this.idSolicitudIngreso = idSolicitudIngreso;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
	}

	public String getNombreAspirante() {
		return nombreAspirante;
	}

	public void setNombreAspirante(String nombreAspirante) {
		this.nombreAspirante = nombreAspirante;
	}

	public String getProgramaEducativo() {
		return programaEducativo;
	}

	public void setProgramaEducativo(String programaEducativo) {
		this.programaEducativo = programaEducativo;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getTipoProrroga() {
		return tipoProrroga;
	}

	public void setTipoProrroga(String tipoProrroga) {
		this.tipoProrroga = tipoProrroga;
	}
	
	

}
