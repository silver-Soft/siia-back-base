package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name = "SI_MS_REUNIONES")
public class SiMsReuniones {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "ID_REUNION", sequenceName = "SIIUAT.ID_REUNION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_REUNION")
	@NotNull
	@Column(name = "ID_REUNION")
	private Long idReunion;
	
	@Column(name = "CLAVE_REUNION")
	private String claveReunion;

	@Column(name = "FECHA_PROGRAMAR")
	private Date fcProgramar;

	@Column(name = "HORA")
	private String hora;

	@Column(name = "LUGAR")
	private String lugar;

	@Column(name = "FECHA_REALIZACION")
	private Date fcRealizacion;

	@Column(name = "TEMA")
	private String tema;

	@Column(name = "FC_AUDIT")
	private Date fcAudit;

	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;

	@Column(name = "ID_PROCESO")
	private Long idProceso;

	@Column(name = "ID_ESTATUS_REUNION")
	private Integer idEstatusReunion;

	@Column(name = "ID_AREA_CAMPUS")
	private Long idAreaCampus;

	@Column(name = "DURACION")
	private String duracion;
	
	@Column(name = "IDPERSONAREGISTRA")
	private Long idPersonaRegistra;

	public Long getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(Long idReunion) {
		this.idReunion = idReunion;
	}

	public String getClaveReunion() {
		return claveReunion;
	}

	public void setClaveReunion(String claveReunion) {
		this.claveReunion = claveReunion;
	}

	public Date getFcProgramar() {
		return fcProgramar;
	}

	public void setFcProgramar(Date fcProgramar) {
		this.fcProgramar = fcProgramar;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFcRealizacion() {
		return fcRealizacion;
	}

	public void setFcRealizacion(Date fcRealizacion) {
		this.fcRealizacion = fcRealizacion;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getUsuarioAudit() {
		return usuarioAudit;
	}

	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}

	public Long getIdProceso() {
		return idProceso;
	}

	public void setIdProceso(Long idProceso) {
		this.idProceso = idProceso;
	}

	public Integer getIdEstatusReunion() {
		return idEstatusReunion;
	}

	public void setIdEstatusReunion(Integer idEstatusReunion) {
		this.idEstatusReunion = idEstatusReunion;
	}

	public Long getIdAreaCampus() {
		return idAreaCampus;
	}

	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public Long getIdPersonaRegistra() {
		return idPersonaRegistra;
	}

	public void setIdPersonaRegistra(Long idPersonaRegistra) {
		this.idPersonaRegistra = idPersonaRegistra;
	}

}
