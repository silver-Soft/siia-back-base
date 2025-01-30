package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaEstudiosPreviosAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5277854642283211850L;

	@Id
	@Column(name = "IDACADEMICOPREVIOASPIRANTE")
	private Long lngIdAcademicoPrevioAspirante;

	@Column(name = "CLNIVELEDUCATIVO")
	private Integer intNivelEducativo;

	@Column(name = "DSNIVELEDUCATIVO")
	private String strNivelEducativo;

	@Column(name = "MODALIDAD")
	private String strModalidad;

	@Column(name = "INSTITUCION")
	private String strInstitucion;

	@Column(name = "TIPO")
	private String strTipo;

	@Column(name = "CLPAIS")
	private String strClPais;

	@Column(name = "NBPAIS")
	private String strNombrePais;

	@Column(name = "ENTIDAD")
	private String strEntidad;

	@Column(name = "AREACONOCIMIENTO")
	private String strAreaConocimiento;

	@Column(name = "PROMEDIO")
	private Double dbPromedio;

	@Column(name = "ANIOINGRESO")
	private Integer intAnioIngreso;

	@Column(name = "ANIOEGRESO")
	private Integer intAnioEgreso;

	@Column(name = "FCTITULO")
	private Date fcTitulo;

	@Column(name = "TITULOTESIS")
	private String strTituloTesis;

	public Long getLngIdAcademicoPrevioAspirante() {
		return lngIdAcademicoPrevioAspirante;
	}

	public void setLngIdAcademicoPrevioAspirante(Long lngIdAcademicoPrevioAspirante) {
		this.lngIdAcademicoPrevioAspirante = lngIdAcademicoPrevioAspirante;
	}

	public Integer getIntNivelEducativo() {
		return intNivelEducativo;
	}

	public void setIntNivelEducativo(Integer intNivelEducativo) {
		this.intNivelEducativo = intNivelEducativo;
	}

	public String getStrNivelEducativo() {
		return strNivelEducativo;
	}

	public void setStrNivelEducativo(String strNivelEducativo) {
		this.strNivelEducativo = strNivelEducativo;
	}

	public String getStrModalidad() {
		return strModalidad;
	}

	public void setStrModalidad(String strModalidad) {
		this.strModalidad = strModalidad;
	}

	public String getStrInstitucion() {
		return strInstitucion;
	}

	public void setStrInstitucion(String strInstitucion) {
		this.strInstitucion = strInstitucion;
	}

	public String getStrTipo() {
		return strTipo;
	}

	public void setStrTipo(String strTipo) {
		this.strTipo = strTipo;
	}

	public String getStrClPais() {
		return strClPais;
	}

	public void setStrClPais(String strClPais) {
		this.strClPais = strClPais;
	}

	public String getStrNombrePais() {
		return strNombrePais;
	}

	public void setStrNombrePais(String strNombrePais) {
		this.strNombrePais = strNombrePais;
	}

	public String getStrEntidad() {
		return strEntidad;
	}

	public void setStrEntidad(String strEntidad) {
		this.strEntidad = strEntidad;
	}

	public String getStrAreaConocimiento() {
		return strAreaConocimiento;
	}

	public void setStrAreaConocimiento(String strAreaConocimiento) {
		this.strAreaConocimiento = strAreaConocimiento;
	}

	public Integer getIntAnioIngreso() {
		return intAnioIngreso;
	}

	public void setIntAnioIngreso(Integer intAnioIngreso) {
		this.intAnioIngreso = intAnioIngreso;
	}

	public Integer getIntAnioEgreso() {
		return intAnioEgreso;
	}

	public void setIntAnioEgreso(Integer intAnioEgreso) {
		this.intAnioEgreso = intAnioEgreso;
	}

	public Date getFcTitulo() {
		return fcTitulo;
	}

	public void setFcTitulo(Date fcTitulo) {
		this.fcTitulo = fcTitulo;
	}

	public String getStrTituloTesis() {
		return strTituloTesis;
	}

	public void setStrTituloTesis(String strTituloTesis) {
		this.strTituloTesis = strTituloTesis;
	}

	public Double getDbPromedio() {
		return dbPromedio;
	}

	public void setDbPromedio(Double dbPromedio) {
		this.dbPromedio = dbPromedio;
	}

}
