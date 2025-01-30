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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXACADEMICOSPREVIOSASPIRANTE")
public class SeAxAcademicosPreviosAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -7265320049521695209L;

	private static final String GENID_ACADEMICOS_PREVIOS_ASPIRANTE = "GENIDACADEMICOPREVIOASPIRANTE";

	@Id
	@Basic(optional = false)
	@Column(name = "IDACADEMICOPREVIOASPIRANTE")
	@SequenceGenerator(name = GENID_ACADEMICOS_PREVIOS_ASPIRANTE, sequenceName = "SERESC.IDACADEMICOPREVIOASPIRANTE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_ACADEMICOS_PREVIOS_ASPIRANTE)
	private Long lngIdAcademicoPrevioAspirante;

	@Column(name = "CLNIVELEDUCATIVO")
	private Integer intNivelEducativo;

	@Column(name = "MODALIDAD")
	private String strModalidad;

	@Column(name = "INSTITUCION")
	private String strInstitucion;

	@Column(name = "TIPO")
	private String strTipo;

	@Column(name = "CLPAIS")
	private String strClPais;

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
	@Temporal(TemporalType.DATE)
	private Date fcTitulo;

	@Column(name = "TITULOTESIS")
	private String strTituloTesis;

	@Column(name = "USUARIOAUDIT")
	private String strUsuarioAudit;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcAudit = new Date();

	@Column(name = "IDASPIRANTE")
	private Long lngIdAspirante;

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

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public Long getLngIdAspirante() {
		return lngIdAspirante;
	}

	public void setLngIdAspirante(Long lngIdAspirante) {
		this.lngIdAspirante = lngIdAspirante;
	}

	public Double getDbPromedio() {
		return dbPromedio;
	}

	public void setDbPromedio(Double dbPromedio) {
		this.dbPromedio = dbPromedio;
	}

}
