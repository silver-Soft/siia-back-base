package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SEMSAPOYOSPSICOLOGICOS")
public class SeMsApoyosPsicologicos {

	@Id
	@Column(name = "IDAPOYOPSICOLOGICO", unique = true, nullable = false, precision = 15, scale = 0)
	@SequenceGenerator(name = "generadorApoyoPsicologicoId", sequenceName = "SERESC.IDAPOYOPSICOLOGICO", allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generadorApoyoPsicologicoId")
	private int idapoyopsicologico;
	
	@Column(name = "IDHISTORIALACADEMICO")
	private Integer intIdHistorialAcademico;
	
	@Column(name = "IDTUTOR")
	private Integer seMsTutor;
	
	@Column(name = "FCSOLICITUD")
	private Date fcsolicitud;
	
	@Column(name="DSMOTIVOCANALIZACION")
	private String motivocanalizacion;
	
	@Column(name="TIPOPERSONACANALIZO")
	private String tipopersonacanalizo;
	
	@Column(name = "IDPERSONA")	
	private Integer intIdPersona;
	
	@Column(name="ESTATUS")
	private String estatus;
	
	@Column(name = "FCAUDIT")
	private Date fcaudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioaudit;
	
	@Column(name = "ESTADOCIVILPADRE")
	private String strEstadoCivilPadre;
	
	@Column(name = "EDADPADRE")
	private Integer intEdadPadre;
	
	@Column(name = "ESTADOCIVILMADRE")
	private String strEstadoCivilMadre;
	
	@Column(name = "EDADMADRE")
	private Integer intEdadMadre;
	
	
	

	public SeMsApoyosPsicologicos() {
		super();
	}

	public int getIdapoyopsicologico() {
		return idapoyopsicologico;
	}

	public void setIdapoyopsicologico(int idapoyopsicologico) {
		this.idapoyopsicologico = idapoyopsicologico;
	}

	public Integer getIntIdHistorialAcademico() {
		return intIdHistorialAcademico;
	}

	public void setIntIdHistorialAcademico(Integer intIdHistorialAcademico) {
		this.intIdHistorialAcademico = intIdHistorialAcademico;
	}

	

	public Integer getSeMsTutor() {
		return seMsTutor;
	}

	public void setSeMsTutor(Integer seMsTutor) {
		this.seMsTutor = seMsTutor;
	}

	public Date getFcsolicitud() {
		return fcsolicitud;
	}

	public void setFcsolicitud(Date fcsolicitud) {
		this.fcsolicitud = fcsolicitud;
	}

	public String getMotivocanalizacion() {
		return motivocanalizacion;
	}

	public void setMotivocanalizacion(String motivocanalizacion) {
		this.motivocanalizacion = motivocanalizacion;
	}

	public String getTipopersonacanalizo() {
		return tipopersonacanalizo;
	}

	public void setTipopersonacanalizo(String tipopersonacanalizo) {
		this.tipopersonacanalizo = tipopersonacanalizo;
	}

	public Integer getIntIdPersona() {
		return intIdPersona;
	}

	public void setIntIdPersona(Integer intIdPersona) {
		this.intIdPersona = intIdPersona;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFcaudit() {
		return fcaudit;
	}

	public void setFcaudit(Date fcaudit) {
		this.fcaudit = fcaudit;
	}

	public String getUsuarioaudit() {
		return usuarioaudit;
	}

	public void setUsuarioaudit(String usuarioaudit) {
		this.usuarioaudit = usuarioaudit;
	}

	public String getStrEstadoCivilPadre() {
		return strEstadoCivilPadre;
	}

	public void setStrEstadoCivilPadre(String strEstadoCivilPadre) {
		this.strEstadoCivilPadre = strEstadoCivilPadre;
	}

	public Integer getIntEdadPadre() {
		return intEdadPadre;
	}

	public void setIntEdadPadre(Integer intEdadPadre) {
		this.intEdadPadre = intEdadPadre;
	}

	public String getStrEstadoCivilMadre() {
		return strEstadoCivilMadre;
	}

	public void setStrEstadoCivilMadre(String strEstadoCivilMadre) {
		this.strEstadoCivilMadre = strEstadoCivilMadre;
	}

	public Integer getIntEdadMadre() {
		return intEdadMadre;
	}

	public void setIntEdadMadre(Integer intEdadMadre) {
		this.intEdadMadre = intEdadMadre;
	}

	
	
	
	
}
