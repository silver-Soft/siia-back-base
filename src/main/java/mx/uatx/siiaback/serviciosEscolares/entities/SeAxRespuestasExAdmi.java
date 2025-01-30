package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
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
@Table(schema = "SERESC", name="SEAXRESPUESTASEXADMI")
public class SeAxRespuestasExAdmi implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 792297383062235755L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDRESPUESTAEXADMI", sequenceName = "SERESC.IDRESPUESTAEXADMI", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDRESPUESTAEXADMI")    
    @Column(name = "IDRESPUESTA")
	private Integer intIdRespuesta;
	
	@Column(name = "IDPREGUNTA")
	private Integer intIdPregunta;
	
	@Column(name = "IDOPCION")
	private Integer intIdOpcion;
	
	@Column(name = "IDSOLICITUDINGRESO")
	private Long lngIdSolicitudIngreso;
	
	@Column(name = "FECHAINICIO")
    private Date fcFechaInicio;
	
	@Column(name = "FECHAFIN")
    private Date fcFechaFin;
	
	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
    private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

	

	

	public Integer getIntIdRespuesta() {
		return intIdRespuesta;
	}

	public void setIntIdRespuesta(Integer intIdRespuesta) {
		this.intIdRespuesta = intIdRespuesta;
	}

	public Integer getIntIdPregunta() {
		return intIdPregunta;
	}

	public void setIntIdPregunta(Integer intIdPregunta) {
		this.intIdPregunta = intIdPregunta;
	}

	public Integer getIntIdOpcion() {
		return intIdOpcion;
	}

	public void setIntIdOpcion(Integer intIdOpcion) {
		this.intIdOpcion = intIdOpcion;
	}

	public Long getLngIdSolicitudIngreso() {
		return lngIdSolicitudIngreso;
	}

	public void setLngIdSolicitudIngreso(Long lngIdSolicitudIngreso) {
		this.lngIdSolicitudIngreso = lngIdSolicitudIngreso;
	}

	public Date getFcFechaInicio() {
		return fcFechaInicio;
	}

	public void setFcFechaInicio(Date fcFechaInicio) {
		this.fcFechaInicio = fcFechaInicio;
	}

	public Date getFcFechaFin() {
		return fcFechaFin;
	}

	public void setFcFechaFin(Date fcFechaFin) {
		this.fcFechaFin = fcFechaFin;
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
		
}
