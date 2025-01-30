package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaDatosTituloElectronico implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4806255093523125956L;

	@Id
	@Column(name = "FOLIO")
	private Long lngIdFolio;

	@Column(name = "CURP")
	private String strCURP;

	@Column(name = "NUMTITULO")
	private Long lngNumTitulo;

	@Column(name = "LIBRO")
	private String lngLibro;

	@Column(name = "FOJA")
	private String lngFoja;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "APELLIDOPATERNO")
	private String strApPaterno;

	@Column(name = "APELLIDOMATERNO")
	private String strApMaterno;

	@Column(name = "NBCARRERA")
	private String strCarrera;

	@Column(name = "FECHAINICIO")
	private String fcInicio;

	@Column(name = "FECHATERMINACION")
	private String fcTerminacion;

	@Column(name = "FECHAEXAMENPROFESIONAL")
	private String fcExamenProfesional;

	@Column(name = "FECHAEXPEDICION")
	private String fcExpedicion;

	@Column(name = "FOTO")
	@Lob
	private byte[] archivo;

	@Column(name = "FIRMARECTOR")
	private String strFirmaRector;

	@Column(name = "FIRMASECACADEMICO")
	private String strFirmaSecAcademico;

	@Column(name = "SELLODIGITAL")
	private String strSelloDigital;

	@Column(name = "CQR")
	private String strQR;

	@Column(name = "FACULTAD")
	private String strFacultad;

	public SePaDatosTituloElectronico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getLngIdFolio() {
		return lngIdFolio;
	}

	public void setLngIdFolio(Long lngIdFolio) {
		this.lngIdFolio = lngIdFolio;
	}

	public String getStrCURP() {
		return strCURP;
	}

	public void setStrCURP(String strCURP) {
		this.strCURP = strCURP;
	}

	public Long getLngNumTitulo() {
		return lngNumTitulo;
	}

	public void setLngNumTitulo(Long lngNumTitulo) {
		this.lngNumTitulo = lngNumTitulo;
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

	public String getStrCarrera() {
		return strCarrera;
	}

	public void setStrCarrera(String strCarrera) {
		this.strCarrera = strCarrera;
	}

	public String getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(String fcInicio) {
		this.fcInicio = fcInicio;
	}

	public String getFcTerminacion() {
		return fcTerminacion;
	}

	public void setFcTerminacion(String fcTerminacion) {
		this.fcTerminacion = fcTerminacion;
	}

	public String getFcExamenProfesional() {
		return fcExamenProfesional;
	}

	public void setFcExamenProfesional(String fcExamenProfesional) {
		this.fcExamenProfesional = fcExamenProfesional;
	}

	public String getFcExpedicion() {
		return fcExpedicion;
	}

	public void setFcExpedicion(String fcExpedicion) {
		this.fcExpedicion = fcExpedicion;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public String getStrFirmaRector() {
		return strFirmaRector;
	}

	public void setStrFirmaRector(String strFirmaRector) {
		this.strFirmaRector = strFirmaRector;
	}

	public String getStrFirmaSecAcademico() {
		return strFirmaSecAcademico;
	}

	public void setStrFirmaSecAcademico(String strFirmaSecAcademico) {
		this.strFirmaSecAcademico = strFirmaSecAcademico;
	}

	public String getStrSelloDigital() {
		return strSelloDigital;
	}

	public void setStrSelloDigital(String strSelloDigital) {
		this.strSelloDigital = strSelloDigital;
	}

	public String getStrQR() {
		return strQR;
	}

	public void setStrQR(String strQR) {
		this.strQR = strQR;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getLngLibro() {
		return lngLibro;
	}

	public void setLngLibro(String lngLibro) {
		this.lngLibro = lngLibro;
	}

	public String getLngFoja() {
		return lngFoja;
	}

	public void setLngFoja(String lngFoja) {
		this.lngFoja = lngFoja;
	}
	
	

}
