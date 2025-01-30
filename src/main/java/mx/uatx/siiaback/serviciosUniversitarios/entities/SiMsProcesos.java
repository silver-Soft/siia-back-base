package mx.uatx.siiaback.serviciosUniversitarios.entities;

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
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name="SIMSPROCESOS")
public class SiMsProcesos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1129575555328380927L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPROCESO", sequenceName = "SIIUAT.IDPROCESO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPROCESO")
	@NotNull
	
	@Column(name = "IDPROCESO")
	private Integer intIdProceso;
	
	@Column(name = "DSACRONIMO")
	private String strDsAcronimo;
	
	@Column(name = "DSPROCESO")
	private String strDsProceso;	
	
	@Column(name = "IDMODULO")
	private Integer intIdModulo;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdProceso() {
		return intIdProceso;
	}

	public void setIntIdProceso(Integer intIdProceso) {
		this.intIdProceso = intIdProceso;
	}

	public String getStrDsAcronimo() {
		return strDsAcronimo;
	}

	public void setStrDsAcronimo(String strDsAcronimo) {
		this.strDsAcronimo = strDsAcronimo;
	}

	public String getStrDsProceso() {
		return strDsProceso;
	}

	public void setStrDsProceso(String strDsProceso) {
		this.strDsProceso = strDsProceso;
	}

	public Integer getIntIdModulo() {
		return intIdModulo;
	}

	public void setIntIdModulo(Integer intIdModulo) {
		this.intIdModulo = intIdModulo;
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
