package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SiPaDetallePeticion {
	
	
	@Id
	@Column(name = "IDPETICION")
	private Integer intIdPeticion;
	
	@Column(name = "DSPETICION")
	private String strDescripcion;
	
	@Column(name = "DSSERVICIO")
	private String strDescServicio;
	
	@Column(name = "DSSTPETICION")
	private String strDesStPeticion;

	
	@Column(name = "FCPETICION")
	private Date fcPeticion;
	
	@Column(name = "DSPRIORIDAD")
	private String strDesPrioridad;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCLIBERACION")
	private Date fcLIBERACION;
	
	@Column(name = "NOMBREAREACAMPUS")
	private String strNombreAreaCampus;
	
	@Column(name = "NOMBRESOLICITANTE")
	private String strNombreSolicitante;
	
	@Column(name = "NOMBREDIRIGIRSE")
	private String strNombreDirigirse;
	
	@Column(name = "DSEVALUACIONSERVICIO")
	private String strEvaluacionServicio;
	
	@Column(name = "DSGRADOSATISFACCION")
	private String strDsGradosSatisfaccion;

	@Column(name = "OBSERVACIONES")
	private String strObservaciones;
	
	@Column(name = "ACTIVIDADESREALIZADAS")
	private String strActividades;
	
	@Column(name = "PERSONAREALIZA")
	private String strPersonaRealiza;
	
	@Column(name = "UBICACION")
	private String strUbicacion;
	
	@Lob
    @Column(name = "ARCHIVO")
    private byte[] archivo;

	public Integer getIntIdPeticion() {
		return intIdPeticion;
	}

	public void setIntIdPeticion(Integer intIdPeticion) {
		this.intIdPeticion = intIdPeticion;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrDescServicio() {
		return strDescServicio;
	}

	public void setStrDescServicio(String strDescServicio) {
		this.strDescServicio = strDescServicio;
	}

	public String getStrDesStPeticion() {
		return strDesStPeticion;
	}

	public void setStrDesStPeticion(String strDesStPeticion) {
		this.strDesStPeticion = strDesStPeticion;
	}

	public Date getFcPeticion() {
		return fcPeticion;
	}

	public void setFcPeticion(Date fcPeticion) {
		this.fcPeticion = fcPeticion;
	}

	public String getStrDesPrioridad() {
		return strDesPrioridad;
	}

	public void setStrDesPrioridad(String strDesPrioridad) {
		this.strDesPrioridad = strDesPrioridad;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcLIBERACION() {
		return fcLIBERACION;
	}

	public void setFcLIBERACION(Date fcLIBERACION) {
		this.fcLIBERACION = fcLIBERACION;
	}

	public String getStrNombreAreaCampus() {
		return strNombreAreaCampus;
	}

	public void setStrNombreAreaCampus(String strNombreAreaCampus) {
		this.strNombreAreaCampus = strNombreAreaCampus;
	}

	public String getStrNombreSolicitante() {
		return strNombreSolicitante;
	}

	public void setStrNombreSolicitante(String strNombreSolicitante) {
		this.strNombreSolicitante = strNombreSolicitante;
	}

	public String getStrNombreDirigirse() {
		return strNombreDirigirse;
	}

	public void setStrNombreDirigirse(String strNombreDirigirse) {
		this.strNombreDirigirse = strNombreDirigirse;
	}

	public String getStrEvaluacionServicio() {
		return strEvaluacionServicio;
	}

	public void setStrEvaluacionServicio(String strEvaluacionServicio) {
		this.strEvaluacionServicio = strEvaluacionServicio;
	}

	public String getStrDsGradosSatisfaccion() {
		return strDsGradosSatisfaccion;
	}

	public void setStrDsGradosSatisfaccion(String strDsGradosSatisfaccion) {
		this.strDsGradosSatisfaccion = strDsGradosSatisfaccion;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getStrActividades() {
		return strActividades;
	}

	public void setStrActividades(String strActividades) {
		this.strActividades = strActividades;
	}

	public String getStrPersonaRealiza() {
		return strPersonaRealiza;
	}

	public void setStrPersonaRealiza(String strPersonaRealiza) {
		this.strPersonaRealiza = strPersonaRealiza;
	}

	public String getStrUbicacion() {
		return strUbicacion;
	}

	public void setStrUbicacion(String strUbicacion) {
		this.strUbicacion = strUbicacion;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}
	
	
	

}
