package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosIndiceReprobatorioParcial implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2455120346007994945L;

	public SePaDatosIndiceReprobatorioParcial() {
		super();

	}

	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "IDOFERTA")
	private Integer intIdOFERTA;

	@Column(name = "MATERIA")
	private String strMateria;

	@Column(name = "DOCENTE")
	private String strDocente;

	@Column(name = "INSC")
	private Long lngInscritos;

	@Column(name = "APROB")
	private Long lngAprobados;

	@Column(name = "REPROB")
	private Long lngReprobados;

	@Column(name = "APROBPAR2")
	private Long lngAprobadosPar2;

	@Column(name = "REPROBPAR2")
	private Long lngReprobadosPar2;

	@Column(name = "APROBPAR3")
	private Long lngAprobadosPar3;

	@Column(name = "REPROBPAR3")
	private Long lngReprobadosPar3;

	@Column(name = "IND_APR")
	private Double dblIndiceAprobatorio;

	@Column(name = "IND_REPR")
	private Double dblIndiceReprobatorio;

	@Column(name = "PROMEDIOPAR1")
	private Double dblPromedioPar1;

	@Column(name = "PROMEDIOPAR2")
	private Double dblPromedioPar2;

	@Column(name = "PROMEDIOPAR3")
	private Double dblPromedioPar3;

	@Column(name = "CLPERIODOCURSADO")
	private String strPeriodoCursado;

	@Column(name = "INDAPROBPAR2")
	private Double dblIndAprobPar2;

	@Column(name = "INDREPROBPAR2")
	private Double dblIndReprobPar2;

	@Column(name = "INDAPROBPAR3")
	private Double dblIndAprobPar3;

	@Column(name = "INDREPROBPAR3")
	private Double dblIndReprobPar3;
	
	@Column(name = "CLPERIODOMATERIA")
	private Integer periodoMateria;

	public Integer getIntIdOFERTA() {
		return intIdOFERTA;
	}

	public void setIntIdOFERTA(Integer intIdOFERTA) {
		this.intIdOFERTA = intIdOFERTA;
	}

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public String getStrDocente() {
		return strDocente;
	}

	public void setStrDocente(String strDocente) {
		this.strDocente = strDocente;
	}

	public Long getLngInscritos() {
		return lngInscritos;
	}

	public void setLngInscritos(Long lngInscritos) {
		this.lngInscritos = lngInscritos;
	}

	public Long getLngAprobados() {
		return lngAprobados;
	}

	public void setLngAprobados(Long lngAprobados) {
		this.lngAprobados = lngAprobados;
	}

	public Long getLngReprobados() {
		return lngReprobados;
	}

	public void setLngReprobados(Long lngReprobados) {
		this.lngReprobados = lngReprobados;
	}

	public Double getDblPromedioPar1() {
		return dblPromedioPar1;
	}

	public void setDblPromedioPar1(Double dblPromedioPar1) {
		this.dblPromedioPar1 = dblPromedioPar1;
	}

	public Double getDblPromedioPar2() {
		return dblPromedioPar2;
	}

	public void setDblPromedioPar2(Double dblPromedioPar2) {
		this.dblPromedioPar2 = dblPromedioPar2;
	}

	public Double getDblPromedioPar3() {
		return dblPromedioPar3;
	}

	public void setDblPromedioPar3(Double dblPromedioPar3) {
		this.dblPromedioPar3 = dblPromedioPar3;
	}

	public String getStrPeriodoCursado() {
		return strPeriodoCursado;
	}

	public void setStrPeriodoCursado(String strPeriodoCursado) {
		this.strPeriodoCursado = strPeriodoCursado;
	}

	public Double getDblIndAprobPar2() {
		return dblIndAprobPar2;
	}

	public void setDblIndAprobPar2(Double dblIndAprobPar2) {
		this.dblIndAprobPar2 = dblIndAprobPar2;
	}

	public Double getDblIndReprobPar2() {
		return dblIndReprobPar2;
	}

	public void setDblIndReprobPar2(Double dblIndReprobPar2) {
		this.dblIndReprobPar2 = dblIndReprobPar2;
	}

	public Double getDblIndAprobPar3() {
		return dblIndAprobPar3;
	}

	public void setDblIndAprobPar3(Double dblIndAprobPar3) {
		this.dblIndAprobPar3 = dblIndAprobPar3;
	}

	public Double getDblIndReprobPar3() {
		return dblIndReprobPar3;
	}

	public void setDblIndReprobPar3(Double dblIndReprobPar3) {
		this.dblIndReprobPar3 = dblIndReprobPar3;
	}

	public Double getDblIndiceAprobatorio() {
		return dblIndiceAprobatorio;
	}

	public void setDblIndiceAprobatorio(Double dblIndiceAprobatorio) {
		this.dblIndiceAprobatorio = dblIndiceAprobatorio;
	}

	public Double getDblIndiceReprobatorio() {
		return dblIndiceReprobatorio;
	}

	public void setDblIndiceReprobatorio(Double dblIndiceReprobatorio) {
		this.dblIndiceReprobatorio = dblIndiceReprobatorio;
	}

	public Long getLngAprobadosPar2() {
		return lngAprobadosPar2;
	}

	public void setLngAprobadosPar2(Long lngAprobadosPar2) {
		this.lngAprobadosPar2 = lngAprobadosPar2;
	}

	public Long getLngReprobadosPar2() {
		return lngReprobadosPar2;
	}

	public void setLngReprobadosPar2(Long lngReprobadosPar2) {
		this.lngReprobadosPar2 = lngReprobadosPar2;
	}

	public Long getLngAprobadosPar3() {
		return lngAprobadosPar3;
	}

	public void setLngAprobadosPar3(Long lngAprobadosPar3) {
		this.lngAprobadosPar3 = lngAprobadosPar3;
	}

	public Long getLngReprobadosPar3() {
		return lngReprobadosPar3;
	}

	public void setLngReprobadosPar3(Long lngReprobadosPar3) {
		this.lngReprobadosPar3 = lngReprobadosPar3;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPeriodoMateria() {
		return periodoMateria;
	}

	public void setPeriodoMateria(Integer periodoMateria) {
		this.periodoMateria = periodoMateria;
	}

}
