package mx.uatx.siiaback.serviciosEscolares.entities;

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
@Table(schema = "SERESC", name = "SEAXRESPSERSOC")
public class SeAxRespSerSoc implements java.io.Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -229310951816448996L;

	@Id
	@Basic(optional = false)
	@Column(name = "ID_SEAXRESPSERSOC")
	@SequenceGenerator(name = "GENID_SEAXRESPSERSOC", sequenceName = "SERESC.ID_SEAXRESPSERSOC", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_SEAXRESPSERSOC")
	private Long lngIdResponsableSerSoc;

	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "IDHISTORIALLABORAL")
	private Long lngIdHistorialLaboral;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioLog;
	
	@Column(name = "CLESTATUS")
	private Integer intIdEstatus;
	
	@Column(name = "IDINSTITUCIONCONVENIO")
	private Long idInstitucion;

	public Long getLngIdResponsableSerSoc() {
		return lngIdResponsableSerSoc;
	}

	public void setLngIdResponsableSerSoc(Long lngIdResponsableSerSoc) {
		this.lngIdResponsableSerSoc = lngIdResponsableSerSoc;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public Long getLngIdHistorialLaboral() {
		return lngIdHistorialLaboral;
	}

	public void setLngIdHistorialLaboral(Long lngIdHistorialLaboral) {
		this.lngIdHistorialLaboral = lngIdHistorialLaboral;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioLog() {
		return strUsuarioLog;
	}

	public void setStrUsuarioLog(String strUsuarioLog) {
		this.strUsuarioLog = strUsuarioLog;
	}

	public Integer getIntIdEstatus() {
		return intIdEstatus;
	}

	public void setIntIdEstatus(Integer intIdEstatus) {
		this.intIdEstatus = intIdEstatus;
	}

	public Long getIdInstitucion() {
		return idInstitucion;
	}

	public void setIdInstitucion(Long idInstitucion) {
		this.idInstitucion = idInstitucion;
	}
	
}
