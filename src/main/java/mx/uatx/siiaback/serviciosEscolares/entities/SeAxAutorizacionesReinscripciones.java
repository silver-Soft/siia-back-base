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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXAUTORIZACIONREINSCRIPCION")
public class SeAxAutorizacionesReinscripciones {
private static final String GENIDAUTORIZACIONREINS = "GENIDAUTORIZACIONREINSCRIPCION";
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = GENIDAUTORIZACIONREINS, sequenceName = "SERESC.IDAUTORIZACIONREINSCRIPCION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENIDAUTORIZACIONREINS)
    @Column(name = "IDAUTORIZACIONREINSCRIPCION", nullable = false)
	private Long idAutorizacionReinscripcion;
	
	@Basic(optional = false)
    @Column(name = "IDHISTORIALACADEMICO", nullable = false)
	private Long idHistorialAcademico;
	
	@Basic(optional = false)
    @Column(name = "IDPERIODO", nullable = false)
	private String idPeriodo;
	
	@Column(name = "FCINICIO")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fcInicio;
	
	@Column(name = "FCFIN")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fcFin;
	
	@Basic(optional = false)
    @Column(name = "NMMATERIASREPROBADAS", nullable = false)
	private Integer nmMateriasReprobadas;
	
	@Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioAudit;
	
	public SeAxAutorizacionesReinscripciones() {
		
	}

	public Long getIdAutorizacionReinscripcion() {
		return idAutorizacionReinscripcion;
	}

	public void setIdAutorizacionReinscripcion(Long idAutorizacionReinscripcion) {
		this.idAutorizacionReinscripcion = idAutorizacionReinscripcion;
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

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
	}

	public Integer getNmMateriasReprobadas() {
		return nmMateriasReprobadas;
	}

	public void setNmMateriasReprobadas(Integer nmMateriasReprobadas) {
		this.nmMateriasReprobadas = nmMateriasReprobadas;
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


}
