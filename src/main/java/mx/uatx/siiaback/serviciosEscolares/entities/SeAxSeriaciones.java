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
@Table(schema = "SERESC", name = "SEAXSERIACIONES")
public class SeAxSeriaciones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4889662732499034667L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDSERIACION", sequenceName = "SERESC.IDSERIACION", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDSERIACION")	
	@Column(name = "IDSERIACION")
	private Long lngIdSeriacion;
	
	@Column(name = "IDPLANMATERIA")
	private Long lngIdPlanMateria;

	@Column(name = "IDPLANMATERIAANT")
	private Long lngIdPlanMateriaAnt;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Long getLngIdSeriacion() {
		return lngIdSeriacion;
	}

	public void setLngIdSeriacion(Long lngIdSeriacion) {
		this.lngIdSeriacion = lngIdSeriacion;
	}

	public Long getLngIdPlanMateria() {
		return lngIdPlanMateria;
	}

	public void setLngIdPlanMateria(Long lngIdPlanMateria) {
		this.lngIdPlanMateria = lngIdPlanMateria;
	}

	public Long getLngIdPlanMateriaAnt() {
		return lngIdPlanMateriaAnt;
	}

	public void setLngIdPlanMateriaAnt(Long lngIdPlanMateriaAnt) {
		this.lngIdPlanMateriaAnt = lngIdPlanMateriaAnt;
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
