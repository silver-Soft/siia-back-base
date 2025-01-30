package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import org.springframework.beans.BeanUtils;

public class DatosIndiceReprobatorioParcialTO implements Serializable {

	private static final long serialVersionUID = -2455120346007994945L;

	public DatosIndiceReprobatorioParcialTO() {
		super();

	}
	private Integer id;

	private Integer intIdOFERTA;

	private String strMateria;

	private String strDocente;

	private Long lngInscritos;

	private Long lngAprobados;

	private Long lngReprobados;
	
	private Long lngAprobadosPar2;

	private Long lngReprobadosPar2;
	
	private Long lngAprobadosPar3;

	private Long lngReprobadosPar3;

	private Double dblIndiceAprobatorio;
	
	private Double dblIndiceReprobatorio;

	private Double dblPromedioPar1;

	private Double dblPromedioPar2;

	private Double dblPromedioPar3;

	private String strPeriodoCursado;

	private Double dblIndAprobPar2;

	private Double dblIndReprobPar2;

	private Double dblIndAprobPar3;

	private Double dblIndReprobPar3;

	private String strNombreArea;

	private String strProgramaEducativo;

	private String strDsPeriodo;
	
	private String strGrupo;
	
	private Integer periodoMateria;
	private Double promedioIA1P;
	private Double promedioIR1P;
	private Double promedioP1P;
	private Double promedioIA2P;
	private Double promedioP2P;
	private Double promedioIA3P;
	private Double promedioP3P;
	

	public DatosIndiceReprobatorioParcialTO(SePaDatosIndiceReprobatorioParcial entidad, String strNombreArea,
			String strProgramaEducativo, String strDsPeriodo) {

		BeanUtils.copyProperties(entidad, this);

		this.strNombreArea = strNombreArea;

		this.strProgramaEducativo = strProgramaEducativo;

		this.strDsPeriodo = strDsPeriodo;

	}

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

	public String getStrNombreArea() {
		return strNombreArea;
	}

	public void setStrNombreArea(String strNombreArea) {
		this.strNombreArea = strNombreArea;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public String getStrDsPeriodo() {
		return strDsPeriodo;
	}

	public void setStrDsPeriodo(String strDsPeriodo) {
		this.strDsPeriodo = strDsPeriodo;
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

	public String getStrGrupo() {
		return strGrupo;
	}

	public void setStrGrupo(String strGrupo) {
		this.strGrupo = strGrupo;
	}

	public Double getPromedioIA1P() {
		return promedioIA1P;
	}

	public void setPromedioIA1P(Double promedioIA1P) {
		this.promedioIA1P = promedioIA1P;
	}

	public Double getPromedioIR1P() {
		return promedioIR1P;
	}

	public void setPromedioIR1P(Double promedioIR1P) {
		this.promedioIR1P = promedioIR1P;
	}

	public Double getPromedioP1P() {
		return promedioP1P;
	}

	public void setPromedioP1P(Double promedioP1P) {
		this.promedioP1P = promedioP1P;
	}

	public Double getPromedioIA2P() {
		return promedioIA2P;
	}

	public void setPromedioIA2P(Double promedioIA2P) {
		this.promedioIA2P = promedioIA2P;
	}

	public Double getPromedioP2P() {
		return promedioP2P;
	}

	public void setPromedioP2P(Double promedioP2P) {
		this.promedioP2P = promedioP2P;
	}

	public Double getPromedioIA3P() {
		return promedioIA3P;
	}

	public void setPromedioIA3P(Double promedioIA3P) {
		this.promedioIA3P = promedioIA3P;
	}

	public Double getPromedioP3P() {
		return promedioP3P;
	}

	public void setPromedioP3P(Double promedioP3P) {
		this.promedioP3P = promedioP3P;
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
