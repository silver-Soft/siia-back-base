package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SIIUAT", name = "SI_MS_ACTIVIDADES")
public class SiMsActividades {
	
	@Id
	@Column(name = "ID_ACTIVIDAD")
	@SequenceGenerator(name = "generadorIdentificadorAct", sequenceName = "SIIUAT.ID_ACTIVIDAD", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorIdentificadorAct")
	private Long idActividad;
	
	@Column(name = "FECHA_INICIO")
	private Date fcInicio;
	
	@Column(name = "FECHA_COMPROMISO")
	private Date fcCompromiso;

	@Column(name = "FECHA_CAPTURA")
	private Date fcCaptura;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "COMENTARIO")
	private String comentario;

	@Column(name = "REFERENCIA")
	private String referencia;

	@Column(name = "ID_CORRESPONDENCIA")
	private Long idCorrespondencia;

	@Column(name = "ID_REUNION")
	private Long idReunion;

	@Column(name = "ID_NIVEL_IMPACTO")
	private Long idNivelImpacto;

	@Column(name = "ID_PROCESO")
	private Long idProceso;

	@Column(name = "ID_ORIGEN")
	private Long idOrigen;

	@Column(name = "ID_TIPO_ACTIVIDAD")
	private Long idTipoActividad;

	@Column(name = "ID_AREA_CAMPUS")
	private Long idAreaCampus;

	@Column(name = "ID_HISTORIAL_LABORAL")
	private Long idHistorialLaboral;

	@Column(name = "ID_ACTIVIDAD_PADRE")
	private Long idActividadPadre;

	@Column(name = "ID_PETICION")
	private Long idPeticion;

	@Column(name = "USUARIO_AUDIT")
	private String usuarioAudit;

	@Column(name = "FC_AUDIT")
	private Date fcAudit;
	
	public Long getIdActividad() {
		return idActividad;
	}
	public void setIdActividad(Long idActividad) {
		this.idActividad = idActividad;
	}
	public Date getFcInicio() {
		return fcInicio;
	}
	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}
	public Date getFcCompromiso() {
		return fcCompromiso;
	}
	public void setFcCompromiso(Date fcCompromiso) {
		this.fcCompromiso = fcCompromiso;
	}
	public Date getFcCaptura() {
		return fcCaptura;
	}
	public void setFcCaptura(Date fcCaptura) {
		this.fcCaptura = fcCaptura;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Long getIdCorrespondencia() {
		return idCorrespondencia;
	}
	public void setIdCorrespondencia(Long idCorrespondencia) {
		this.idCorrespondencia = idCorrespondencia;
	}
	public Long getIdReunion() {
		return idReunion;
	}
	public void setIdReunion(Long idReunion) {
		this.idReunion = idReunion;
	}
	public Long getIdNivelImpacto() {
		return idNivelImpacto;
	}
	public void setIdNivelImpacto(Long idNivelImpacto) {
		this.idNivelImpacto = idNivelImpacto;
	}
	public Long getIdProceso() {
		return idProceso;
	}
	public void setIdProceso(Long idProceso) {
		this.idProceso = idProceso;
	}
	public Long getIdOrigen() {
		return idOrigen;
	}
	public void setIdOrigen(Long idOrigen) {
		this.idOrigen = idOrigen;
	}
	public Long getIdTipoActividad() {
		return idTipoActividad;
	}
	public void setIdTipoActividad(Long idTipoActividad) {
		this.idTipoActividad = idTipoActividad;
	}
	public Long getIdAreaCampus() {
		return idAreaCampus;
	}
	public void setIdAreaCampus(Long idAreaCampus) {
		this.idAreaCampus = idAreaCampus;
	}
	public Long getIdHistorialLaboral() {
		return idHistorialLaboral;
	}
	public void setIdHistorialLaboral(Long idHistorialLaboral) {
		this.idHistorialLaboral = idHistorialLaboral;
	}
	public Long getIdActividadPadre() {
		return idActividadPadre;
	}
	public void setIdActividadPadre(Long idActividadPadre) {
		this.idActividadPadre = idActividadPadre;
	}
	public Long getIdPeticion() {
		return idPeticion;
	}
	public void setIdPeticion(Long idPeticion) {
		this.idPeticion = idPeticion;
	}
	public String getUsuarioAudit() {
		return usuarioAudit;
	}
	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}
	public Date getFcAudit() {
		return fcAudit;
	}
	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

}
