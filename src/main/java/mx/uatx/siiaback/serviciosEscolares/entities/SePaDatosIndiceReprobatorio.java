package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosIndiceReprobatorio implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2455120346007994945L;
	
	
	
	public SePaDatosIndiceReprobatorio() {
		super();
	
	}

	public SePaDatosIndiceReprobatorio(Integer intIdOFERTA, String strMateria, String strDocente, Long lngInscritos,
			Long lngAprobados, Long lngReprobados, Long lngIndiceAprobatorio, Long lngIndiceReprobatorio,
			Double dblPromedioOrd, Double dblPromedioExt, Double dblPromedioTitulacio, String strPeriodoCursado,
			Long lngInscExtra, Long lngIndAprobExtra, Long lngIndReprobExtra, Long lngInscritosTit, Long lngIndAprobTit,
			Long lngIndReprobTit) {
		super();
		this.intIdOFERTA = intIdOFERTA;
		this.strMateria = strMateria;
		this.strDocente = strDocente;
		this.lngInscritos = lngInscritos;
		this.lngAprobados = lngAprobados;
		this.lngReprobados = lngReprobados;
		this.lngIndiceAprobatorio = lngIndiceAprobatorio;
		this.lngIndiceReprobatorio = lngIndiceReprobatorio;
		this.dblPromedioOrd = dblPromedioOrd;
		this.dblPromedioExt = dblPromedioExt;
		this.dblPromedioTitulacio = dblPromedioTitulacio;
		this.strPeriodoCursado = strPeriodoCursado;
		this.lngInscExtra = lngInscExtra;
		this.lngIndAprobExtra = lngIndAprobExtra;
		this.lngIndReprobExtra = lngIndReprobExtra;
		this.lngInscritosTit = lngInscritosTit;
		this.lngIndAprobTit = lngIndAprobTit;
		this.lngIndReprobTit = lngIndReprobTit;
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
	
	@Column(name = "IND_APR")
	private Long lngIndiceAprobatorio;
	
	@Column(name = "IND_REPR")
	private Long lngIndiceReprobatorio;

	@Column(name = "PROMEDIOORD")
	private Double dblPromedioOrd;
	
	@Column(name = "PROMEDIOEXT")
	private Double dblPromedioExt;
	
	@Column(name = "PROMEDIOTIT")
	private Double dblPromedioTitulacio;
	
	@Column(name = "CLPERIODOCURSADO")
	private String strPeriodoCursado;
	
	private String strGrupo;
	
	@Column(name = "INSCEXTRA")
	private Long lngInscExtra;
	
	@Column(name = "INDAPROBEXTRA")
	private Long lngIndAprobExtra;
	
	@Column(name = "INDREPROBEXTRA")
	private Long lngIndReprobExtra;
	
	@Column(name = "INSCTIT")
	private Long lngInscritosTit;
	
	@Column(name = "INDAPROBTIT")
	private Long lngIndAprobTit;
	
	@Column(name = "INDREPROBTIT")
	private Long lngIndReprobTit;
	
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

	public Long getLngIndiceAprobatorio() {
		return lngIndiceAprobatorio;
	}

	public void setLngIndiceAprobatorio(Long lngIndiceAprobatorio) {
		this.lngIndiceAprobatorio = lngIndiceAprobatorio;
	}

	public Long getLngIndiceReprobatorio() {
		return lngIndiceReprobatorio;
	}

	public void setLngIndiceReprobatorio(Long lngIndiceReprobatorio) {
		this.lngIndiceReprobatorio = lngIndiceReprobatorio;
	}

	public Double getDblPromedioOrd() {
		return dblPromedioOrd;
	}

	public void setDblPromedioOrd(Double dblPromedioOrd) {
		this.dblPromedioOrd = dblPromedioOrd;
	}

	public Double getDblPromedioExt() {
		return dblPromedioExt;
	}

	public void setDblPromedioExt(Double dblPromedioExt) {
		this.dblPromedioExt = dblPromedioExt;
	}

	public Double getDblPromedioTitulacio() {
		return dblPromedioTitulacio;
	}

	public void setDblPromedioTitulacio(Double dblPromedioTitulacio) {
		this.dblPromedioTitulacio = dblPromedioTitulacio;
	}

	public String getStrPeriodoCursado() {
		return strPeriodoCursado;
	}

	public void setStrPeriodoCursado(String strPeriodoCursado) {
		this.strPeriodoCursado = strPeriodoCursado;
	}

	public Long getLngInscExtra() {
		return lngInscExtra;
	}

	public void setLngInscExtra(Long lngInscExtra) {
		this.lngInscExtra = lngInscExtra;
	}

	public Long getLngIndAprobExtra() {
		return lngIndAprobExtra;
	}

	public void setLngIndAprobExtra(Long lngIndAprobExtra) {
		this.lngIndAprobExtra = lngIndAprobExtra;
	}

	public Long getLngIndReprobExtra() {
		return lngIndReprobExtra;
	}

	public void setLngIndReprobExtra(Long lngIndReprobExtra) {
		this.lngIndReprobExtra = lngIndReprobExtra;
	}

	public Long getLngInscritosTit() {
		return lngInscritosTit;
	}

	public void setLngInscritosTit(Long lngInscritosTit) {
		this.lngInscritosTit = lngInscritosTit;
	}

	public Long getLngIndAprobTit() {
		return lngIndAprobTit;
	}

	public void setLngIndAprobTit(Long lngIndAprobTit) {
		this.lngIndAprobTit = lngIndAprobTit;
	}

	public Long getLngIndReprobTit() {
		return lngIndReprobTit;
	}

	public void setLngIndReprobTit(Long lngIndReprobTit) {
		this.lngIndReprobTit = lngIndReprobTit;
	}

	public String getStrGrupo() {
		return strGrupo;
	}

	public void setStrGrupo(String strGrupo) {
		this.strGrupo = strGrupo;
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
