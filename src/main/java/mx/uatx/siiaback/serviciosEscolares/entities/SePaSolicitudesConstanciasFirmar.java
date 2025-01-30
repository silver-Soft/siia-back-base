package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaSolicitudesConstanciasFirmar {

	@Id
	@Column(name = "IDSOLICITUDDOCUMENTOOFICIAL")
	private Integer intIdSolicitudDocumentoOficial;

	@Column(name = "NBDOCUMENTO")
	private String strNbDocumento;

	@Column(name = "FCSOLICITUD")
	private Date dteFcSolicitud;

	@Column(name = "ESTATUSSOLICITUD")
	private String strEstatus;

	@Column(name = "FCFIRMA")
	private Date dteFcFirma;

	@Column(name = "PERMITEVALIDAR")
	private Integer intPermiteValidar;
	
	@Column(name = "PERMITEDESVALIDAR")
	private Integer intPermiteDesValidar;

	@Column(name = "PERMITEFIRMAR")
	private Integer intPermiteFirmar;
	
	@Column(name = "PERMITEELIMINAR")
	private Integer intPermiteEliminar;
	
	@Column(name = "PERMITEPROMEDIO")
	private Integer intPermitePromedio;
	
	@Column(name = "OBSERVACIONES")
	private String strObservaciones;

	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;

	@Column(name = "IDDOCUMENTOOFICIAL")
	private Integer intIdDocumento;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "PROGRAMA")
	private String strPrograma;

	@Column(name = "FACULTAD")
	private String strFacultad;

	@Column(name = "CADENAORIGINAL")
	private String strCadenaOriginal;
	
	@Column(name = "ESTATUSPAGO")
	private String strEstatusPago;
	
	@Column(name = "PERIODOVACACIONAL")
	private String strTextoPeriodo;
	
	@Column(name = "CORREOSOLICITANTE")
	private String strCorreoElectronico;
	
	public SePaSolicitudesConstanciasFirmar() {
		super();
	}

	public Integer getIntIdSolicitudDocumentoOficial() {
		return intIdSolicitudDocumentoOficial;
	}

	public void setIntIdSolicitudDocumentoOficial(Integer intIdSolicitudDocumentoOficial) {
		this.intIdSolicitudDocumentoOficial = intIdSolicitudDocumentoOficial;
	}

	public String getStrNbDocumento() {
		return strNbDocumento;
	}

	public void setStrNbDocumento(String strNbDocumento) {
		this.strNbDocumento = strNbDocumento;
	}

	public Date getDteFcSolicitud() {
		return dteFcSolicitud;
	}

	public void setDteFcSolicitud(Date dteFcSolicitud) {
		this.dteFcSolicitud = dteFcSolicitud;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Date getDteFcFirma() {
		return dteFcFirma;
	}

	public void setDteFcFirma(Date dteFcFirma) {
		this.dteFcFirma = dteFcFirma;
	}

	public Integer getIntPermiteValidar() {
		return intPermiteValidar;
	}

	public void setIntPermiteValidar(Integer intPermiteValidar) {
		this.intPermiteValidar = intPermiteValidar;
	}

	public Integer getIntPermiteFirmar() {
		return intPermiteFirmar;
	}

	public void setIntPermiteFirmar(Integer intPermiteFirmar) {
		this.intPermiteFirmar = intPermiteFirmar;
	}

	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}

	

	public Integer getIntIdDocumento() {
		return intIdDocumento;
	}

	public void setIntIdDocumento(Integer intIdDocumento) {
		this.intIdDocumento = intIdDocumento;
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

	public String getStrPrograma() {
		return strPrograma;
	}

	public void setStrPrograma(String strPrograma) {
		this.strPrograma = strPrograma;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public String getStrCadenaOriginal() {
		return strCadenaOriginal;
	}

	public void setStrCadenaOriginal(String strCadenaOriginal) {
		this.strCadenaOriginal = strCadenaOriginal;
	}

	public Integer getIntPermiteDesValidar() {
		return intPermiteDesValidar;
	}

	public void setIntPermiteDesValidar(Integer intPermiteDesValidar) {
		this.intPermiteDesValidar = intPermiteDesValidar;
	}

	public String getStrEstatusPago() {
		return strEstatusPago;
	}

	public void setStrEstatusPago(String strEstatusPago) {
		this.strEstatusPago = strEstatusPago;
	}

	public String getStrTextoPeriodo() {
		return strTextoPeriodo;
	}

	public void setStrTextoPeriodo(String strTextoPeriodo) {
		this.strTextoPeriodo = strTextoPeriodo;
	}

	public String getStrCorreoElectronico() {
		return strCorreoElectronico;
	}

	public void setStrCorreoElectronico(String strCorreoElectronico) {
		this.strCorreoElectronico = strCorreoElectronico;
	}

	public Integer getIntPermiteEliminar() {
		return intPermiteEliminar;
	}

	public void setIntPermiteEliminar(Integer intPermiteEliminar) {
		this.intPermiteEliminar = intPermiteEliminar;
	}

	public String getStrObservaciones() {
		return strObservaciones;
	}

	public void setStrObservaciones(String strObservaciones) {
		this.strObservaciones = strObservaciones;
	}

	public Integer getIntPermitePromedio() {
		return intPermitePromedio;
	}

	public void setIntPermitePromedio(Integer intPermitePromedio) {
		this.intPermitePromedio = intPermitePromedio;
	}

}
