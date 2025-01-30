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
@Table(name="SIIUAT.SIAXTRANSEXPERIENCIALABORAL")
public class SiAxTransExperienciaLaboral implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 142124225226388157L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDTRANSEXPERIENCIALABORAL", sequenceName = "SIIUAT.IDTRANSEXPERIENCIALABORAL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDTRANSEXPERIENCIALABORAL")
    @NotNull
    
    @Column(name = "IDTRANSEXPERIENCIALABORAL")
	private Long lngIdExperienciaLaboral;
	
	@Column(name = "CARGO")
	private String strCargo;
	
	@Column(name = "CAMPOEXPERIENCIA")
	private String strCampoExperiencia;
	
	@Column(name = "FUNCIONES")
	private String strFunciones;
	
	@Column(name = "NBINSTITUCION")
	private String strNbInstitucion;
	
	@Column(name = "FCINICIO")
	private Date dtFcInicio;
	
	@Column(name = "FCCONCLUSION")
	private Date dtFcConclusion;
	
	@Column(name = "IDINFORMACIONCURRICULAR")
	private Long lngIdInformacionCurricular;
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

	public Long getLngIdExperienciaLaboral() {
		return lngIdExperienciaLaboral;
	}

	public void setLngIdExperienciaLaboral(Long lngIdExperienciaLaboral) {
		this.lngIdExperienciaLaboral = lngIdExperienciaLaboral;
	}

	public String getStrCargo() {
		return strCargo;
	}

	public void setStrCargo(String strCargo) {
		this.strCargo = strCargo;
	}

	public String getStrCampoExperiencia() {
		return strCampoExperiencia;
	}

	public void setStrCampoExperiencia(String strCampoExperiencia) {
		this.strCampoExperiencia = strCampoExperiencia;
	}

	public String getStrFunciones() {
		return strFunciones;
	}

	public void setStrFunciones(String strFunciones) {
		this.strFunciones = strFunciones;
	}

	public String getStrNbInstitucion() {
		return strNbInstitucion;
	}

	public void setStrNbInstitucion(String strNbInstitucion) {
		this.strNbInstitucion = strNbInstitucion;
	}

	public Date getDtFcInicio() {
		return dtFcInicio;
	}

	public void setDtFcInicio(Date dtFcInicio) {
		this.dtFcInicio = dtFcInicio;
	}

	public Date getDtFcConclusion() {
		return dtFcConclusion;
	}

	public void setDtFcConclusion(Date dtFcConclusion) {
		this.dtFcConclusion = dtFcConclusion;
	}



	public Long getLngIdInformacionCurricular() {
		return lngIdInformacionCurricular;
	}

	public void setLngIdInformacionCurricular(Long lngIdInformacionCurricular) {
		this.lngIdInformacionCurricular = lngIdInformacionCurricular;
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
