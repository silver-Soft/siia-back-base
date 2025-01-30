package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasAntConstFormatoUnico implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6219364043398581434L;
	@Id
	@Column(name = "IDOFERTA")
	private Long lngIdOferta;
	
	@Column(name = "MATERIA_REAL")
	private String strMateriaReal;
	
	@Column(name = "DSCALIFICACION")
	private String strDsCalificacion;
	
	@Column(name = "FCREGISTROACTA")
	private String strDsRegistroActa;

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrMateriaReal() {
		return strMateriaReal;
	}

	public void setStrMateriaReal(String strMateriaReal) {
		this.strMateriaReal = strMateriaReal;
	}

	public String getStrDsCalificacion() {
		return strDsCalificacion;
	}

	public void setStrDsCalificacion(String strDsCalificacion) {
		this.strDsCalificacion = strDsCalificacion;
	}

	public String getStrDsRegistroActa() {
		return strDsRegistroActa;
	}

	public void setStrDsRegistroActa(String strDsRegistroActa) {
		this.strDsRegistroActa = strDsRegistroActa;
	}
	
	
}
