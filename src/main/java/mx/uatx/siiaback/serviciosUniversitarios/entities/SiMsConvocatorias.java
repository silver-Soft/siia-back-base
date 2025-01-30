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
@Table(schema = "SIIUAT", name = "SIMSCONVOCATORIAS")
public class SiMsConvocatorias {
	
	@Id
	@Column(name = "IDCONVOCATORIA")
	@SequenceGenerator(name = "generadorIdentificadorConv", sequenceName = "SIIUAT.IDCONVOCATORIA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorIdentificadorConv")
	private Long idConvocatoria;
	
	@Column(name = "IDTIPOCONVOCATORIA")
	private String idTipoConvocatoria;

	@Column(name = "CLESTATUSCONVOCATORIA")
	private String clEstatusConvocatoria;

	@Column(name = "DSCONVOCATORIA")
	private String dsConvocatoria;

	@Column(name = "FCINICIOREGISTRO")
	private Date fcInicioRegistro;

	@Column(name = "FCFINREGISTRO")
	private Date fcFinRegistro;

	@Column(name = "DIRIGIDOA")
	private String dirigidoA;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;

	@Column(name = "IDPERIODO")
	private String idPeriodo;

	@Column(name = "FCCIERRE")
	private Date fcCierre;

	@Column(name = "NMESTIMADOPARTICIPANTES")
	private Long nmEstimadoParticipantes;

	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	public SiMsConvocatorias() {
		
	}
	
	
	public Long getIdConvocatoria() {
		return idConvocatoria;
	}
	public void setIdConvocatoria(Long idConvocatoria) {
		this.idConvocatoria = idConvocatoria;
	}
	public String getIdTipoConvocatoria() {
		return idTipoConvocatoria;
	}
	public void setIdTipoConvocatoria(String idTipoConvocatoria) {
		this.idTipoConvocatoria = idTipoConvocatoria;
	}
	public String getClEstatusConvocatoria() {
		return clEstatusConvocatoria;
	}
	public void setClEstatusConvocatoria(String clEstatusConvocatoria) {
		this.clEstatusConvocatoria = clEstatusConvocatoria;
	}
	public String getDsConvocatoria() {
		return dsConvocatoria;
	}
	public void setDsConvocatoria(String dsConvocatoria) {
		this.dsConvocatoria = dsConvocatoria;
	}
	public Date getFcInicioRegistro() {
		return fcInicioRegistro;
	}
	public void setFcInicioRegistro(Date fcInicioRegistro) {
		this.fcInicioRegistro = fcInicioRegistro;
	}
	public Date getFcFinRegistro() {
		return fcFinRegistro;
	}
	public void setFcFinRegistro(Date fcFinRegistro) {
		this.fcFinRegistro = fcFinRegistro;
	}
	public String getDirigidoA() {
		return dirigidoA;
	}
	public void setDirigidoA(String dirigidoA) {
		this.dirigidoA = dirigidoA;
	}
	public Date getFcAudit() {
		return fcAudit;
	}
	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}
	public String getUsuarioAudit() {
		return usuarioAudit;
	}
	public void setUsuarioAudit(String usuarioAudit) {
		this.usuarioAudit = usuarioAudit;
	}
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public Date getFcCierre() {
		return fcCierre;
	}
	public void setFcCierre(Date fcCierre) {
		this.fcCierre = fcCierre;
	}
	public Long getNmEstimadoParticipantes() {
		return nmEstimadoParticipantes;
	}
	public void setNmEstimadoParticipantes(Long nmEstimadoParticipantes) {
		this.nmEstimadoParticipantes = nmEstimadoParticipantes;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	

}
