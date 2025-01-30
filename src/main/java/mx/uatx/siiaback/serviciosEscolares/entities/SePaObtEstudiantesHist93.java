package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;

@Entity
public class SePaObtEstudiantesHist93 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4270234157312663120L;
	
	@Id
	@Column(name = "IDALUMNO")
	private Long lngIdAlumno;
	
	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "AP_PATERNO")
	private String strApPaterno;
	
	@Column(name = "AP_MATERNO")
	private String StrApMaterno;
	
	@Column(name = "DESCRIPCION")
	private String strNivelEducativo;
	
	@Column(name = "LICENCIATURA")
	private String strProgramaEducativo;
	
	@Column(name = "PERMITEVISTAPREVIA")
	private Boolean blnPermiteVistaPrevia;
	
	@Column(name = "PERMITEIMPRIMIR")
	private Boolean blnPermiteImprimir;

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return StrApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		StrApMaterno = strApMaterno;
	}

	public String getStrNivelEducativo() {
		return strNivelEducativo;
	}

	public void setStrNivelEducativo(String strNivelEducativo) {
		this.strNivelEducativo = strNivelEducativo;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public Boolean getBlnPermiteVistaPrevia() {
		return blnPermiteVistaPrevia;
	}

	public void setBlnPermiteVistaPrevia(Boolean blnPermiteVistaPrevia) {
		this.blnPermiteVistaPrevia = blnPermiteVistaPrevia;
	}

	public Boolean getBlnPermiteImprimir() {
		return blnPermiteImprimir;
	}

	public void setBlnPermiteImprimir(Boolean blnPermiteImprimir) {
		this.blnPermiteImprimir = blnPermiteImprimir;
	}
	public Long getLngIdAlumno() {
		return lngIdAlumno;
	}
	public void setLngIdAlumno(Long lngIdAlumno) {
		this.lngIdAlumno = lngIdAlumno;
	}
}
