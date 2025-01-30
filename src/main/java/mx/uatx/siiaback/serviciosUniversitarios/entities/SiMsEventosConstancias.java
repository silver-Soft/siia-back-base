package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(schema = "SIIUAT", name="SIMSEVENTOSCONSTANCIAS")
public class SiMsEventosConstancias implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5221044584111874023L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDEVENTOCONSTANCIA", sequenceName = "SIIUAT.IDEVENTOCONSTANCIA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDEVENTOCONSTANCIA")
    @NotNull
    
    @Column(name = "IDEVENTOCONSTANCIA")
	private Long lngIdEventoCosntancia;
	
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
	
	@Column(name = "FCAUDIT")
    private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
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

	public Long getLngIdEventoCosntancia() {
		return lngIdEventoCosntancia;
	}

	public void setLngIdEventoCosntancia(Long lngIdEventoCosntancia) {
		this.lngIdEventoCosntancia = lngIdEventoCosntancia;
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

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
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
