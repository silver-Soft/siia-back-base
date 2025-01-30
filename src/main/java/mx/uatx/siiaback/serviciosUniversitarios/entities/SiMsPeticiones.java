package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SIIUAT", name = "SIMSPETICIONES")
public class SiMsPeticiones {

	@Id
	@SequenceGenerator(name = "GENIDPETICIONESSOLICITADAS", sequenceName = "SIIUAT.IDPETICION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDPETICIONESSOLICITADAS")
	@Column(name = "IDPETICION")
	private Integer intIdPeticion;
	
	@Column(name = "IDPERSONAREALIZA")
	private Long lngIdPersonaRealiza;
	
	@Column(name = "IDAREACAMPUSREALIZA")
	private Integer intIdAreaCampusRealiza;
	
	@Column(name = "FCINICIO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcInicio;

	@Column(name = "IDPERSONASOLICITA")
	private Long intIdPersonaSolicita;

	@Column(name = "IDPERSONADIRIGIRSECON")
	private Long longIdPersonaDirigirseCon;

	@Column(name = "IDPERSONAREGISTRA")
	private Long longIdPersonaRegistra;

	@Column(name = "IDAREACAMPUSSOLICITA")
	private Integer intIdAreaCampusSolicita;
	
	@Column(name = "IDAREACAMPUSCANALIZADO")
	private Integer intIdAreaCampusCanalizado;

	@Column(name = "IDTITULARPUESTO")
	private Integer intIdTitularPuesto;

	@Column(name = "DSPETICION")
	private String strDescripcion;

	@Column(name = "FCPETICION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcPeticion;

	@Column(name = "FCLIBERACION")
	private Date fcLiberacion;

	@Column(name = "IDSTPETICION")
	private Integer intStPeticiones;

	@Column(name = "IDPRIORIDAD")
	private Integer intIdPrioridad;

	@Column(name = "IDORIGENPETICION")
	private Integer intIdOrigenPeticion;

	@Column(name = "IDGRADOSATISFACCION")
	private Integer intIdGradoSatisfaccion;

	@Column(name = "IDEVALUACIONSERVICIO")
	private Integer idEvaluacionServicio;

	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "DSSERVICIO")
	private String strDsServicio;

	@Column(name = "NMTICKET")
	private String strNmTicket;

	@Column(name = "IDCATEGORIA")
	private Integer intIdCategoria;
	
	@Column(name = "NMTELEFONO")
	private String strNmTelefono;
	
	@Column(name = "DSCORREO")
	private String strDsCorreo;
	
	@Column(name = "UBICACION")
	private String strUbicacion;
	
	@Lob
    @Column(name = "ARCHIVO")
    private byte[] archivo;
	
	@Column(name = "ID_CORRESPONDENCIA")
	private Long idCorrespodencia;
	
	@Column(name = "ID_REUNION")
	private Long idReunion;

	public Integer getIntIdPeticion() {
		return intIdPeticion;
	}

	public void setIntIdPeticion(Integer intIdPeticion) {
		this.intIdPeticion = intIdPeticion;
	}

	public Long getIntIdPersonaSolicita() {
		return intIdPersonaSolicita;
	}

	public void setIntIdPersonaSolicita(Long intIdPersonaSolicita) {
		this.intIdPersonaSolicita = intIdPersonaSolicita;
	}

	public Long getLongIdPersonaDirigirseCon() {
		return longIdPersonaDirigirseCon;
	}

	public void setLongIdPersonaDirigirseCon(Long longIdPersonaDirigirseCon) {
		this.longIdPersonaDirigirseCon = longIdPersonaDirigirseCon;
	}

	public Long getLongIdPersonaRegistra() {
		return longIdPersonaRegistra;
	}

	public void setLongIdPersonaRegistra(Long longIdPersonaRegistra) {
		this.longIdPersonaRegistra = longIdPersonaRegistra;
	}

	public Integer getIntIdAreaCampusSolicita() {
		return intIdAreaCampusSolicita;
	}

	public void setIntIdAreaCampusSolicita(Integer intIdAreaCampusSolicita) {
		this.intIdAreaCampusSolicita = intIdAreaCampusSolicita;
	}

	public Integer getIntIdTitularPuesto() {
		return intIdTitularPuesto;
	}

	public void setIntIdTitularPuesto(Integer intIdTitularPuesto) {
		this.intIdTitularPuesto = intIdTitularPuesto;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public Date getFcPeticion() {
		return fcPeticion;
	}

	public void setFcPeticion(Date fcPeticion) {
		this.fcPeticion = fcPeticion;
	}

	public Date getFcLiberacion() {
		return fcLiberacion;
	}

	public void setFcLiberacion(Date fcLiberacion) {
		this.fcLiberacion = fcLiberacion;
	}

	public Integer getIntStPeticiones() {
		return intStPeticiones;
	}

	public void setIntStPeticiones(Integer intStPeticiones) {
		this.intStPeticiones = intStPeticiones;
	}

	public Integer getIntIdPrioridad() {
		return intIdPrioridad;
	}

	public void setIntIdPrioridad(Integer intIdPrioridad) {
		this.intIdPrioridad = intIdPrioridad;
	}

	public Integer getIntIdOrigenPeticion() {
		return intIdOrigenPeticion;
	}

	public void setIntIdOrigenPeticion(Integer intIdOrigenPeticion) {
		this.intIdOrigenPeticion = intIdOrigenPeticion;
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

	public Integer getIntIdGradoSatisfaccion() {
		return intIdGradoSatisfaccion;
	}

	public void setIntIdGradoSatisfaccion(Integer intIdGradoSatisfaccion) {
		this.intIdGradoSatisfaccion = intIdGradoSatisfaccion;
	}

	public Integer getIdEvaluacionServicio() {
		return idEvaluacionServicio;
	}

	public void setIdEvaluacionServicio(Integer idEvaluacionServicio) {
		this.idEvaluacionServicio = idEvaluacionServicio;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getStrDsServicio() {
		return strDsServicio;
	}

	public void setStrDsServicio(String strDsServicio) {
		this.strDsServicio = strDsServicio;
	}

	public String getStrNmTicket() {
		return strNmTicket;
	}

	public void setStrNmTicket(String strNmTicket) {
		this.strNmTicket = strNmTicket;
	}

	public Integer getIntIdCategoria() {
		return intIdCategoria;
	}

	public void setIntIdCategoria(Integer intIdCategoria) {
		this.intIdCategoria = intIdCategoria;
	}

	public Long getLngIdPersonaRealiza() {
		return lngIdPersonaRealiza;
	}

	public void setLngIdPersonaRealiza(Long lngIdPersonaRealiza) {
		this.lngIdPersonaRealiza = lngIdPersonaRealiza;
	}

	public Integer getIntIdAreaCampusRealiza() {
		return intIdAreaCampusRealiza;
	}

	public void setIntIdAreaCampusRealiza(Integer intIdAreaCampusRealiza) {
		this.intIdAreaCampusRealiza = intIdAreaCampusRealiza;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Integer getIntIdAreaCampusCanalizado() {
		return intIdAreaCampusCanalizado;
	}

	public void setIntIdAreaCampusCanalizado(Integer intIdAreaCampusCanalizado) {
		this.intIdAreaCampusCanalizado = intIdAreaCampusCanalizado;
	}

	public String getStrNmTelefono() {
		return strNmTelefono;
	}

	public void setStrNmTelefono(String strNmTelefono) {
		this.strNmTelefono = strNmTelefono;
	}

	public String getStrDsCorreo() {
		return strDsCorreo;
	}

	public void setStrDsCorreo(String strDsCorreo) {
		this.strDsCorreo = strDsCorreo;
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

	public Long getIdCorrespodencia() {
		return idCorrespodencia;
	}

	public void setIdCorrespodencia(Long idCorrespodencia) {
		this.idCorrespodencia = idCorrespodencia;
	}

	public Long getIdReunion() {
		return idReunion;
	}

	public void setIdReunion(Long idReunion) {
		this.idReunion = idReunion;
	}

	
}
