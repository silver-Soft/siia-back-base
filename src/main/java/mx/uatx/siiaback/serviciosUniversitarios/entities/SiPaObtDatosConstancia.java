package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
@Entity
public class SiPaObtDatosConstancia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1261539058331690795L;
	@Id
	
	@Column(name = "IDASISTENTEEVENTO")
	private Long lngIdAsistenteEvento;
	
	@Column(name = "IDEVENTOCONSTANCIA")
	private Long lngIdEventoConstancia;
	
	@Column(name = "NBASISTENTE")
	private String strNbAsistente;
	
	@Column(name = "NBEVENTOCONSTANCIA")
	private String strNbEventoConstancia;
	
	@Column(name = "LUGAR")
	private String strLugar;
	
	@Column(name = "FCINICIO")
	private String strFcInicio;
	
	@Column(name = "FCFIN")
	private String strFcFin;
	
	@Column(name = "DURACIONHORAS")
	private Integer intDuracionHoras;
	
	@Column(name = "NOMBREFIRMA")
	private String strNombreFirma;
	
	@Column(name = "CADENAQR")
	private String strCadena;
	
	@Column(name = "PUESTO")
	private String strPuesto;
	
	@Column(name = "TEXTOCONSTANCIA")
	private String strTextoConstancia;
	
	@Lob
    @Column(name = "IMAGENENCABEZADO")
    private byte[] imagenEncabezado;
	
	@Lob
    @Column(name = "IMAGENFIRMA")
    private byte[] imagenFirma;
	
	@Column(name = "FOLIO")
	private String strFolio;
	
	@Column(name = "LUGARFECHA")
	private String strLugarFecha;
	
	public SiPaObtDatosConstancia() {
		super();
	}

	
	public Long getLngIdAsistenteEvento() {
		return lngIdAsistenteEvento;
	}


	public void setLngIdAsistenteEvento(Long lngIdAsistenteEvento) {
		this.lngIdAsistenteEvento = lngIdAsistenteEvento;
	}


	public String getStrNbAsistente() {
		return strNbAsistente;
	}


	public void setStrNbAsistente(String strNbAsistente) {
		this.strNbAsistente = strNbAsistente;
	}


	public String getStrNbEventoConstancia() {
		return strNbEventoConstancia;
	}

	public void setStrNbEventoConstancia(String strNbEventoConstancia) {
		this.strNbEventoConstancia = strNbEventoConstancia;
	}

	public String getStrLugar() {
		return strLugar;
	}

	public void setStrLugar(String strLugar) {
		this.strLugar = strLugar;
	}

	

	public String getStrFcInicio() {
		return strFcInicio;
	}

	public void setStrFcInicio(String strFcInicio) {
		this.strFcInicio = strFcInicio;
	}

	public String getStrFcFin() {
		return strFcFin;
	}

	public void setStrFcFin(String strFcFin) {
		this.strFcFin = strFcFin;
	}

	public Integer getIntDuracionHoras() {
		return intDuracionHoras;
	}

	public void setIntDuracionHoras(Integer intDuracionHoras) {
		this.intDuracionHoras = intDuracionHoras;
	}

	public String getStrNombreFirma() {
		return strNombreFirma;
	}

	public void setStrNombreFirma(String strNombreFirma) {
		this.strNombreFirma = strNombreFirma;
	}

	public String getStrCadena() {
		return strCadena;
	}

	public void setStrCadena(String strCadena) {
		this.strCadena = strCadena;
	}

	public Long getLngIdEventoConstancia() {
		return lngIdEventoConstancia;
	}

	public void setLngIdEventoConstancia(Long lngIdEventoConstancia) {
		this.lngIdEventoConstancia = lngIdEventoConstancia;
	}

	public String getStrPuesto() {
		return strPuesto;
	}

	public void setStrPuesto(String strPuesto) {
		this.strPuesto = strPuesto;
	}


	public String getStrTextoConstancia() {
		return strTextoConstancia;
	}


	public void setStrTextoConstancia(String strTextoConstancia) {
		this.strTextoConstancia = strTextoConstancia;
	}


	public byte[] getImagenEncabezado() {
		return imagenEncabezado;
	}


	public void setImagenEncabezado(byte[] imagenEncabezado) {
		this.imagenEncabezado = imagenEncabezado;
	}


	public String getStrFolio() {
		return strFolio;
	}


	public void setStrFolio(String strFolio) {
		this.strFolio = strFolio;
	}


	public byte[] getImagenFirma() {
		return imagenFirma;
	}


	public void setImagenFirma(byte[] imagenFirma) {
		this.imagenFirma = imagenFirma;
	}


	public String getStrLugarFecha() {
		return strLugarFecha;
	}


	public void setStrLugarFecha(String strLugarFecha) {
		this.strLugarFecha = strLugarFecha;
	}
	
	
	
}
