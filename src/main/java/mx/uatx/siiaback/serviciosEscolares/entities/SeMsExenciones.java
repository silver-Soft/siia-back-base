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
@Table(schema = "SERESC", name = "SEMSEXENCIONES")
public class SeMsExenciones {
	
	@Id
	@Basic(optional = false)
	@Column(name = "IDEXENCION")
	@SequenceGenerator(name = "GENID_EXENCION", sequenceName = "SERESC.IDEXENCION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENID_EXENCION")
	private Long idExencion;
	
	@Column(name = "FCREGISTRO")
	private Date fcRegistro;

	@Column(name = "CLTIPOEXENCION")
	private Integer clTipoExencion;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;

	@Column(name = "IDPERIODO")
	private String idPeriodo;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;

	@Column(name = "CLESTATUS")
	private Integer clEstatus;

	@Column(name = "NMMESES")
	private Integer nmMeses;

	@Column(name = "PORCENTAJE")
	private Integer porcentaje;

	@Column(name = "CLSTREINSCRIPCION")
	private Integer clStReinscripcion;

	@Column(name = "CLSTCOLEGIATURAS")
	private Integer clStColegiaturas;
		
	
	public Long getIdExencion() {
		return idExencion;
	}
	public void setIdExencion(Long idExencion) {
		this.idExencion = idExencion;
	}
	public Date getFcRegistro() {
		return fcRegistro;
	}
	public void setFcRegistro(Date fcRegistro) {
		this.fcRegistro = fcRegistro;
	}
	public Integer getClTipoExencion() {
		return clTipoExencion;
	}
	public void setClTipoExencion(Integer clTipoExencion) {
		this.clTipoExencion = clTipoExencion;
	}
	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}
	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}
	public String getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(String idPeriodo) {
		this.idPeriodo = idPeriodo;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
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
	public Integer getClEstatus() {
		return clEstatus;
	}
	public void setClEstatus(Integer clEstatus) {
		this.clEstatus = clEstatus;
	}
	public Integer getNmMeses() {
		return nmMeses;
	}
	public void setNmMeses(Integer nmMeses) {
		this.nmMeses = nmMeses;
	}
	public Integer getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(Integer porcentaje) {
		this.porcentaje = porcentaje;
	}
	public Integer getClStReinscripcion() {
		return clStReinscripcion;
	}
	public void setClStReinscripcion(Integer clStReinscripcion) {
		this.clStReinscripcion = clStReinscripcion;
	}
	public Integer getClStColegiaturas() {
		return clStColegiaturas;
	}
	public void setClStColegiaturas(Integer clStColegiaturas) {
		this.clStColegiaturas = clStColegiaturas;
	}

}
