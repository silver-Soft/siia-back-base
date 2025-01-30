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
@Table(schema = "SERESC", name = "SECTGRUPOSRESPUESTAS")
public class SeCtGruposRespuestas {

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDGRUPORESPUESTA", sequenceName = "SERESC.IDGRUPORESPUESTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGRUPORESPUESTA")
	@Column(name = "IDGRUPORESPUESTA")
	private Integer intIdGrupoRespuesta;

	@Column(name = "DSGRUPORESPUESTA")
	private String strDsGrupoRespuesta;

	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Integer getIntIdGrupoRespuesta() {
		return intIdGrupoRespuesta;
	}

	public void setIntIdGrupoRespuesta(Integer intIdGrupoRespuesta) {
		this.intIdGrupoRespuesta = intIdGrupoRespuesta;
	}

	public String getStrDsGrupoRespuesta() {
		return strDsGrupoRespuesta;
	}

	public void setStrDsGrupoRespuesta(String strDsGrupoRespuesta) {
		this.strDsGrupoRespuesta = strDsGrupoRespuesta;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
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
