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

import com.sun.istack.NotNull;

@Entity
@Table(schema = "SERESC", name = "SEAXPROGRAMASCAMPUS")
public class SeAxProgramasCampus implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3044903654356430487L;
	
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDPROGRAMACAMPUS", sequenceName = "SERESC.IDPROGRAMACAMPUS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPROGRAMACAMPUS")
	@NotNull
	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;
	
	@Column(name = "IDPROGRAMAEDUCATIVO")
	private Integer intIdProgramaEducativo;
	
	@Column(name = "IDAREACAMPUS")
	private Integer intIdAreaCampus;
	
	@Column(name = "FCAUDIT")
	private Date fcAudit;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;
	
	@Column(name = "CLNIVELEDUCATIVO")
	private Integer intClNivelEducativo;
	
	@Column(name = "CLMODALIDADPROGRAMA")
	private Integer intClModalidadPrograma;
	
	@Column(name = "RVOE")
	private String strRvoe;
	
	@Column(name = "FCREGISTRO")
	private Date fcRegistro;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCTERMINO")
	private Date FcTermino;
	
	@Column(name = "FCBAJA")
	private Date fcBaja;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name = "CLBOOLEANO")
	private Integer intClBooleano;
	
	@Column(name = "CLESTATUSOFERTADO")
	private Integer intClEstatusOfertado;
	
	@Column(name = "DSREGISTROIMSS")
	private String strDsRegistroIMSS;
	
	@Column(name = "CLESTATUSACREDITADO")
	private Integer intClEstatusAcreditado;
	
	@Column(name = "MISION")
	private String strMision;
	
	@Column(name = "VISION")
	private String strVision;
	
	@Column(name = "CLAVE")
	private String strClave;
		
	@Column(name = "CLAVE911")
	private String strClave911;
	
	@Column(name = "CLAREADIVISION")
	private Integer intClAreaDivision;
	
	@Column(name = "DESCCEDULA")
	private String strDescCedula;

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public Integer getIntIdProgramaEducativo() {
		return intIdProgramaEducativo;
	}

	public void setIntIdProgramaEducativo(Integer intIdProgramaEducativo) {
		this.intIdProgramaEducativo = intIdProgramaEducativo;
	}

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
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

	public Integer getIntClNivelEducativo() {
		return intClNivelEducativo;
	}

	public void setIntClNivelEducativo(Integer intClNivelEducativo) {
		this.intClNivelEducativo = intClNivelEducativo;
	}

	public Integer getIntClModalidadPrograma() {
		return intClModalidadPrograma;
	}

	public void setIntClModalidadPrograma(Integer intClModalidadPrograma) {
		this.intClModalidadPrograma = intClModalidadPrograma;
	}

	public String getStrRvoe() {
		return strRvoe;
	}

	public void setStrRvoe(String strRvoe) {
		this.strRvoe = strRvoe;
	}

	public Date getFcRegistro() {
		return fcRegistro;
	}

	public void setFcRegistro(Date fcRegistro) {
		this.fcRegistro = fcRegistro;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcTermino() {
		return FcTermino;
	}

	public void setFcTermino(Date fcTermino) {
		FcTermino = fcTermino;
	}

	public Date getFcBaja() {
		return fcBaja;
	}

	public void setFcBaja(Date fcBaja) {
		this.fcBaja = fcBaja;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}

	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}

	public Integer getIntClBooleano() {
		return intClBooleano;
	}

	public void setIntClBooleano(Integer intClBooleano) {
		this.intClBooleano = intClBooleano;
	}

	public Integer getIntClEstatusOfertado() {
		return intClEstatusOfertado;
	}

	public void setIntClEstatusOfertado(Integer intClEstatusOfertado) {
		this.intClEstatusOfertado = intClEstatusOfertado;
	}

	public String getStrDsRegistroIMSS() {
		return strDsRegistroIMSS;
	}

	public void setStrDsRegistroIMSS(String strDsRegistroIMSS) {
		this.strDsRegistroIMSS = strDsRegistroIMSS;
	}

	public Integer getIntClEstatusAcreditado() {
		return intClEstatusAcreditado;
	}

	public void setIntClEstatusAcreditado(Integer intClEstatusAcreditado) {
		this.intClEstatusAcreditado = intClEstatusAcreditado;
	}

	public String getStrMision() {
		return strMision;
	}

	public void setStrMision(String strMision) {
		this.strMision = strMision;
	}

	public String getStrVision() {
		return strVision;
	}

	public void setStrVision(String strVision) {
		this.strVision = strVision;
	}

	public String getStrClave() {
		return strClave;
	}

	public void setStrClave(String strClave) {
		this.strClave = strClave;
	}

	public String getStrClave911() {
		return strClave911;
	}

	public void setStrClave911(String strClave911) {
		this.strClave911 = strClave911;
	}

	public Integer getIntClAreaDivision() {
		return intClAreaDivision;
	}

	public void setIntClAreaDivision(Integer intClAreaDivision) {
		this.intClAreaDivision = intClAreaDivision;
	}

	public String getStrDescCedula() {
		return strDescCedula;
	}

	public void setStrDescCedula(String strDescCedula) {
		this.strDescCedula = strDescCedula;
	}
	
}
