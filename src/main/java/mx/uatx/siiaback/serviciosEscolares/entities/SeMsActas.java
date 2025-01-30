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
@Table(schema = "SERESC", name = "SEMSACTAS")
public class SeMsActas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3378962403958904328L;

	@Id
	@Basic(optional = false)
	@Column(name = "IDACTA")
	@SequenceGenerator(name = "GENIDACTA", sequenceName = "SERESC.IDACTA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDACTA")
	private Long lngIdActa;

	@Column(name = "CLTIPOACREDITACION")
	private Integer intClTipoAcreditacion;

	@Column(name = "CLESTATUSACTA")
	private String strClEstatusActa;

	@Column(name = "IDOFERTA")
	private Integer intIdOferta;

	@Column(name = "FCREGISTROACTA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcRegistroActa = new Date();

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public Long getLngIdActa() {
		return lngIdActa;
	}

	public void setLngIdActa(Long lngIdActa) {
		this.lngIdActa = lngIdActa;
	}

	public Integer getIntClTipoAcreditacion() {
		return intClTipoAcreditacion;
	}

	public void setIntClTipoAcreditacion(Integer intClTipoAcreditacion) {
		this.intClTipoAcreditacion = intClTipoAcreditacion;
	}

	public String getStrClEstatusActa() {
		return strClEstatusActa;
	}

	public void setStrClEstatusActa(String strClEstatusActa) {
		this.strClEstatusActa = strClEstatusActa;
	}

	public Integer getIntIdOferta() {
		return intIdOferta;
	}

	public void setIntIdOferta(Integer intIdOferta) {
		this.intIdOferta = intIdOferta;
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

	public Date getFcRegistroActa() {
		return fcRegistroActa;
	}

	public void setFcRegistroActa(Date fcRegistroActa) {
		this.fcRegistroActa = fcRegistroActa;
	}

}
