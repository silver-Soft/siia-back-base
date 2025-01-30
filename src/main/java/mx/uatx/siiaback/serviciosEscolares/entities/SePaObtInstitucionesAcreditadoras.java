package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtInstitucionesAcreditadoras {
	
	@Id
	@Column(name = "IDINSTITUCION")
	private Long lngIdInstitucion;
	
	@Column(name = "NBINSTITUCION")
	private String strNbInstitucion;
	
	@Column(name = "DSABREVIATURA")
	private String strDsAbreviatura;
	
	public Long getLngIdInstitucion() {
		return lngIdInstitucion;
	}
	public void setLngIdInstitucion(Long lngIdInstitucion) {
		this.lngIdInstitucion = lngIdInstitucion;
	}
	public String getStrNbInstitucion() {
		return strNbInstitucion;
	}
	public void setStrNbInstitucion(String strNbInstitucion) {
		this.strNbInstitucion = strNbInstitucion;
	}
	public String getStrDsAbreviatura() {
		return strDsAbreviatura;
	}
	public void setStrDsAbreviatura(String strDsAbreviatura) {
		this.strDsAbreviatura = strDsAbreviatura;
	}

}
