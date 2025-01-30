package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtDatosReporteResumenAsp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7388783105153819664L;
	
	@Column(name = "FACULTAD")
	private String strFacultad;
	
	@Column(name = "CAMPUS")
	private String strCampus;
	
	@Column(name = "PROGRAMA_EDUCATIVO")
	private String strPrograma;

	@Column(name = "NIVEL_EDUCATIVO")
	private String strNivel;
	@Id
	@Column(name = "FOLIO_UAT")
	private Long lngFolioUat;
	
	@Column(name = "FOLIO_CENEVAL")
	private Long lngFolioCeneval;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "APELLIDO_PATERNO")
	private String strApellidoPaterno;
	
	@Column(name = "APELLIDO_MATERNO")
	private String strApellidoMaterno;
	
	public SePaObtDatosReporteResumenAsp() {
		super();
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrCampus() {
		return strCampus;
	}

	public void setStrCampus(String strCampus) {
		this.strCampus = strCampus;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrNivel() {
		return strNivel;
	}

	public void setStrNivel(String strNivel) {
		this.strNivel = strNivel;
	}

	public Long getLngFolioUat() {
		return lngFolioUat;
	}

	public void setLngFolioUat(Long lngFolioUat) {
		this.lngFolioUat = lngFolioUat;
	}

	public Long getLngFolioCeneval() {
		return lngFolioCeneval;
	}

	public void setLngFolioCeneval(Long lngFolioCeneval) {
		this.lngFolioCeneval = lngFolioCeneval;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApellidoPaterno() {
		return strApellidoPaterno;
	}

	public void setStrApellidoPaterno(String strApellidoPaterno) {
		this.strApellidoPaterno = strApellidoPaterno;
	}

	public String getStrApellidoMaterno() {
		return strApellidoMaterno;
	}

	public void setStrApellidoMaterno(String strApellidoMaterno) {
		this.strApellidoMaterno = strApellidoMaterno;
	}
	
	
}
