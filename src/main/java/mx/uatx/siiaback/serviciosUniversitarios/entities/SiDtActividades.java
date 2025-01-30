package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SIIUAT", name = "SI_DT_ACTIVIDADES")
public class SiDtActividades {
	
	@Id
	@Column(name = "ID_DT_ACTIVIDAD")
	@SequenceGenerator(name = "generadorIdentificadorDtAct", sequenceName = "SIIUAT.ID_DT_ACTIVIDAD", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorIdentificadorDtAct")
	private Long idDtActividad;
	
	@Column(name = "FECHA_TERMINO")
	private Date fcTermino;
	
	@Column(name = "ID_ESTATUS_ACTIVIDAD")
	private Integer idEstatusActividad;
	
	@Column(name = "ID_ACTIVIDAD")
	private Long idActividad;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;

	public Long getIdDtActividad() {
		return idDtActividad;
	}

	public void setIdDtActividad(Long idDtActividad) {
		this.idDtActividad = idDtActividad;
	}

	public Date getFcTermino() {
		return fcTermino;
	}

	public void setFcTermino(Date fcTermino) {
		this.fcTermino = fcTermino;
	}

	public Integer getIdEstatusActividad() {
		return idEstatusActividad;
	}

	public void setIdEstatusActividad(Integer idEstatusActividad) {
		this.idEstatusActividad = idEstatusActividad;
	}

	public Long getIdActividad() {
		return idActividad;
	}

	public void setIdActividad(Long idActividad) {
		this.idActividad = idActividad;
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
	
	
}
