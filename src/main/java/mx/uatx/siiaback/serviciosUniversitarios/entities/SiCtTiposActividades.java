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

@Entity
@Table(schema = "SIIUAT", name = "SI_CT_TIPOS_ACTIVIDADES")
public class SiCtTiposActividades {
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "ID_TIPO_ACTIVIDAD", sequenceName = "SIIUAT.ID_TIPO_ACTIVIDAD", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_TIPO_ACTIVIDAD")
	@Column(name = "ID_TIPO_ACTIVIDAD")
	private Long idTipoActividad;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "SEGUIMIENTO")
	private Integer seguimiento;
	
	@Column(name = "ID_AREA_CAMPUS")
	private Long idAreaCampus;
	
	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;
	
	public Long getIdTipoActividad() {
		return idTipoActividad;
	}
	public void setIdTipoActividad(Long idTipoActividad) {
		this.idTipoActividad = idTipoActividad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getSeguimiento() {
		return seguimiento;
	}
	public void setSeguimiento(Integer seguimiento) {
		this.seguimiento = seguimiento;
	}
	public Long getIdAreaCampus() {
		return idAreaCampus;
	}
	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
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
