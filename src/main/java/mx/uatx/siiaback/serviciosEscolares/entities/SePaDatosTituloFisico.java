package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaDatosTituloFisico {
	
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
	
	@Column(name = "FCEXPEDICION")
	private Date fcImpresion;

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
	
	@Column(name = "LEYENDAEXPIDETITULO")
	private String leyendaExpide;

	@Column(name = "LEYENDAEJERCER")
	private String leyendaEjercer;

	@Column(name = "LEYENDATITULO1")
	private String leyendaTitulo1;

	@Column(name = "LEYENDATITULO2")
	private String leyendaTitulo2;

	@Column(name = "LEYENDATITULO3")
	private String leyendaTitulo3;

	@Column(name = "LEYENDATITULO4")
	private String leyendaTitulo4;

	@Column(name = "LEYENDATITULO5")
	private String leyendaTitulo5;

	@Column(name = "DIVISION")
	private String strDivision;

	@Column(name = "GENEROESTUDIANTE")
	private String strArticuloGenero;

	@Column(name = "NOMBRERECTOR")
	private String strNbRector;

	@Column(name = "GRADORECTOR")
	private String strGradoRector;

	@Column(name = "NOMBRESECACADEMICO")
	private String strNbSecreAcademico;

	@Column(name = "GRADOSECACADEMICO")
	private String strGradoSecreAcademico;
	
	@Column(name = "CLESTATUSESDUPLICADO")
	private Integer clEstatusEsDuplicado;
	
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
	public String getLeyendaExpide() {
		return leyendaExpide;
	}
	public void setLeyendaExpide(String leyendaExpide) {
		this.leyendaExpide = leyendaExpide;
	}
	public String getLeyendaEjercer() {
		return leyendaEjercer;
	}
	public void setLeyendaEjercer(String leyendaEjercer) {
		this.leyendaEjercer = leyendaEjercer;
	}
	public String getLeyendaTitulo1() {
		return leyendaTitulo1;
	}
	public void setLeyendaTitulo1(String leyendaTitulo1) {
		this.leyendaTitulo1 = leyendaTitulo1;
	}
	public String getLeyendaTitulo2() {
		return leyendaTitulo2;
	}
	public void setLeyendaTitulo2(String leyendaTitulo2) {
		this.leyendaTitulo2 = leyendaTitulo2;
	}
	public String getLeyendaTitulo3() {
		return leyendaTitulo3;
	}
	public void setLeyendaTitulo3(String leyendaTitulo3) {
		this.leyendaTitulo3 = leyendaTitulo3;
	}
	public String getLeyendaTitulo4() {
		return leyendaTitulo4;
	}
	public void setLeyendaTitulo4(String leyendaTitulo4) {
		this.leyendaTitulo4 = leyendaTitulo4;
	}
	public String getLeyendaTitulo5() {
		return leyendaTitulo5;
	}
	public void setLeyendaTitulo5(String leyendaTitulo5) {
		this.leyendaTitulo5 = leyendaTitulo5;
	}
	public String getStrDivision() {
		return strDivision;
	}
	public void setStrDivision(String strDivision) {
		this.strDivision = strDivision;
	}
	public String getStrArticuloGenero() {
		return strArticuloGenero;
	}
	public void setStrArticuloGenero(String strArticuloGenero) {
		this.strArticuloGenero = strArticuloGenero;
	}
	public String getStrNbRector() {
		return strNbRector;
	}
	public void setStrNbRector(String strNbRector) {
		this.strNbRector = strNbRector;
	}
	public String getStrGradoRector() {
		return strGradoRector;
	}
	public void setStrGradoRector(String strGradoRector) {
		this.strGradoRector = strGradoRector;
	}
	public String getStrNbSecreAcademico() {
		return strNbSecreAcademico;
	}
	public void setStrNbSecreAcademico(String strNbSecreAcademico) {
		this.strNbSecreAcademico = strNbSecreAcademico;
	}
	public String getStrGradoSecreAcademico() {
		return strGradoSecreAcademico;
	}
	public void setStrGradoSecreAcademico(String strGradoSecreAcademico) {
		this.strGradoSecreAcademico = strGradoSecreAcademico;
	}
	public Date getFcImpresion() {
		return fcImpresion;
	}
	public void setFcImpresion(Date fcImpresion) {
		this.fcImpresion = fcImpresion;
	}
	public Integer getClEstatusEsDuplicado() {
		return clEstatusEsDuplicado;
	}
	public void setClEstatusEsDuplicado(Integer clEstatusEsDuplicado) {
		this.clEstatusEsDuplicado = clEstatusEsDuplicado;
	}

}
