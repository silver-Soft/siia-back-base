package mx.uatx.siiaback.serviciosUniversitarios.entities;

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
@Table(schema = "SIIUAT", name = "SICTTOKENSCORREOS")
public class SiMsTokensCorreo {
	
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "generadorDtToken", sequenceName = "SIIUAT.IDTOKENCORREO", allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="generadorDtToken")
	@NotNull
	@Column(name = "IDTOKENCORREO")
	private Integer intIdMenuROL;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "DSTOKENMICROSOFT")
	private String strTokenMicrosoft;
	
	@Column(name = "DSTOKENGOOGLE")
	private String strTokenGoogle;
	
	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	
	
	

	public SiMsTokensCorreo() {
		super();
	}
	
	

	public Integer getIntIdMenuROL() {
		return intIdMenuROL;
	}

	public void setIntIdMenuROL(Integer intIdMenuROL) {
		this.intIdMenuROL = intIdMenuROL;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrTokenMicrosoft() {
		return strTokenMicrosoft;
	}

	public void setStrTokenMicrosoft(String strTokenMicrosoft) {
		this.strTokenMicrosoft = strTokenMicrosoft;
	}

	public String getStrTokenGoogle() {
		return strTokenGoogle;
	}

	public void setStrTokenGoogle(String strTokenGoogle) {
		this.strTokenGoogle = strTokenGoogle;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}
	
}
