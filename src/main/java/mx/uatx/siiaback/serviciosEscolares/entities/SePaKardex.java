package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaKardex implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 228117498490703152L;

	@Id
	@Column(name = "IDALUMNOACTA")
	private Long lngIdAlumnoActa;

	@Column(name = "CLPLANMATERIA")
	private Long lngIdPlanMateria;

	@Column(name = "IDOFERTA")
	private Long lngIdOferta;

	@Column(name = "DSMATERIA")
	private String strMateria;

	@Column(name = "DSAREAMATERIA")
	private String strAreaMateria;

	@Column(name = "CLSEMESTRE")
	private Integer intSemestre;

	@Column(name = "DSPERIODO")
	private String strPeriodo;

	@Column(name = "CLCALIFICACIONFINAL")
	private String strNmCalificacion;

	@Column(name = "DSCALIFICACION")
	private String strDsCalificacion;

	@Column(name = "DSTIPOACREDITACION")
	private String strTipoAcreditacion;

	@Column(name = "DESCRIPCIONAPROBADO")
	private String strEsCalificacion;

	public Long getLngIdPlanMateria() {
		return lngIdPlanMateria;
	}

	public void setLngIdPlanMateria(Long lngIdPlanMateria) {
		this.lngIdPlanMateria = lngIdPlanMateria;
	}

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

	public String getStrAreaMateria() {
		return strAreaMateria;
	}

	public void setStrAreaMateria(String strAreaMateria) {
		this.strAreaMateria = strAreaMateria;
	}

	public Integer getIntSemestre() {
		return intSemestre;
	}

	public void setIntSemestre(Integer intSemestre) {
		this.intSemestre = intSemestre;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public Long getLngIdAlumnoActa() {
		return lngIdAlumnoActa;
	}

	public void setLngIdAlumnoActa(Long lngIdAlumnoActa) {
		this.lngIdAlumnoActa = lngIdAlumnoActa;
	}

	public String getStrNmCalificacion() {
		return strNmCalificacion;
	}

	public void setStrNmCalificacion(String strNmCalificacion) {
		this.strNmCalificacion = strNmCalificacion;
	}

	public String getStrDsCalificacion() {
		return strDsCalificacion;
	}

	public void setStrDsCalificacion(String strDsCalificacion) {
		this.strDsCalificacion = strDsCalificacion;
	}

	public String getStrTipoAcreditacion() {
		return strTipoAcreditacion;
	}

	public void setStrTipoAcreditacion(String strTipoAcreditacion) {
		this.strTipoAcreditacion = strTipoAcreditacion;
	}

	public String getStrEsCalificacion() {
		return strEsCalificacion;
	}

	public void setStrEsCalificacion(String strEsCalificacion) {
		this.strEsCalificacion = strEsCalificacion;
	}

}
