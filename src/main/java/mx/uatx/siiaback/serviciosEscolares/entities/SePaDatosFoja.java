package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaDatosFoja {

	@Id
	@Column(name = "IDTITULO")
	private Integer intIdTitulo;

	@Column(name = "NMTITULO")
	private Integer intNmTitulo;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "FCEXPEDICION")
	private Date fcExpedicion;

	@Column(name = "AREA")
	private String strArea;

	@Column(name = "NBCARRERA")
	private String nbCarrerea;

	@Column(name = "FCSELLADO")
	private Date fcSellado;

	@Column(name = "TIPO")
	private String strTipo;

	@Column(name = "FOTO")
	@Lob
	private byte[] archivo;
	
	@Column(name = "FOJA")
	private String foja;

	public SePaDatosFoja() {
		super();
	}

	public Integer getIntIdTitulo() {
		return intIdTitulo;
	}

	public void setIntIdTitulo(Integer intIdTitulo) {
		this.intIdTitulo = intIdTitulo;
	}

	public Integer getIntNmTitulo() {
		return intNmTitulo;
	}

	public void setIntNmTitulo(Integer intNmTitulo) {
		this.intNmTitulo = intNmTitulo;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public Date getFcExpedicion() {
		return fcExpedicion;
	}

	public void setFcExpedicion(Date fcExpedicion) {
		this.fcExpedicion = fcExpedicion;
	}

	public String getStrArea() {
		return strArea;
	}

	public void setStrArea(String strArea) {
		this.strArea = strArea;
	}

	public String getNbCarrerea() {
		return nbCarrerea;
	}

	public void setNbCarrerea(String nbCarrerea) {
		this.nbCarrerea = nbCarrerea;
	}

	public Date getFcSellado() {
		return fcSellado;
	}

	public void setFcSellado(Date fcSellado) {
		this.fcSellado = fcSellado;
	}

	public String getStrTipo() {
		return strTipo;
	}

	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getFoja() {
		return foja;
	}

	public void setFoja(String foja) {
		this.foja = foja;
	}

}
