package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteDetalladoTruncaTotales {
	
	@Id
	@Column(name = "ID")
	private Integer intId;

	@Column(name = "IDPROGRAMACAMPUS")
	private Integer intIdProgramaCampus;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strDsPeriodoTemporada;

	@Column(name = "BAJATEMPORAL")
	private Integer intBajaTemporal;

	@Column(name = "BAJADEFINITIVA")
	private Integer intBajaDefinitiva;

	@Column(name = "SITUACIONABANDONO")
	private Integer intSituacionAbandono;

	@Column(name = "TOTALPERIODO")
	private Integer intTotal;

	@Column(name = "ORDEN")
	private Integer intIdOrden;

	public SePaReporteDetalladoTruncaTotales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrDsPeriodoTemporada() {
		return strDsPeriodoTemporada;
	}

	public void setStrDsPeriodoTemporada(String strDsPeriodoTemporada) {
		this.strDsPeriodoTemporada = strDsPeriodoTemporada;
	}

	public Integer getIntBajaTemporal() {
		return intBajaTemporal;
	}

	public void setIntBajaTemporal(Integer intBajaTemporal) {
		this.intBajaTemporal = intBajaTemporal;
	}

	public Integer getIntBajaDefinitiva() {
		return intBajaDefinitiva;
	}

	public void setIntBajaDefinitiva(Integer intBajaDefinitiva) {
		this.intBajaDefinitiva = intBajaDefinitiva;
	}

	public Integer getIntSituacionAbandono() {
		return intSituacionAbandono;
	}

	public void setIntSituacionAbandono(Integer intSituacionAbandono) {
		this.intSituacionAbandono = intSituacionAbandono;
	}

	public Integer getIntTotal() {
		return intTotal;
	}

	public void setIntTotal(Integer intTotal) {
		this.intTotal = intTotal;
	}

	public Integer getIntIdOrden() {
		return intIdOrden;
	}

	public void setIntIdOrden(Integer intIdOrden) {
		this.intIdOrden = intIdOrden;
	}

	
	

}
