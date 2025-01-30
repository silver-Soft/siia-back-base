package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasCertificado {
	
	@Id
	@Column(name = "IDPLANMATERIA")
	private Long idPlanMateria;
	
	@Column(name = "CLPERIODOCURSADO")
	private Integer clPeriodoCursado;

	@Column(name = "DSMATERIA")
	private String dsMateria;

	@Column(name = "DSPERIODOCURSADO")
	private String dsPeriodoCursado;

	@Column(name = "NBMATERIA")
	private String nbMateria;

	@Column(name = "CALCIFRA")
	private String calCifra;

	@Column(name = "CALLETRA")
	private String calLetra;
	
	@Column(name = "CREDITOS")
	private String creditos;

	@Column(name = "OBSERVACIONES")
	private String observaciones;

	@Column(name = "CLTIPOACREDITACION")
	private Integer clTipoAcreditacion;

	@Column(name = "FCREGISTROACTA")
	private Date fcRegistroActa;

	@Column(name = "DSOPCIONTERMINAL")
	private String dsOpcionTerminal;

	@Column(name = "DSMATERIAORDEN")
	private String dsMateriaOrden;

	@Column(name = "CLESTATUSOFERTA")
	private String clEstatusOferta;

	@Column(name = "DSABREVIATURA")
	private String dsAbreviatura;

	@Column(name = "CALREAL")
	private Integer calReal;
	
	public Long getIdPlanMateria() {
		return idPlanMateria;
	}
	public void setIdPlanMateria(Long idPlanMateria) {
		this.idPlanMateria = idPlanMateria;
	}
	public Integer getClPeriodoCursado() {
		return clPeriodoCursado;
	}
	public void setClPeriodoCursado(Integer clPeriodoCursado) {
		this.clPeriodoCursado = clPeriodoCursado;
	}
	public String getDsMateria() {
		return dsMateria;
	}
	public void setDsMateria(String dsMateria) {
		this.dsMateria = dsMateria;
	}
	public String getDsPeriodoCursado() {
		return dsPeriodoCursado;
	}
	public void setDsPeriodoCursado(String dsPeriodoCursado) {
		this.dsPeriodoCursado = dsPeriodoCursado;
	}
	public String getNbMateria() {
		return nbMateria;
	}
	public void setNbMateria(String nbMateria) {
		this.nbMateria = nbMateria;
	}
	public String getCalLetra() {
		return calLetra;
	}
	public void setCalLetra(String calLetra) {
		this.calLetra = calLetra;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Integer getClTipoAcreditacion() {
		return clTipoAcreditacion;
	}
	public void setClTipoAcreditacion(Integer clTipoAcreditacion) {
		this.clTipoAcreditacion = clTipoAcreditacion;
	}
	public Date getFcRegistroActa() {
		return fcRegistroActa;
	}
	public void setFcRegistroActa(Date fcRegistroActa) {
		this.fcRegistroActa = fcRegistroActa;
	}
	public String getDsOpcionTerminal() {
		return dsOpcionTerminal;
	}
	public void setDsOpcionTerminal(String dsOpcionTerminal) {
		this.dsOpcionTerminal = dsOpcionTerminal;
	}
	public String getDsMateriaOrden() {
		return dsMateriaOrden;
	}
	public void setDsMateriaOrden(String dsMateriaOrden) {
		this.dsMateriaOrden = dsMateriaOrden;
	}
	public String getClEstatusOferta() {
		return clEstatusOferta;
	}
	public void setClEstatusOferta(String clEstatusOferta) {
		this.clEstatusOferta = clEstatusOferta;
	}
	public String getDsAbreviatura() {
		return dsAbreviatura;
	}
	public void setDsAbreviatura(String dsAbreviatura) {
		this.dsAbreviatura = dsAbreviatura;
	}
	public Integer getCalReal() {
		return calReal;
	}
	public void setCalReal(Integer calReal) {
		this.calReal = calReal;
	}
	public String getCreditos() {
		return creditos;
	}
	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}
	public String getCalCifra() {
		return calCifra;
	}
	public void setCalCifra(String calCifra) {
		this.calCifra = calCifra;
	}
	
	
}
