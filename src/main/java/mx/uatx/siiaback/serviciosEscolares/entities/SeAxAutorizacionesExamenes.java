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
@Table(schema = "SERESC", name = "SEAXAUTORIZACIONESEXAMENES")
public class SeAxAutorizacionesExamenes {
	private static final String GENIDAUTORIZACIONEXAMEN = "GENIDAUTORIZACIONEXAMEN";
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = GENIDAUTORIZACIONEXAMEN, sequenceName = "SERESC.IDAUTORIZACIONEXAMEN", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENIDAUTORIZACIONEXAMEN)
    @Column(name = "IDAUTORIZACIONEXAMEN", nullable = false)
	private Long idAutorizacionExamen;
	
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
	
	public SeAxAutorizacionesExamenes(){
		
	}
	
	public Long getIdAutorizacionExamen() {
		return idAutorizacionExamen;
	}
	public void setIdAutorizacionExamen(Long idAutorizacionExamen) {
		this.idAutorizacionExamen = idAutorizacionExamen;
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
