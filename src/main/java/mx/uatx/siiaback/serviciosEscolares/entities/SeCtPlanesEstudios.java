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

@Entity
@Table(schema = "SERESC", name="SECTPLANESESTUDIOS")
public class SeCtPlanesEstudios implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7138219702405599940L;
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "IDPLANESTUDIO", sequenceName = "SERESC.IDPLANESTUDIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDPLANESTUDIO")    
    @Column(name = "IDPLANESTUDIO")
    private Integer intIdPlanEstudio;

    @Column(name = "IDPROGRAMAEDUCATIVO")
    private Integer intIdProgramaEducativo;

    @Column(name = "CLTIPOPERIODO")
    private String strClTipoPeriodo;

    @Column(name = "NBPLANESTUDIO")
    private String strNbPlanEstudio;

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

    @Column(name = "FCAUDIT")
    private Date fcAudit;

    @Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

    @Column(name = "IDSTPLANESTUDIO")
    private Integer intIdStPlanEstudio;

    @Column(name = "IDMODELOPLAN")
    private Integer intIdModeloPlan;

    @Column(name = "CLNIVELEDUCATIVO")
    private Integer intClNivelEducativo;

	public Integer getIntIdPlanEstudio() {
		return intIdPlanEstudio;
	}

	public void setIntIdPlanEstudio(Integer intIdPlanEstudio) {
		this.intIdPlanEstudio = intIdPlanEstudio;
	}

	public Integer getIntIdProgramaEducativo() {
		return intIdProgramaEducativo;
	}

	public void setIntIdProgramaEducativo(Integer intIdProgramaEducativo) {
		this.intIdProgramaEducativo = intIdProgramaEducativo;
	}

	public String getStrNbPlanEstudio() {
		return strNbPlanEstudio;
	}

	public void setStrNbPlanEstudio(String strNbPlanEstudio) {
		this.strNbPlanEstudio = strNbPlanEstudio;
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

	public Integer getIntIdStPlanEstudio() {
		return intIdStPlanEstudio;
	}

	public void setIntIdStPlanEstudio(Integer intIdStPlanEstudio) {
		this.intIdStPlanEstudio = intIdStPlanEstudio;
	}

	public Integer getIntIdModeloPlan() {
		return intIdModeloPlan;
	}

	public void setIntIdModeloPlan(Integer intIdModeloPlan) {
		this.intIdModeloPlan = intIdModeloPlan;
	}

	public Integer getIntClNivelEducativo() {
		return intClNivelEducativo;
	}

	public void setIntClNivelEducativo(Integer intClNivelEducativo) {
		this.intClNivelEducativo = intClNivelEducativo;
	}

	public String getStrClTipoPeriodo() {
		return strClTipoPeriodo;
	}

	public void setStrClTipoPeriodo(String strClTipoPeriodo) {
		this.strClTipoPeriodo = strClTipoPeriodo;
	}
	
	
}
