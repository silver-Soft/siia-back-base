package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosConvocatoria implements Serializable {

	private static final long serialVersionUID = -3782226925485283317L;

	@Id
	@Column(name = "IDCONVOCATORIA")
	private Long lngIdConvocatoria;
	
	@Column(name = "DSCONVOCATORIA")
	private String strDescripcion;
	
	@Column(name = "DSPERIODOMES")
	private String strPeriodo;
	
	@Column(name = "DIRIGIDOA")
	private String strDirigido;
	
	@Column(name = "FCINICIO")
	private Date fcInicio;
	
	@Column(name = "FCFINAL")
	private Date fcFin;
	
	@Column(name = "OBSERVACIONES")
	private String strObservaciones;
	
	@Column(name = "NMESTIMADOPARTICIPANTES")
	private Long lngEstimadoAspirantes;
	
	@Column(name = "DSESTATUSCONVOCATORIA")
	private String strEstatus;
	
	@Column(name = "PERMITEMODIFICAR")
	private Integer intPermiteModificar;
	
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;
	
	@Column(name = "PERIODOESCOLAR")
	private String strIdPeriodoEscolar;

	public Long getLngIdConvocatoria() {
		return lngIdConvocatoria;
	}

	public void setLngIdConvocatoria(Long lngIdConvocatoria) {
		this.lngIdConvocatoria = lngIdConvocatoria;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrDirigido() {
		return strDirigido;
	}

	public void setStrDirigido(String strDirigido) {
		this.strDirigido = strDirigido;
	}

	public Date getFcInicio() {
		return fcInicio;
	}

	public void setFcInicio(Date fcInicio) {
		this.fcInicio = fcInicio;
	}

	public Date getFcFin() {
		return fcFin;
	}

	public void setFcFin(Date fcFin) {
		this.fcFin = fcFin;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public Long getLngEstimadoAspirantes() {
		return lngEstimadoAspirantes;
	}

	public void setLngEstimadoAspirantes(Long lngEstimadoAspirantes) {
		this.lngEstimadoAspirantes = lngEstimadoAspirantes;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIntPermiteModificar() {
		return intPermiteModificar;
	}

	public void setIntPermiteModificar(Integer intPermiteModificar) {
		this.intPermiteModificar = intPermiteModificar;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrIdPeriodoEscolar() {
		return strIdPeriodoEscolar;
	}

	public void setStrIdPeriodoEscolar(String strIdPeriodoEscolar) {
		this.strIdPeriodoEscolar = strIdPeriodoEscolar;
	}

}
