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

@Entity
@Table(schema = "SERESC", name = "SECTRESPUESTAS")
public class SeCtRespuestas {
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDRESPUESTA", sequenceName = "SERESC.IDRESPUESTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDRESPUESTA")
	@Column(name = "IDRESPUESTA")
	private Integer intIdRespuesta;

	@Column(name = "DSRESPUESTA")
	private String strDsRespuesta;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdRespuesta() {
		return intIdRespuesta;
	}

	public void setIntIdRespuesta(Integer intIdRespuesta) {
		this.intIdRespuesta = intIdRespuesta;
	}

	public String getStrDsRespuesta() {
		return strDsRespuesta;
	}

	public void setStrDsRespuesta(String strDsRespuesta) {
		this.strDsRespuesta = strDsRespuesta;
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