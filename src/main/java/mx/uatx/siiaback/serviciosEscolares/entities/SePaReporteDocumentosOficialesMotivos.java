package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteDocumentosOficialesMotivos {

	@Id
	@Column(name="ID")
	private Integer intId;

	@Column(name="TIPOTRAMITE")
	private String strTipoTramite;

	@Column(name="DSNIVELEDUCATIVO")
	private String strDsNivelEducativo;

	@Column(name="NUMERO")
	private Integer intNumero;

	@Column(name="HOMBRES")
	private Integer intHombre;

	@Column(name="MUJERES")
	private Integer intMujeres;

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrTipoTramite() {
		return strTipoTramite;
	}

	public void setStrTipoTramite(String strTipoTramite) {
		this.strTipoTramite = strTipoTramite;
	}

	public String getStrDsNivelEducativo() {
		return strDsNivelEducativo;
	}

	public void setStrDsNivelEducativo(String strDsNivelEducativo) {
		this.strDsNivelEducativo = strDsNivelEducativo;
	}

	public Integer getIntNumero() {
		return intNumero;
	}

	public void setIntNumero(Integer intNumero) {
		this.intNumero = intNumero;
	}

	public Integer getIntHombre() {
		return intHombre;
	}

	public void setIntHombre(Integer intHombre) {
		this.intHombre = intHombre;
	}

	public Integer getIntMujeres() {
		return intMujeres;
	}

	public void setIntMujeres(Integer intMujeres) {
		this.intMujeres = intMujeres;
	}
	
	

}
