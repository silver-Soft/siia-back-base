package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtListadoPlanesEstudio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -211834653930133005L;
	@Id
	@Column(name = "IDPLANESTUDIO")
	private Integer intIdPlanEstudio;

	@Column(name = "NBPLANESTUDIO")
	private String strNbPlanEstudio;

	@Column(name = "DSTIPOPERIODO")
	private String strDsTipoPeriodo;

	@Column(name = "FCREGISTRO")
	private Date fcRegistro;

	@Column(name = "FCINICIO")
	private Date fcInicio;

	@Column(name = "FCTERMINO")
	private Date fcTermino;

	@Column(name = "FCBAJA")
	private Date fcBaja;

	@Column(name = "NMTOTALCREDITOS")
	private Integer intNmTotalCreditos;

	@Column(name = "NMTOTALMATERIAS")
	private Integer intNmTotalMaterias;

	@Column(name = "DSSTPLANESTUDIO")
	private String strDsPlanEstudio;

	@Column(name = "PROGRAMAEDUCATIVO")
	private String strProgramaEducativo;

	public Integer getIntIdPlanEstudio() {
		return intIdPlanEstudio;
	}

	public void setIntIdPlanEstudio(Integer intIdPlanEstudio) {
		this.intIdPlanEstudio = intIdPlanEstudio;
	}

	public String getStrNbPlanEstudio() {
		return strNbPlanEstudio;
	}

	public void setStrNbPlanEstudio(String strNbPlanEstudio) {
		this.strNbPlanEstudio = strNbPlanEstudio;
	}

	public String getStrDsTipoPeriodo() {
		return strDsTipoPeriodo;
	}

	public void setStrDsTipoPeriodo(String strDsTipoPeriodo) {
		this.strDsTipoPeriodo = strDsTipoPeriodo;
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
		return fcTermino;
	}

	public void setFcTermino(Date fcTermino) {
		this.fcTermino = fcTermino;
	}

	public Date getFcBaja() {
		return fcBaja;
	}

	public void setFcBaja(Date fcBaja) {
		this.fcBaja = fcBaja;
	}

	public Integer getIntNmTotalCreditos() {
		return intNmTotalCreditos;
	}

	public void setIntNmTotalCreditos(Integer intNmTotalCreditos) {
		this.intNmTotalCreditos = intNmTotalCreditos;
	}

	public Integer getIntNmTotalMaterias() {
		return intNmTotalMaterias;
	}

	public void setIntNmTotalMaterias(Integer intNmTotalMaterias) {
		this.intNmTotalMaterias = intNmTotalMaterias;
	}

	public String getStrDsPlanEstudio() {
		return strDsPlanEstudio;
	}

	public void setStrDsPlanEstudio(String strDsPlanEstudio) {
		this.strDsPlanEstudio = strDsPlanEstudio;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

}
