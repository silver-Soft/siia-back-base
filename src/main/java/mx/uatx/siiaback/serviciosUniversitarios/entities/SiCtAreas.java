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
@Table(schema = "SIIUAT", name = "SICTAREAS")
public class SiCtAreas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1763681613953975671L;

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "CLAREA", sequenceName = "SIIUAT.CLAREA", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLAREA")
	@NotNull

	@Column(name = "CLAREA")
	private Integer intClArea;

	@Column(name = "IDTIPOAREA")
	private Integer intIdTipoArea;

	@Column(name = "NBAREA")
	private String strNbArea;

	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "IDTIPOAREAREAL")
	private Integer intIdTipoAreaReal;

	@Column(name = "CLESTATUSPRESUPUESTA")
	private Integer intClEstatusPresupuesta;

	@Column(name = "CLAREAPADREPRESUPUESTAL")
	private Integer intClAreaPadrePresupuestal;

	@Column(name = "NMAREAUNIVERSITARIA")
	private String strNmAreaUniversitaria;

	@Column(name = "CLESTATUSORGANIGRAMA")
	private Integer intClEstatusOrganigrama;

	@Column(name = "URLPAGINAWEB")
	private String strUrlPaginaWeb;

	@Column(name = "SIGLAS")
	private String strSiglas;

	@Column(name = "DSTIPOORGANIGRAMA")
	private String strDsTipoOrganigrama;

	@Column(name = "DSSUBTIPOORGANIGRAMA")
	private String strDsSubtipoOrganigrama;

	@Column(name = "CLAVE911")
	private String strClave911;

	public Integer getIntIdTipoArea() {
		return intIdTipoArea;
	}

	public void setIntIdTipoArea(Integer intIdTipoArea) {
		this.intIdTipoArea = intIdTipoArea;
	}

	public String getStrNbArea() {
		return strNbArea;
	}

	public void setStrNbArea(String strNbArea) {
		this.strNbArea = strNbArea;
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

	public Integer getIntIdTipoAreaReal() {
		return intIdTipoAreaReal;
	}

	public void setIntIdTipoAreaReal(Integer intIdTipoAreaReal) {
		this.intIdTipoAreaReal = intIdTipoAreaReal;
	}

	public Integer getIntClEstatusPresupuesta() {
		return intClEstatusPresupuesta;
	}

	public void setIntClEstatusPresupuesta(Integer intClEstatusPresupuesta) {
		this.intClEstatusPresupuesta = intClEstatusPresupuesta;
	}

	public Integer getIntClAreaPadrePresupuestal() {
		return intClAreaPadrePresupuestal;
	}

	public void setIntClAreaPadrePresupuestal(Integer intClAreaPadrePresupuestal) {
		this.intClAreaPadrePresupuestal = intClAreaPadrePresupuestal;
	}

	public String getStrNmAreaUniversitaria() {
		return strNmAreaUniversitaria;
	}

	public void setStrNmAreaUniversitaria(String strNmAreaUniversitaria) {
		this.strNmAreaUniversitaria = strNmAreaUniversitaria;
	}

	public Integer getIntClEstatusOrganigrama() {
		return intClEstatusOrganigrama;
	}

	public void setIntClEstatusOrganigrama(Integer intClEstatusOrganigrama) {
		this.intClEstatusOrganigrama = intClEstatusOrganigrama;
	}

	public String getStrUrlPaginaWeb() {
		return strUrlPaginaWeb;
	}

	public void setStrUrlPaginaWeb(String strUrlPaginaWeb) {
		this.strUrlPaginaWeb = strUrlPaginaWeb;
	}

	public String getStrSiglas() {
		return strSiglas;
	}

	public void setStrSiglas(String strSiglas) {
		this.strSiglas = strSiglas;
	}

	public String getStrDsTipoOrganigrama() {
		return strDsTipoOrganigrama;
	}

	public void setStrDsTipoOrganigrama(String strDsTipoOrganigrama) {
		this.strDsTipoOrganigrama = strDsTipoOrganigrama;
	}

	public String getStrDsSubtipoOrganigrama() {
		return strDsSubtipoOrganigrama;
	}

	public void setStrDsSubtipoOrganigrama(String strDsSubtipoOrganigrama) {
		this.strDsSubtipoOrganigrama = strDsSubtipoOrganigrama;
	}

	public String getStrClave911() {
		return strClave911;
	}

	public void setStrClave911(String strClave911) {
		this.strClave911 = strClave911;
	}

	public Integer getIntClArea() {
		return intClArea;
	}

	public void setIntClArea(Integer intClArea) {
		this.intClArea = intClArea;
	}

}
