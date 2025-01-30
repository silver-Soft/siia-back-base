package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaProgramaExterno implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1269877136493245963L;
	
	@Id
	@Column(name = "IDPROGRAMAESTUDIOEXTERNO")
	private Integer intIdAreaCampus;
	
	@Column(name = "CALVEPROGRAMAESTUDIO")
	private Integer intCveNivelEducativo;
	

	@Column(name = "NBPROGRAMAESTUDIOEXTERNO")
	private String strDsProgramaEducativo;
	
	
	@Column(name = "FIRMA")
	@Lob
	private byte[] firma;
	

	public SePaProgramaExterno() {
		super();
	}

	

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntCveNivelEducativo() {
		return intCveNivelEducativo;
	}

	public void setIntCveNivelEducativo(Integer intCveNivelEducativo) {
		this.intCveNivelEducativo = intCveNivelEducativo;
	}


	public String getStrDsProgramaEducativo() {
		return strDsProgramaEducativo;
	}

	public void setStrDsProgramaEducativo(String strDsProgramaEducativo) {
		this.strDsProgramaEducativo = strDsProgramaEducativo;
	}



	public byte[] getFirma() {
		return firma;
	}



	public void setFirma(byte[] firma) {
		this.firma = firma;
	}
	
	
	
	


}
