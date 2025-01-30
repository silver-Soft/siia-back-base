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
@Table(schema = "SERESC", name="SEAXMATERIASREALES")
public class SeAxMateriasReales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -804732497521075362L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDMATERIAREAL", sequenceName = "SERESC.IDMATERIAREAL", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDMATERIAREAL")
	
	@Column(name = "IDMATERIAREAL")
	private Long lngIdMateriaReal;
	
	@Column(name = "IDPLANMATERIA")
	private Long lngIdPlanMateria;

	@Column(name = "IDOPCIONTERMINAL")
	private Long lngIdOpcionTerminal;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "IDMATERIA")
	private Long lngIdMateria;
	
	@Column(name = "NMCREDITOS")
	private Integer intNmCreditos;

	public Long getLngIdMateriaReal() {
		return lngIdMateriaReal;
	}

	public void setLngIdMateriaReal(Long lngIdMateriaReal) {
		this.lngIdMateriaReal = lngIdMateriaReal;
	}

	public Long getLngIdPlanMateria() {
		return lngIdPlanMateria;
	}

	public void setLngIdPlanMateria(Long lngIdPlanMateria) {
		this.lngIdPlanMateria = lngIdPlanMateria;
	}

	public Long getLngIdOpcionTerminal() {
		return lngIdOpcionTerminal;
	}

	public void setLngIdOpcionTerminal(Long lngIdOpcionTerminal) {
		this.lngIdOpcionTerminal = lngIdOpcionTerminal;
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

	public Long getLngIdMateria() {
		return lngIdMateria;
	}

	public void setLngIdMateria(Long lngIdMateria) {
		this.lngIdMateria = lngIdMateria;
	}

	public Integer getIntNmCreditos() {
		return intNmCreditos;
	}

	public void setIntNmCreditos(Integer intNmCreditos) {
		this.intNmCreditos = intNmCreditos;
	}
	
	
}
