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
@Table(schema = "SIIUAT", name="SIDTASISTENTESEVENTOS")
public class SiDtAsistentesEventos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5777275506546537306L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDASISTENTEEVENTO", sequenceName = "SIIUAT.IDASISTENTEEVENTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDASISTENTEEVENTO")
    @NotNull
    
    @Column(name = "IDASISTENTEEVENTO")
	private Long lngIdAsistenteEvento;
	
	@Column(name = "IDHISTORIALACADEMICO")
	private Long lngIdHistorialAcademico;
	
	@Column(name = "IDHISTORIALLABORAL")
	private Long lngIdHistorialLaboral;
	
	@Column(name = "NBASISTENTE")
	private String strNbAsistente;
	
	@Column(name = "APPATERNOASISTENTE")
	private String strApPaternoAsistente;
	
	@Column(name = "APMATERNOASISTENTE")
	private String strApMaternoAsistente;
	
	@Column(name = "CORREOASISTENTE")
	private String strCorreoAsistente;
	
	@Column(name = "TELEFONOASISTENTE")
	private String strTelefonoAsistente;
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;
    
	@Column(name = "IDEVENTOCONSTANCIA")
	private Long lngIdEventoCosntancia;
	
	@Column(name = "ENTIDADFEDERATIVA")
    private String strEntidadFederativa;
	
	@Column(name = "INSTITUCIONPROCEDENCIA")
    private String strInstitucionProcedencia;
	
	@Column(name = "CURP")
    private String strCurp;
	
	@Column(name = "ESTATUSASISTENTE")
    private String strEstatusAsistente;

	public Long getLngIdAsistenteEvento() {
		return lngIdAsistenteEvento;
	}

	public void setLngIdAsistenteEvento(Long lngIdAsistenteEvento) {
		this.lngIdAsistenteEvento = lngIdAsistenteEvento;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public Long getLngIdHistorialLaboral() {
		return lngIdHistorialLaboral;
	}

	public void setLngIdHistorialLaboral(Long lngIdHistorialLaboral) {
		this.lngIdHistorialLaboral = lngIdHistorialLaboral;
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

	public String getStrCorreoAsistente() {
		return strCorreoAsistente;
	}

	public void setStrCorreoAsistente(String strCorreoAsistente) {
		this.strCorreoAsistente = strCorreoAsistente;
	}

	public String getStrTelefonoAsistente() {
		return strTelefonoAsistente;
	}

	public void setStrTelefonoAsistente(String strTelefonoAsistente) {
		this.strTelefonoAsistente = strTelefonoAsistente;
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

	public Long getLngIdEventoCosntancia() {
		return lngIdEventoCosntancia;
	}

	public void setLngIdEventoCosntancia(Long lngIdEventoCosntancia) {
		this.lngIdEventoCosntancia = lngIdEventoCosntancia;
	}

	public String getStrEstatusAsistente() {
		return strEstatusAsistente;
	}

	public void setStrEstatusAsistente(String strEstatusAsistente) {
		this.strEstatusAsistente = strEstatusAsistente;
	}

	public String getStrEntidadFederativa() {
		return strEntidadFederativa;
	}

	public void setStrEntidadFederativa(String strEntidadFederativa) {
		this.strEntidadFederativa = strEntidadFederativa;
	}

	public String getStrInstitucionProcedencia() {
		return strInstitucionProcedencia;
	}

	public void setStrInstitucionProcedencia(String strInstitucionProcedencia) {
		this.strInstitucionProcedencia = strInstitucionProcedencia;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}
	
}
