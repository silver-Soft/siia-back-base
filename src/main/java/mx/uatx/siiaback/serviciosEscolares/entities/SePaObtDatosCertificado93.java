package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosCertificado93 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2572976047775346248L;

	@Id
	@Column(name = "ROWNUM")
	private Integer intId;

	@Column(name = "ARTICULO")
	private String strArticulo;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "AP_PATERNO")
	private String strApPaterno;
	
	@Column(name = "AP_MATERNO")
	private String strApMaterno;

	@Column(name = "ST")
	private String strSecretarioTecnico;
	
	@Column(name = "SECRETARIOTECNICO")
	private String strSecretarioTecnicoComp;
	
	@Column(name = "CYRE")
	private String strCyRE;

	@Column(name = "FACULTAD")
	private String strFacultad;
	
	@Column(name = "DESCRIP")
	private String strNivelEducativo;
	
	@Column(name = "LICENCIA")
	private String strLicenciatura;
	
	@Column(name = "ESCALA")
	private String strEscala;
	
	@Column(name = "MINIMO")
	private Integer intMinimo;

	public String getStrSecretarioTecnicoComp() {
		return strSecretarioTecnicoComp;
	}

	public void setStrSecretarioTecnicoComp(String strSecretarioTecnicoComp) {
		this.strSecretarioTecnicoComp = strSecretarioTecnicoComp;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getStrArticulo() {
		return strArticulo;
	}

	public void setStrArticulo(String strArticulo) {
		this.strArticulo = strArticulo;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrNivelEducativo() {
		return strNivelEducativo;
	}

	public void setStrNivelEducativo(String strNivelEducativo) {
		this.strNivelEducativo = strNivelEducativo;
	}

	public String getStrEscala() {
		return strEscala;
	}

	public void setStrEscala(String strEscala) {
		this.strEscala = strEscala;
	}

	public Integer getIntMinimo() {
		return intMinimo;
	}

	public void setIntMinimo(Integer intMinimo) {
		this.intMinimo = intMinimo;
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
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrSecretarioTecnico() {
		return strSecretarioTecnico;
	}

	public void setStrSecretarioTecnico(String strSecretarioTecnico) {
		this.strSecretarioTecnico = strSecretarioTecnico;
	}

	public String getStrCyRE() {
		return strCyRE;
	}

	public void setStrCyRE(String strCyRE) {
		this.strCyRE = strCyRE;
	}

	public String getStrLicenciatura() {
		return strLicenciatura;
	}

	public void setStrLicenciatura(String strLicenciatura) {
		this.strLicenciatura = strLicenciatura;
	}
	
}
