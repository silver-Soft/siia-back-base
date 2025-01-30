package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtDatosReporteCurriculumExp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2898654929032007940L;
	@Id
    @Column(name = "IDTRANSEXPERIENCIALABORAL")
	private Long lngIdExperienciaLaboral;
	
	@Column(name = "FCINICIO")
	private String strFcInicio;
	
	@Column(name = "FCCONCLUSION")
	private String strFcConclusion;
	
	@Column(name = "CARGOEXPERIENCIA")
	private String strCargo;
	
	@Column(name = "CAMPOEXPERIENCIA")
	private String strCampoExperiencia;
	
	@Column(name = "NBINSTITUCION")
	private String strNbInstitucion;

	public Long getLngIdExperienciaLaboral() {
		return lngIdExperienciaLaboral;
	}

	public void setLngIdExperienciaLaboral(Long lngIdExperienciaLaboral) {
		this.lngIdExperienciaLaboral = lngIdExperienciaLaboral;
	}



	public String getStrFcInicio() {
		return strFcInicio;
	}

	public void setStrFcInicio(String strFcInicio) {
		this.strFcInicio = strFcInicio;
	}

	public String getStrFcConclusion() {
		return strFcConclusion;
	}

	public void setStrFcConclusion(String strFcConclusion) {
		this.strFcConclusion = strFcConclusion;
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

	public String getStrNbInstitucion() {
		return strNbInstitucion;
	}

	public void setStrNbInstitucion(String strNbInstitucion) {
		this.strNbInstitucion = strNbInstitucion;
	}
	
	
	

}
