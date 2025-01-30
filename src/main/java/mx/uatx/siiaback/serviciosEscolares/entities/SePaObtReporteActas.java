package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtReporteActas implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3515323441900894899L;
	@Id
	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "DSMATERIA")
	private String strDsMateria;
	
	@Column(name = "DOCENTE")
	private String strDocente;
	
	@Column(name = "DSESTATUSOFERTA")
	private String strDsEstatusOferta;
	
	@Column(name = "PRIMERPARCIAL")
	private String strPrimerParcial;
	
	@Column(name = "SEGUNDOPARCIAL")
	private String strSegundoParcial;
	
	@Column(name = "TERCERPARCIAL")
	private String strTercerParcial;
	
	@Column(name = "ORDINARIO")
	private String strOrdinario;
	
	@Column(name = "EXTRA")
	private String strExtra;
	
	@Column(name = "TITULO")
	private String strTitulo;
	
	public SePaObtReporteActas() {
		super();
	}

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrDsMateria() {
		return strDsMateria;
	}

	public void setStrDsMateria(String strDsMateria) {
		this.strDsMateria = strDsMateria;
	}

	public String getStrDocente() {
		return strDocente;
	}

	public void setStrDocente(String strDocente) {
		this.strDocente = strDocente;
	}

	public String getStrPrimerParcial() {
		return strPrimerParcial;
	}

	public void setStrPrimerParcial(String strPrimerParcial) {
		this.strPrimerParcial = strPrimerParcial;
	}

	public String getStrSegundoParcial() {
		return strSegundoParcial;
	}

	public void setStrSegundoParcial(String strSegundoParcial) {
		this.strSegundoParcial = strSegundoParcial;
	}

	public String getStrTercerParcial() {
		return strTercerParcial;
	}

	public void setStrTercerParcial(String strTercerParcial) {
		this.strTercerParcial = strTercerParcial;
	}

	public String getStrOrdinario() {
		return strOrdinario;
	}

	public void setStrOrdinario(String strOrdinario) {
		this.strOrdinario = strOrdinario;
	}

	public String getStrExtra() {
		return strExtra;
	}

	public void setStrExtra(String strExtra) {
		this.strExtra = strExtra;
	}

	public String getStrTitulo() {
		return strTitulo;
	}

	public void setStrTitulo(String strTitulo) {
		this.strTitulo = strTitulo;
	}

	public String getStrDsEstatusOferta() {
		return strDsEstatusOferta;
	}

	public void setStrDsEstatusOferta(String strDsEstatusOferta) {
		this.strDsEstatusOferta = strDsEstatusOferta;
	}
	
}
