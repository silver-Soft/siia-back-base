package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtMateriasDocente implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4580837421442553981L;

	@Id
	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "DSMATERIA")
	private String strMateria;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "DSGRUPOPROGRAMA")
	private String strGrupoPrograma;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strPeriodoTemporada;

	@Column(name = "NOMBREPROGRAMA")
	private String strPrograma;

	@Column(name = "NOMBREAREA")
	private String strNombreArea;

	@Column(name = "NOMBRECAMPUS")
	private String strNombreCampus;

	@Column(name = "NIVELEDUCATIVO")
	private String strNivelEducativo;

	@Column(name = "DOCENTE")
	private String strDocente;

	@Column(name = "TURNO")
	private String strTurno;

	@Column(name = "PERIODOCURSADOOFERTA")
	private String strPeriodoCursadoOferta;

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
	}

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrGrupoPrograma() {
		return strGrupoPrograma;
	}

	public void setStrGrupoPrograma(String strGrupoPrograma) {
		this.strGrupoPrograma = strGrupoPrograma;
	}

	public String getStrPeriodoTemporada() {
		return strPeriodoTemporada;
	}

	public void setStrPeriodoTemporada(String strPeriodoTemporada) {
		this.strPeriodoTemporada = strPeriodoTemporada;
	}

	public String getStrPeriodoCursadoOferta() {
		return strPeriodoCursadoOferta;
	}

	public void setStrPeriodoCursadoOferta(String strPeriodoCursadoOferta) {
		this.strPeriodoCursadoOferta = strPeriodoCursadoOferta;
	}

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrNombreArea() {
		return strNombreArea;
	}

	public void setStrNombreArea(String strNombreArea) {
		this.strNombreArea = strNombreArea;
	}

	public String getStrNombreCampus() {
		return strNombreCampus;
	}

	public void setStrNombreCampus(String strNombreCampus) {
		this.strNombreCampus = strNombreCampus;
	}

	public String getStrNivelEducativo() {
		return strNivelEducativo;
	}

	public void setStrNivelEducativo(String strNivelEducativo) {
		this.strNivelEducativo = strNivelEducativo;
	}

	public String getStrDocente() {
		return strDocente;
	}

	public void setStrDocente(String strDocente) {
		this.strDocente = strDocente;
	}

	public String getStrTurno() {
		return strTurno;
	}

	public void setStrTurno(String strTurno) {
		this.strTurno = strTurno;
	}

}
