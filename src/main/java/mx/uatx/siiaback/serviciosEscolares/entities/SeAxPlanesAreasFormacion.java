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

@Entity
@Table(schema = "SERESC", name="SEAXPLANESAREASFORMACION")
public class SeAxPlanesAreasFormacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9043590775945953836L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPLANAREAFORMACION", sequenceName = "SERESC.IDPLANAREAFORMACION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPLANAREAFORMACION")
    
    @Column(name = "IDPLANAREAFORMACION")
	private Integer intIdPlanAreaFormacion;
	
	@Column(name = "IDPLANESTUDIO")
	private Integer intIdPlanEstudio;
		 
    @Column(name = "IDAREAFORMACION")
	private Integer intIdAreaFormacion;
	
    @Column(name = "ORDENAREA")
	private Integer intOrdenArea;
    
    @Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdPlanAreaFormacion() {
		return intIdPlanAreaFormacion;
	}

	public void setIntIdPlanAreaFormacion(Integer intIdPlanAreaFormacion) {
		this.intIdPlanAreaFormacion = intIdPlanAreaFormacion;
	}

	public Integer getIntIdPlanEstudio() {
		return intIdPlanEstudio;
	}

	public void setIntIdPlanEstudio(Integer intIdPlanEstudio) {
		this.intIdPlanEstudio = intIdPlanEstudio;
	}

	public Integer getIntIdAreaFormacion() {
		return intIdAreaFormacion;
	}

	public void setIntIdAreaFormacion(Integer intIdAreaFormacion) {
		this.intIdAreaFormacion = intIdAreaFormacion;
	}

	public Integer getIntOrdenArea() {
		return intOrdenArea;
	}

	public void setIntOrdenArea(Integer intOrdenArea) {
		this.intOrdenArea = intOrdenArea;
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
