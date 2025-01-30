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
@Table(schema = "SERESC", name = "SECTCUESTIONARIOS")
public class SeCtCuestionarios {

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDCUESTIONARIO", sequenceName = "SERESC.IDCUESTIONARIO", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDCUESTIONARIO")
	@Column(name = "IDCUESTIONARIO")
	private Integer intIdCuestionario;

	@Column(name = "DSCUESTIONARIO")
	private String strDsCuestionario;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "CLESTATUS")
	private Integer intClEstatus;

	@Column(name = "IDPERSONA")
	private Long lngIdPersona;

	public Integer getIntIdCuestionario() {
		return intIdCuestionario;
	}

	public void setIntIdCuestionario(Integer intIdCuestionario) {
		this.intIdCuestionario = intIdCuestionario;
	}

	public String getStrDsCuestionario() {
		return strDsCuestionario;
	}

	public void setStrDsCuestionario(String strDsCuestionario) {
		this.strDsCuestionario = strDsCuestionario;
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

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Long getLngIdPersona() {
		return lngIdPersona;
	}

	public void setLngIdPersona(Long lngIdPersona) {
		this.lngIdPersona = lngIdPersona;
	}

}