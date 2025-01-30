package mx.uatx.siiaback.serviciosEscolares.entities;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXREFERENCIASACADEMICASASP")
public class SeAxReferenciasAcademicasAsp implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5652580118606045853L;

	private static final String GENID_REFERECIAS_ACAD_ASP = "GENIDREFERENCIAACADEMICAASP";

	@Id
	@Basic(optional = false)
	@Column(name = "IDREFERENCIAACADEMICAASP")
	@SequenceGenerator(name = GENID_REFERECIAS_ACAD_ASP, sequenceName = "SERESC.IDREFERENCIAACADEMICAASP", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_REFERECIAS_ACAD_ASP)
	private Long lngIdReferenciaAcademicaAsp;

	@Column(name = "NBREFERENCIA")
	private String strNbReferencia;

	@Column(name = "CARGO")
	private String strCargo;

	@Column(name = "INSTITUCIONREFER")
	private String strInstitucionReferencia;

	@Column(name = "NMTELEFONO")
	private String strNumTelefono;

	@Column(name = "CORREOELECTRONICO")
	private String strCorreoElectronico;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;

	public Long getLngIdReferenciaAcademicaAsp() {
		return lngIdReferenciaAcademicaAsp;
	}

	public void setLngIdReferenciaAcademicaAsp(Long lngIdReferenciaAcademicaAsp) {
		this.lngIdReferenciaAcademicaAsp = lngIdReferenciaAcademicaAsp;
	}

	public String getStrNbReferencia() {
		return strNbReferencia;
	}

	public void setStrNbReferencia(String strNbReferencia) {
		this.strNbReferencia = strNbReferencia;
	}

	public String getStrCargo() {
		return strCargo;
	}

	public void setStrCargo(String strCargo) {
		this.strCargo = strCargo;
	}

	public String getStrInstitucionReferencia() {
		return strInstitucionReferencia;
	}

	public void setStrInstitucionReferencia(String strInstitucionReferencia) {
		this.strInstitucionReferencia = strInstitucionReferencia;
	}

	public String getStrNumTelefono() {
		return strNumTelefono;
	}

	public void setStrNumTelefono(String strNumTelefono) {
		this.strNumTelefono = strNumTelefono;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Long getLngIdAspirante() {
		return lngIdAspirante;
	}

	public void setLngIdAspirante(Long lngIdAspirante) {
		this.lngIdAspirante = lngIdAspirante;
	}
}
