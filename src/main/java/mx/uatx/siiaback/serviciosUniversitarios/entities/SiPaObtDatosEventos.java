package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SiPaObtDatosEventos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1607198029943938371L;
	@Id
	@Column(name = "IDEVENTOCONSTANCIA")
	private Long lngIdEventoConstancia;
	
	@Column(name = "NBEVENTOCONSTANCIA")
	private String strNbEventoConstancia;
	
	@Column(name = "LUGAR")
	private String strLugar;
	
	@Column(name = "FCINICIO")
	private Date dtFcInicio;
	
	@Column(name = "FCFIN")
	private Date dtFcFin;
	
	@Column(name = "DURACIONHORAS")
	private Integer intDuracionHoras;
	
	@Column(name = "IDPERSONAFIRMA")
	private Long lngIdPersonaFirma;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name = "PERMITEMODIFICAR")
	private boolean blnPermiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean blnPermiteEliminar;
	
	@Column(name = "PERMITEASISTENTE")
	private boolean blnPermiteAsistente;
	
	@Column(name = "TEXTOCONSTANCIA")
	private String strTextoConstancia;
	
	@Lob
    @Column(name = "IMAGENENCABEZADO")
    private byte[] imagenEncabezado;
	
	@Lob
    @Column(name = "IMAGENFIRMA")
    private byte[] imagenFirma;
	
	@Column(name = "FCINICIOREGISTRO")
	private Date dtFcInicioRegistro;
	
	@Column(name = "FCFINREGISTRO")
	private Date dtFcFinRegistro;
	
	public SiPaObtDatosEventos() {
		super();
	}

	public Long getLngIdEventoConstancia() {
		return lngIdEventoConstancia;
	}

	public void setLngIdEventoConstancia(Long lngIdEventoConstancia) {
		this.lngIdEventoConstancia = lngIdEventoConstancia;
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

	public Date getDtFcInicio() {
		return dtFcInicio;
	}

	public void setDtFcInicio(Date dtFcInicio) {
		this.dtFcInicio = dtFcInicio;
	}

	public Date getDtFcFin() {
		return dtFcFin;
	}

	public void setDtFcFin(Date dtFcFin) {
		this.dtFcFin = dtFcFin;
	}

	public Integer getIntDuracionHoras() {
		return intDuracionHoras;
	}

	public void setIntDuracionHoras(Integer intDuracionHoras) {
		this.intDuracionHoras = intDuracionHoras;
	}

	public Long getLngIdPersonaFirma() {
		return lngIdPersonaFirma;
	}

	public void setLngIdPersonaFirma(Long lngIdPersonaFirma) {
		this.lngIdPersonaFirma = lngIdPersonaFirma;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

	public boolean isBlnPermiteAsistente() {
		return blnPermiteAsistente;
	}

	public void setBlnPermiteAsistente(boolean blnPermiteAsistente) {
		this.blnPermiteAsistente = blnPermiteAsistente;
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

	public byte[] getImagenFirma() {
		return imagenFirma;
	}

	public void setImagenFirma(byte[] imagenFirma) {
		this.imagenFirma = imagenFirma;
	}

	public Date getDtFcInicioRegistro() {
		return dtFcInicioRegistro;
	}

	public void setDtFcInicioRegistro(Date dtFcInicioRegistro) {
		this.dtFcInicioRegistro = dtFcInicioRegistro;
	}

	public Date getDtFcFinRegistro() {
		return dtFcFinRegistro;
	}

	public void setDtFcFinRegistro(Date dtFcFinRegistro) {
		this.dtFcFinRegistro = dtFcFinRegistro;
	}
	
	
	
}
