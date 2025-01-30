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
@Table(schema = "SERESC", name = "SEAXEQUIVALENCIAS")
public class SeAxEquivalencias implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3162183912164495113L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDEQUIVALENCIA", sequenceName = "SERESC.IDEQUIVALENCIA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDEQUIVALENCIA")
	
	@Column(name = "IDEQUIVALENCIA")
	private Long lngIdEquivalencia;
	
	@Column(name = "IDPLANMATERIA")
	private Long lngIdPlanMateria;

	@Column(name = "IDPLANMATERIAEQ")
	private Long lngIdPlanMateriaEq;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Long getLngIdEquivalencia() {
		return lngIdEquivalencia;
	}

	public void setLngIdEquivalencia(Long lngIdEquivalencia) {
		this.lngIdEquivalencia = lngIdEquivalencia;
	}

	public Long getLngIdPlanMateria() {
		return lngIdPlanMateria;
	}

	public void setLngIdPlanMateria(Long lngIdPlanMateria) {
		this.lngIdPlanMateria = lngIdPlanMateria;
	}

	public Long getLngIdPlanMateriaEq() {
		return lngIdPlanMateriaEq;
	}

	public void setLngIdPlanMateriaEq(Long lngIdPlanMateriaEq) {
		this.lngIdPlanMateriaEq = lngIdPlanMateriaEq;
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
