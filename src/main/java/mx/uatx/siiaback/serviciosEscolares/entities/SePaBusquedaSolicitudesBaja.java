package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaBusquedaSolicitudesBaja implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1007539756660638961L;
	@Id
	@Column(name = "IDBAJA")
	private Long lngIdBaja;
	
	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NBPERSONA")
	private String strNbPersona;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "DSPERIODO")
	private String strDsPeriodo;
	
	@Column(name = "DSTIPOBAJA")
	private String strDsTipoBaja;
	
	@Column(name = "FCAUTORIZACION")
	private Date dtFcAutorizacion;
	
	@Column(name = "FCBAJA")
	private Date dtFcBaja;
	
	@Column(name = "DSESTATUSBAJA")
	private String strDsEstatusBaja;
	
	@Column(name = "DSMOTIVOBAJA")
	private String strDsMotivoBaja;
	
	@Column(name = "DSOBSERVACIONES")
	private String strDsObservaciones;
	
	@Column(name = "DESHACERBAJA")
	private Boolean blnDeshacerBaja;
	
	@Column(name = "REACTIVARALUMNO")
	private Boolean blnReactivarAlumno;
	
	@Column(name = "INACTIVACARGA")
	private String strInactivaCarga;
	
	public SePaBusquedaSolicitudesBaja() {
		super();
	}

	public Long getLngIdBaja() {
		return lngIdBaja;
	}

	public void setLngIdBaja(Long lngIdBaja) {
		this.lngIdBaja = lngIdBaja;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
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

	public String getStrDsPeriodo() {
		return strDsPeriodo;
	}

	public void setStrDsPeriodo(String strDsPeriodo) {
		this.strDsPeriodo = strDsPeriodo;
	}

	public String getStrDsTipoBaja() {
		return strDsTipoBaja;
	}

	public void setStrDsTipoBaja(String strDsTipoBaja) {
		this.strDsTipoBaja = strDsTipoBaja;
	}

	public Date getDtFcAutorizacion() {
		return dtFcAutorizacion;
	}

	public void setDtFcAutorizacion(Date dtFcAutorizacion) {
		this.dtFcAutorizacion = dtFcAutorizacion;
	}

	public Date getDtFcBaja() {
		return dtFcBaja;
	}

	public void setDtFcBaja(Date dtFcBaja) {
		this.dtFcBaja = dtFcBaja;
	}

	public String getStrDsEstatusBaja() {
		return strDsEstatusBaja;
	}

	public void setStrDsEstatusBaja(String strDsEstatusBaja) {
		this.strDsEstatusBaja = strDsEstatusBaja;
	}

	public String getStrDsMotivoBaja() {
		return strDsMotivoBaja;
	}

	public void setStrDsMotivoBaja(String strDsMotivoBaja) {
		this.strDsMotivoBaja = strDsMotivoBaja;
	}

	public String getStrDsObservaciones() {
		return strDsObservaciones;
	}

	public void setStrDsObservaciones(String strDsObservaciones) {
		this.strDsObservaciones = strDsObservaciones;
	}

	public Boolean getBlnDeshacerBaja() {
		return blnDeshacerBaja;
	}

	public void setBlnDeshacerBaja(Boolean blnDeshacerBaja) {
		this.blnDeshacerBaja = blnDeshacerBaja;
	}

	public Boolean getBlnReactivarAlumno() {
		return blnReactivarAlumno;
	}

	public void setBlnReactivarAlumno(Boolean blnReactivarAlumno) {
		this.blnReactivarAlumno = blnReactivarAlumno;
	}

	public String getStrInactivaCarga() {
		return strInactivaCarga;
	}

	public void setStrInactivaCarga(String strInactivaCarga) {
		this.strInactivaCarga = strInactivaCarga;
	}
	
	
}
