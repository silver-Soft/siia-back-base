package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SEAXPLANESMATERIAS")
public class SeAxPlanesMaterias {
	
	@Id
    @Basic(optional = false)
    @SequenceGenerator(name = "generadorPlanMateria", sequenceName = "SERESC.IDPLANMATERIA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generadorPlanMateria")
    @Column(name = "IDPLANMATERIA")
	private Long idPlanMateria;
	
	@Column(name = "CLTIPOMATERIA")
	private String clTipoMateria;

	@Column(name = "CLPERIODOCURSADO")
	private Long clPeriodoCursado;

	@Column(name = "IDMATERIA")
	private Long idMateria;

	@Column(name = "IDPLANESTUDIO")
	private Long idPlanEstudio;

	@Column(name = "NMHORASDOCENCIA")
	private Integer nmHorasDocencia;

	@Column(name = "NMHORASINDEPENDIENTES")
	private Integer nmHorasIndependientes;

	@Column(name = "NMHORASTEORICAS")
	private Integer nmHorasTeoricas;

	@Column(name = "NMHORASPRACTICAS")
	private Integer nmHorasPracticas;

	@Column(name = "NMCREDITOS")
	private Integer nmCreditos;

	@Column(name = "CLESTATUS")
	private Integer clEstatus;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;

	@Column(name = "IDAREAFORMACION")
	private Long idAreaFormacion;

	@Column(name = "IDTIPOCAPCALIFICACION")
	private Integer idTipoCalificacion;

	@Column(name = "NMOTROSCREDITOS")
	private Integer nmOtrosCreditos;

	@Column(name = "NMHORASCLASE")
	private Integer nmHorasClase;

	@Column(name = "CLESTATUSTRANSVERSAL")
	private Integer clEstatusTransversal;

	@Column(name = "CVEMATERIA")
	private String cveMateria;
	
	public Long getIdPlanMateria() {
		return idPlanMateria;
	}
	public void setIdPlanMateria(Long idPlanMateria) {
		this.idPlanMateria = idPlanMateria;
	}
	public String getClTipoMateria() {
		return clTipoMateria;
	}
	public void setClTipoMateria(String clTipoMateria) {
		this.clTipoMateria = clTipoMateria;
	}
	public Long getClPeriodoCursado() {
		return clPeriodoCursado;
	}
	public void setClPeriodoCursado(Long clPeriodoCursado) {
		this.clPeriodoCursado = clPeriodoCursado;
	}
	public Long getIdMateria() {
		return idMateria;
	}
	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}
	public Long getIdPlanEstudio() {
		return idPlanEstudio;
	}
	public void setIdPlanEstudio(Long idPlanEstudio) {
		this.idPlanEstudio = idPlanEstudio;
	}
	public Integer getNmHorasDocencia() {
		return nmHorasDocencia;
	}
	public void setNmHorasDocencia(Integer nmHorasDocencia) {
		this.nmHorasDocencia = nmHorasDocencia;
	}
	public Integer getNmHorasIndependientes() {
		return nmHorasIndependientes;
	}
	public void setNmHorasIndependientes(Integer nmHorasIndependientes) {
		this.nmHorasIndependientes = nmHorasIndependientes;
	}
	public Integer getNmHorasTeoricas() {
		return nmHorasTeoricas;
	}
	public void setNmHorasTeoricas(Integer nmHorasTeoricas) {
		this.nmHorasTeoricas = nmHorasTeoricas;
	}
	public Integer getNmHorasPracticas() {
		return nmHorasPracticas;
	}
	public void setNmHorasPracticas(Integer nmHorasPracticas) {
		this.nmHorasPracticas = nmHorasPracticas;
	}
	public Integer getNmCreditos() {
		return nmCreditos;
	}
	public void setNmCreditos(Integer nmCreditos) {
		this.nmCreditos = nmCreditos;
	}
	public Integer getClEstatus() {
		return clEstatus;
	}
	public void setClEstatus(Integer clEstatus) {
		this.clEstatus = clEstatus;
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
	public Long getIdAreaFormacion() {
		return idAreaFormacion;
	}
	public void setIdAreaFormacion(Long idAreaFormacion) {
		this.idAreaFormacion = idAreaFormacion;
	}
	public Integer getIdTipoCalificacion() {
		return idTipoCalificacion;
	}
	public void setIdTipoCalificacion(Integer idTipoCalificacion) {
		this.idTipoCalificacion = idTipoCalificacion;
	}
	public Integer getNmOtrosCreditos() {
		return nmOtrosCreditos;
	}
	public void setNmOtrosCreditos(Integer nmOtrosCreditos) {
		this.nmOtrosCreditos = nmOtrosCreditos;
	}
	public Integer getNmHorasClase() {
		return nmHorasClase;
	}
	public void setNmHorasClase(Integer nmHorasClase) {
		this.nmHorasClase = nmHorasClase;
	}
	public Integer getClEstatusTransversal() {
		return clEstatusTransversal;
	}
	public void setClEstatusTransversal(Integer clEstatusTransversal) {
		this.clEstatusTransversal = clEstatusTransversal;
	}
	public String getCveMateria() {
		return cveMateria;
	}
	public void setCveMateria(String cveMateria) {
		this.cveMateria = cveMateria;
	}
	
}
