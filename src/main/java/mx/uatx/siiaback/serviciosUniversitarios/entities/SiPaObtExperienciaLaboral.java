package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtExperienciaLaboral implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6399378557320944380L;
	@Id
    @Column(name = "IDTRANSEXPERIENCIALABORAL")
	private Long lngIdExperienciaLaboral;
	
	@Column(name = "CARGOEXPERIENCIA")
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
	
	public SiPaObtExperienciaLaboral() {
		super();
	}

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
	
	
	
}
