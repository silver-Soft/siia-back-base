package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDeclaracionesExternas {
	
	@Id
	@Column(name = "IDDECLARACIONEXTERNA")
	private Long idDeclaracionExterna;

	@Column(name = "FCDECLARACIONEXTERNA")
	private Date fcDeclaracionExterna;

	@Column(name = "IDPERSONA")
	private Long idPersona;

	@Column(name = "NBPERSONA")
	private String nbPersona;

	@Column(name = "APPATERNO")
	private String apPaterno;

	@Column(name = "APMATERNO")
	private String apMaterno;

	@Column(name = "IDPERIODO")
	private String idPeriodo;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "PERMITEMODIFICAR")
	private Boolean permiteModificar;

	@Column(name = "PERMITEELIMINAR")
	private Boolean permiteTerminar;
	
	public Long getIdDeclaracionExterna() {
		return idDeclaracionExterna;
	}
	public void setIdDeclaracionExterna(Long idDeclaracionExterna) {
		this.idDeclaracionExterna = idDeclaracionExterna;
	}
	public Date getFcDeclaracionExterna() {
		return fcDeclaracionExterna;
	}
	public void setFcDeclaracionExterna(Date fcDeclaracionExterna) {
		this.fcDeclaracionExterna = fcDeclaracionExterna;
	}
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public String getNbPersona() {
		return nbPersona;
	}
	public void setNbPersona(String nbPersona) {
		this.nbPersona = nbPersona;
	}
	public String getApPaterno() {
		return apPaterno;
	}
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	public String getApMaterno() {
		return apMaterno;
	}
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Boolean getPermiteModificar() {
		return permiteModificar;
	}
	public void setPermiteModificar(Boolean permiteModificar) {
		this.permiteModificar = permiteModificar;
	}
	public Boolean getPermiteTerminar() {
		return permiteTerminar;
	}
	public void setPermiteTerminar(Boolean permiteTerminar) {
		this.permiteTerminar = permiteTerminar;
	}
	

}
