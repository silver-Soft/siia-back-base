package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaRespSerSoc implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6613948109070366159L;

	@Id
	@Column(name = "ID_SEAXRESPSERSOC")
	private Long lngIdResponsableSerSoc;

	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "IDHISTORIALLABORAL")
	private Long lngIdHistorialLaboral;

	@Column(name = "NOMBREAREA")
	private String strNombreAreaCampus;

	@Column(name = "NOMBREPROGRAMA")
	private String strNombreProgramaCampus;

	@Column(name = "NOMBRERESPONSABLE")
	private String strNombreResponsable;
	
	@Column(name = "CLESTATUS")
	private Integer intIdEstatus;
	
	@Column(name = "DSESTATUS")
	private String strEstatus;
	
	@Column(name = "IDINSTITUCIONCONVENIO")
	private Long idInstitucion;

	public SePaRespSerSoc() {
		super();
	}

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

	public String getStrNombreAreaCampus() {
		return strNombreAreaCampus;
	}

	public void setStrNombreAreaCampus(String strNombreAreaCampus) {
		this.strNombreAreaCampus = strNombreAreaCampus;
	}

	public String getStrNombreProgramaCampus() {
		return strNombreProgramaCampus;
	}

	public void setStrNombreProgramaCampus(String strNombreProgramaCampus) {
		this.strNombreProgramaCampus = strNombreProgramaCampus;
	}

	public String getStrNombreResponsable() {
		return strNombreResponsable;
	}

	public void setStrNombreResponsable(String strNombreResponsable) {
		this.strNombreResponsable = strNombreResponsable;
	}

	public Integer getIntIdEstatus() {
		return intIdEstatus;
	}

	public void setIntIdEstatus(Integer intIdEstatus) {
		this.intIdEstatus = intIdEstatus;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Long getIdInstitucion() {
		return idInstitucion;
	}

	public void setIdInstitucion(Long idInstitucion) {
		this.idInstitucion = idInstitucion;
	}
}
