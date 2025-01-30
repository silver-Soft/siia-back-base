package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosAsegurados implements Serializable {
	
	@Id
	@Column(name = "IDCOMPLEMENTARIOIMSS")
	private Long lngIdComplementarioIMSS;
    
	@Column(name = "MATRICULA")
	private String strMatricula;
    
	@Column(name = "NBPERSONA")
	private String strNbPersona;
    
	@Column(name = "APPATERNO")
	private String strApPaterno;
    
	@Column(name = "APMATERNO")
	private String strApMaterno;
    
	@Column(name = "CURP")
	private String strCurp;
    
	@Column(name = "FCSOLICITUD")
	private Date fcSolicitud;
    
	@Column(name = "NSS")
	private String lngNSS;
    
	@Column(name = "DSCLINICA")
	private String strDsClinica;
    
	@Column(name = "ESTATUSACTIVO")
	private String strEstatusActivo;
    
	@Column(name = "ESTATUSACEPTADO")
	private String strEstatusAceptado;
    
	@Column(name = "OBSERVACIONES")
	private String strObservaciones;
	
	@Column(name = "PROGRAMACAMPUS")
	private String programacampus;
	
	@Column(name = "PERIODO")
	private Integer periodo;
	
	@Column(name = "PERMITEBAJA")
	private Integer permiteBaja;
	
	@Column(name = "FCULTIMOCAMBIO")
	private String fcUltimoCambio;
	
	public SePaDatosAsegurados() {
		super();
	}

	public Long getLngIdComplementarioIMSS() {
		return lngIdComplementarioIMSS;
	}

	public void setLngIdComplementarioIMSS(Long lngIdComplementarioIMSS) {
		this.lngIdComplementarioIMSS = lngIdComplementarioIMSS;
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

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getStrDsClinica() {
		return strDsClinica;
	}

	public void setStrDsClinica(String strDsClinica) {
		this.strDsClinica = strDsClinica;
	}

	public String getStrEstatusActivo() {
		return strEstatusActivo;
	}

	public void setStrEstatusActivo(String strEstatusActivo) {
		this.strEstatusActivo = strEstatusActivo;
	}

	public String getStrEstatusAceptado() {
		return strEstatusAceptado;
	}

	public void setStrEstatusAceptado(String strEstatusAceptado) {
		this.strEstatusAceptado = strEstatusAceptado;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public String getLngNSS() {
		return lngNSS;
	}

	public void setLngNSS(String lngNSS) {
		this.lngNSS = lngNSS;
	}

	public String getProgramacampus() {
		return programacampus;
	}

	public void setProgramacampus(String programacampus) {
		this.programacampus = programacampus;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}

	public Integer getPermiteBaja() {
		return permiteBaja;
	}

	public void setPermiteBaja(Integer permiteBaja) {
		this.permiteBaja = permiteBaja;
	}

	public String getFcUltimoCambio() {
		return fcUltimoCambio;
	}

	public void setFcUltimoCambio(String fcUltimoCambio) {
		this.fcUltimoCambio = fcUltimoCambio;
	}
	

}
