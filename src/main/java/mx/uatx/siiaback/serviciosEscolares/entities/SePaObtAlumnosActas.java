package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtAlumnosActas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2431172452079173058L;

	@Id
	@Column(name = "IDALUMNOACTA")
	private Long lngIdAlumnoActa;

	@Column(name = "CLCALIFICACION")
	private Integer intClCalificacion;

	@Column(name = "CLCALIFICACIONFINAL")
	private Integer intClCalificacionFinal;
	
	@Column(name = "CALIFICACIONCIFRA")
	private String strCalificacionCifra;

	@Column(name = "DSCALIFICACION")
	private String strDsCalificacion;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NBPERSONA")
	private String strNombre;

	@Column(name = "APPATERNO")
	private String strApPaterno;

	@Column(name = "APMATERNO")
	private String strApMaterno;

	@Column(name = "PROMEDIOPARCIALES")
	private String strPromedio;

	@Column(name = "OBSERVACION")
	private String strObservacion;

	public SePaObtAlumnosActas() {
		super();
	}

	public Long getLngIdAlumnoActa() {
		return lngIdAlumnoActa;
	}

	public void setLngIdAlumnoActa(Long lngIdAlumnoActa) {
		this.lngIdAlumnoActa = lngIdAlumnoActa;
	}

	public Integer getIntClCalificacion() {
		return intClCalificacion;
	}

	public void setIntClCalificacion(Integer intClCalificacion) {
		this.intClCalificacion = intClCalificacion;
	}

	public Integer getIntClCalificacionFinal() {
		return intClCalificacionFinal;
	}

	public void setIntClCalificacionFinal(Integer intClCalificacionFinal) {
		this.intClCalificacionFinal = intClCalificacionFinal;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrDsCalificacion() {
		return strDsCalificacion;
	}

	public void setStrDsCalificacion(String strDsCalificacion) {
		this.strDsCalificacion = strDsCalificacion;
	}

	public String getStrPromedio() {
		return strPromedio;
	}

	public void setStrPromedio(String strPromedio) {
		this.strPromedio = strPromedio;
	}

	public String getStrObservacion() {
		return strObservacion;
	}

	public void setStrObservacion(String strObservacion) {
		this.strObservacion = strObservacion;
	}

	public String getStrCalificacionCifra() {
		return strCalificacionCifra;
	}

	public void setStrCalificacionCifra(String strCalificacionCifra) {
		this.strCalificacionCifra = strCalificacionCifra;
	}

}
