package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
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
@Table(schema = "SIIUAT", name="SIDTASISTENTESCONGRESOS")
public class SiDtAsistentesCongresos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4927546085303154435L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDASISTENTECONGRESO", sequenceName = "SIIUAT.IDASISTENTECONGRESO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDASISTENTECONGRESO")
    @NotNull
    
    @Column(name = "IDASISTENTECONGRESO")
	private Long lngIdAsistenteCongreso;
	
	@Column(name = "NBASISTENTE")
	private String strNbAsistente;
	
	@Column(name = "APPATERNOASISTENTE")
	private String strApPaternoAsistente;
	
	@Column(name = "APMATERNOASISTENTE")
	private String strApMaternoAsistente;
	
	@Column(name = "INSTITUCIONPROCEDENCIA")
	private String strInstitucionProcedencia;
	
	@Column(name = "ACTIVIDAD")
	private String strActividad;
	
	@Column(name = "TITULOPONENCIA")
    private String strTituloPonencia;
	
	@Column(name = "CORREO")
	private String strCorreo;
	
	@Column(name = "NMTELEFONO")
	private Integer intNmTelefono;
	
	@Column(name = "CLESTATUSASISTIO")
	private Integer intClEstatusAsistio;
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

	public Long getLngIdAsistenteCongreso() {
		return lngIdAsistenteCongreso;
	}

	public void setLngIdAsistenteCongreso(Long lngIdAsistenteCongreso) {
		this.lngIdAsistenteCongreso = lngIdAsistenteCongreso;
	}

	public String getStrNbAsistente() {
		return strNbAsistente;
	}

	public void setStrNbAsistente(String strNbAsistente) {
		this.strNbAsistente = strNbAsistente;
	}

	public String getStrApPaternoAsistente() {
		return strApPaternoAsistente;
	}

	public void setStrApPaternoAsistente(String strApPaternoAsistente) {
		this.strApPaternoAsistente = strApPaternoAsistente;
	}

	public String getStrApMaternoAsistente() {
		return strApMaternoAsistente;
	}

	public void setStrApMaternoAsistente(String strApMaternoAsistente) {
		this.strApMaternoAsistente = strApMaternoAsistente;
	}

	public String getStrInstitucionProcedencia() {
		return strInstitucionProcedencia;
	}

	public void setStrInstitucionProcedencia(String strInstitucionProcedencia) {
		this.strInstitucionProcedencia = strInstitucionProcedencia;
	}

	public String getStrActividad() {
		return strActividad;
	}

	public void setStrActividad(String strActividad) {
		this.strActividad = strActividad;
	}

	public String getStrTituloPonencia() {
		return strTituloPonencia;
	}

	public void setStrTituloPonencia(String strTituloPonencia) {
		this.strTituloPonencia = strTituloPonencia;
	}

	public String getStrCorreo() {
		return strCorreo;
	}

	public void setStrCorreo(String strCorreo) {
		this.strCorreo = strCorreo;
	}

	public Integer getIntNmTelefono() {
		return intNmTelefono;
	}

	public void setIntNmTelefono(Integer intNmTelefono) {
		this.intNmTelefono = intNmTelefono;
	}

	public Integer getIntClEstatusAsistio() {
		return intClEstatusAsistio;
	}

	public void setIntClEstatusAsistio(Integer intClEstatusAsistio) {
		this.intClEstatusAsistio = intClEstatusAsistio;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}
	
	
}
