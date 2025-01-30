package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaConvocatoriaAspirante implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -4419912725622502841L;

	@Id
	@Column(name = "IDCONVOCATORIA")
	private Integer intIdConvocatoria;

	@Column(name = "IDTIPOCONVOCATORIA")
	private String strIdTipoConvocatoria;

	@Column(name = "CLESTATUSCONVOCATORIA")
	private String strCveEstatusConvocatoria;

	@Column(name = "DSCONVOCATORIA")
	private String strDsConvocatoria;

	@Column(name = "FCINICIOREGISTRO")
	private Date fcInicioRegistro;

	@Column(name = "FCFINREGISTRO")
	private Date fcFinRegistro;

	@Column(name = "DIRIGIDOA")
	private String strDirigidoA;
	
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;

	@Column(name = "FCCIERRE")
	private Date fcCierre;

	@Column(name = "NMESTIMADOPARTICIPANTES")
	private Integer intNumEstimadoParticipantes;

	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	public SePaConvocatoriaAspirante() {
		super();
	}

	public Integer getIntIdConvocatoria() {
		return intIdConvocatoria;
	}

	public void setIntIdConvocatoria(Integer intIdConvocatoria) {
		this.intIdConvocatoria = intIdConvocatoria;
	}

	public String getStrDsConvocatoria() {
		return strDsConvocatoria;
	}

	public void setStrDsConvocatoria(String strDsConvocatoria) {
		this.strDsConvocatoria = strDsConvocatoria;
	}

	public Date getFcInicioRegistro() {
		return fcInicioRegistro;
	}

	public void setFcInicioRegistro(Date fcInicioRegistro) {
		this.fcInicioRegistro = fcInicioRegistro;
	}

	public Date getFcFinRegistro() {
		return fcFinRegistro;
	}

	public void setFcFinRegistro(Date fcFinRegistro) {
		this.fcFinRegistro = fcFinRegistro;
	}

	public String getStrDirigidoA() {
		return strDirigidoA;
	}

	public void setStrDirigidoA(String strDirigidoA) {
		this.strDirigidoA = strDirigidoA;
	}

	public Date getFcCierre() {
		return fcCierre;
	}

	public void setFcCierre(Date fcCierre) {
		this.fcCierre = fcCierre;
	}

	public Integer getIntNumEstimadoParticipantes() {
		return intNumEstimadoParticipantes;
	}

	public void setIntNumEstimadoParticipantes(Integer intNumEstimadoParticipantes) {
		this.intNumEstimadoParticipantes = intNumEstimadoParticipantes;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrCveEstatusConvocatoria() {
		return strCveEstatusConvocatoria;
	}

	public void setStrCveEstatusConvocatoria(String strCveEstatusConvocatoria) {
		this.strCveEstatusConvocatoria = strCveEstatusConvocatoria;
	}

	public String getStrIdTipoConvocatoria() {
		return strIdTipoConvocatoria;
	}

	public void setStrIdTipoConvocatoria(String strIdTipoConvocatoria) {
		this.strIdTipoConvocatoria = strIdTipoConvocatoria;
	}

}
