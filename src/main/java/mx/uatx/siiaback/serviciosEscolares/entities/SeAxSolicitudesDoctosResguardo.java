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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXSOLICITUDESDOCTOSRESGUARDO")
public class SeAxSolicitudesDoctosResguardo {

	@Id
	@Basic(optional = false)
	@Column(name = "IDSOLICITUDDOCTORESGUARDO")
	@SequenceGenerator(name = "GENIDSOLICITUDDOCTORESGUARDO", sequenceName = "SERESC.IDSOLICITUDDOCTORESGUARDO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDSOLICITUDDOCTORESGUARDO")
	private Long lngIdSolicitudDoctoResguardo;

	@Column(name = "IDDOCUMENTO")
	private Integer intIdDocumento;

	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	private Long lngIdSolicitudDocOficial;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	public SeAxSolicitudesDoctosResguardo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getLngIdSolicitudDoctoResguardo() {
		return lngIdSolicitudDoctoResguardo;
	}

	public void setLngIdSolicitudDoctoResguardo(Long lngIdSolicitudDoctoResguardo) {
		this.lngIdSolicitudDoctoResguardo = lngIdSolicitudDoctoResguardo;
	}

	public Integer getIntIdDocumento() {
		return intIdDocumento;
	}

	public void setIntIdDocumento(Integer intIdDocumento) {
		this.intIdDocumento = intIdDocumento;
	}

	public Long getLngIdSolicitudDocOficial() {
		return lngIdSolicitudDocOficial;
	}

	public void setLngIdSolicitudDocOficial(Long lngIdSolicitudDocOficial) {
		this.lngIdSolicitudDocOficial = lngIdSolicitudDocOficial;
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
