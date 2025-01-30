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
@Table(schema = "SERESC", name="SECTOPCIONESTERMINALES")
public class SeCtOpcionesTerminales implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -86867957292969037L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "IDOPCIONTERMINAL", sequenceName = "SERESC.IDOPCIONTERMINAL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDOPCIONTERMINAL")    
    @Column(name = "IDOPCIONTERMINAL")
	private Integer intIdOpcionTerminal;
	
	@Column(name = "IDPLANESTUDIO")
	private Integer intIdPlanEstudio;
		 
    @Column(name = "DSOPCIONTERMINAL")
	private String strDsOpcionTerminal;
	
    @Column(name = "FCAUDIT")
	private Date fcAudit;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdOpcionTerminal() {
		return intIdOpcionTerminal;
	}

	public void setIntIdOpcionTerminal(Integer intIdOpcionTerminal) {
		this.intIdOpcionTerminal = intIdOpcionTerminal;
	}

	public Integer getIntIdPlanEstudio() {
		return intIdPlanEstudio;
	}

	public void setIntIdPlanEstudio(Integer intIdPlanEstudio) {
		this.intIdPlanEstudio = intIdPlanEstudio;
	}

	public String getStrDsOpcionTerminal() {
		return strDsOpcionTerminal;
	}

	public void setStrDsOpcionTerminal(String strDsOpcionTerminal) {
		this.strDsOpcionTerminal = strDsOpcionTerminal;
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
