package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SEAXDETALLESPROGRAMA")
public class SeAxDetallesPrograma {
	
	@Id
	@Column(name = "iddetalleprograma", unique = true, nullable = false, precision = 22, scale = 0)
	@SequenceGenerator(name = "iddetalleprograma", sequenceName = "SERESC.iddetalleprograma", allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="iddetalleprograma")
	
	private Long idDetallePrograma;
	
	@Column(name = "IDPROGRAMAEDUCATIVO")
	private Long idProgramaEducativo;

	@Column(name = "DSOBEJTIVO")
	private String dsObjetivo;

	@Column(name = "DSREQUISITOS")
	private String dsRequisitos;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;

	@Column(name = "DSMISION")
	private String dsMision;

	@Column(name = "DSVISION")
	private String dsDivision;

	@Column(name = "DSSEMBLANZA")
	private String dsSemblanza;

	@Column(name = "DSCAMPOTRABAJO")
	private String dsCampoTrabajo;

	@Column(name = "DSPERFILINGRESO")
	private byte[] dsPerfilIngreso;

	@Column(name = "DSPERFILEGRESO")
	private byte[] dsPerfilEgreso;

	@Column(name = "PERFILES")
	private byte[] perfiles;

	@Column(name = "CAMPODESARROLLO")
	private byte[] campoDesarrollo;

	@Column(name = "REQUISITOS")
	private byte[] requsitos;

	@Column(name = "RESENIA")
	private byte[] resenia;

	@Column(name = "CLNIVELEDUCATIVO")
	private Integer clNivelEducativo;
	
	public Long getIdDetallePrograma() {
		return idDetallePrograma;
	}
	public void setIdDetallePrograma(Long idDetallePrograma) {
		this.idDetallePrograma = idDetallePrograma;
	}
	public Long getIdProgramaEducativo() {
		return idProgramaEducativo;
	}
	public void setIdProgramaEducativo(Long idProgramaEducativo) {
		this.idProgramaEducativo = idProgramaEducativo;
	}
	public String getDsObjetivo() {
		return dsObjetivo;
	}
	public void setDsObjetivo(String dsObjetivo) {
		this.dsObjetivo = dsObjetivo;
	}
	public String getDsRequisitos() {
		return dsRequisitos;
	}
	public void setDsRequisitos(String dsRequisitos) {
		this.dsRequisitos = dsRequisitos;
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
	public String getDsMision() {
		return dsMision;
	}
	public void setDsMision(String dsMision) {
		this.dsMision = dsMision;
	}
	public String getDsDivision() {
		return dsDivision;
	}
	public void setDsDivision(String dsDivision) {
		this.dsDivision = dsDivision;
	}
	public String getDsSemblanza() {
		return dsSemblanza;
	}
	public void setDsSemblanza(String dsSemblanza) {
		this.dsSemblanza = dsSemblanza;
	}
	public String getDsCampoTrabajo() {
		return dsCampoTrabajo;
	}
	public void setDsCampoTrabajo(String dsCampoTrabajo) {
		this.dsCampoTrabajo = dsCampoTrabajo;
	}
	public byte[] getDsPerfilIngreso() {
		return dsPerfilIngreso;
	}
	public void setDsPerfilIngreso(byte[] dsPerfilIngreso) {
		this.dsPerfilIngreso = dsPerfilIngreso;
	}
	public byte[] getDsPerfilEgreso() {
		return dsPerfilEgreso;
	}
	public void setDsPerfilEgreso(byte[] dsPerfilEgreso) {
		this.dsPerfilEgreso = dsPerfilEgreso;
	}
	public byte[] getPerfiles() {
		return perfiles;
	}
	public void setPerfiles(byte[] perfiles) {
		this.perfiles = perfiles;
	}
	public byte[] getCampoDesarrollo() {
		return campoDesarrollo;
	}
	public void setCampoDesarrollo(byte[] campoDesarrollo) {
		this.campoDesarrollo = campoDesarrollo;
	}
	public byte[] getRequsitos() {
		return requsitos;
	}
	public void setRequsitos(byte[] requsitos) {
		this.requsitos = requsitos;
	}
	public byte[] getResenia() {
		return resenia;
	}
	public void setResenia(byte[] resenia) {
		this.resenia = resenia;
	}
	public Integer getClNivelEducativo() {
		return clNivelEducativo;
	}
	public void setClNivelEducativo(Integer clNivelEducativo) {
		this.clNivelEducativo = clNivelEducativo;
	}

}
