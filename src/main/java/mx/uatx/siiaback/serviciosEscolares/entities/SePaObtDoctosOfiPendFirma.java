package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class SePaObtDoctosOfiPendFirma implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2304879085305646930L;

	@Id
	@Column(name = "IDSOLDOCUMENTOOFICIAL")
	private Long lngIdSolicitudDocOficial;

	@Column(name = "FCIMPRESIONDOCUMENTO")
	private Date fcImpresionDoc;

	@Column(name = "NBDOCUMENTOOFICIAL")
	private String strNbDocumentoOficial;

	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NBALUMNO")
	private String strAlumno;

	@Column(name = "APPATERNOALUMNO")
	private String strApPaterno;

	@Column(name = "APMATERNOALUMNO")
	private String strApMaterno;

	@Column(name = "PROGRAMACAMPUS")
	private String strProgramaCampus;

	@Column(name = "FACULTAD")
	private String strFacultad;

	@Column(name = "ARCHIVO")
	@Lob
	private byte[] archivo;

	@Column(name = "PERMITEFIRMACYRE")
	private Boolean blnPermiteFirmaCYRe;

	@Column(name = "PERMITEFIRMASECTEC")
	private Boolean blnPermiteFirmaSecTec;

	@Column(name = "CADENAORIGINAL")
	private String strCadena;
	
	@Column(name = "ESTATUSFIRMA")
	private String strEstatusDocumento;
	
	@Column(name = "FCREVISADO")
	private Date fcRevisado;
	
	@Column(name = "FCSUPERVISADO")
	private Date fcSupervisado;
	
	@Column(name = "DOCUMENTO")
	@Lob
	private byte[] documento;

	public Long getLngIdSolicitudDocOficial() {
		return lngIdSolicitudDocOficial;
	}

	public void setLngIdSolicitudDocOficial(Long lngIdSolicitudDocOficial) {
		this.lngIdSolicitudDocOficial = lngIdSolicitudDocOficial;
	}

	public Date getFcImpresionDoc() {
		return fcImpresionDoc;
	}

	public void setFcImpresionDoc(Date fcImpresionDoc) {
		this.fcImpresionDoc = fcImpresionDoc;
	}

	public String getStrNbDocumentoOficial() {
		return strNbDocumentoOficial;
	}

	public void setStrNbDocumentoOficial(String strNbDocumentoOficial) {
		this.strNbDocumentoOficial = strNbDocumentoOficial;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrAlumno() {
		return strAlumno;
	}

	public void setStrAlumno(String strAlumno) {
		this.strAlumno = strAlumno;
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

	public String getStrProgramaCampus() {
		return strProgramaCampus;
	}

	public void setStrProgramaCampus(String strProgramaCampus) {
		this.strProgramaCampus = strProgramaCampus;
	}

	public String getStrFacultad() {
		return strFacultad;
	}

	public void setStrFacultad(String strFacultad) {
		this.strFacultad = strFacultad;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public Boolean getBlnPermiteFirmaCYRe() {
		return blnPermiteFirmaCYRe;
	}

	public void setBlnPermiteFirmaCYRe(Boolean blnPermiteFirmaCYRe) {
		this.blnPermiteFirmaCYRe = blnPermiteFirmaCYRe;
	}

	public Boolean getBlnPermiteFirmaSecTec() {
		return blnPermiteFirmaSecTec;
	}

	public void setBlnPermiteFirmaSecTec(Boolean blnPermiteFirmaSecTec) {
		this.blnPermiteFirmaSecTec = blnPermiteFirmaSecTec;
	}

	public String getStrCadena() {
		return strCadena;
	}

	public void setStrCadena(String strCadena) {
		this.strCadena = strCadena;
	}

	public String getStrEstatusDocumento() {
		return strEstatusDocumento;
	}

	public void setStrEstatusDocumento(String strEstatusDocumento) {
		this.strEstatusDocumento = strEstatusDocumento;
	}

	public Date getFcRevisado() {
		return fcRevisado;
	}

	public void setFcRevisado(Date fcRevisado) {
		this.fcRevisado = fcRevisado;
	}

	public Date getFcSupervisado() {
		return fcSupervisado;
	}

	public void setFcSupervisado(Date fcSupervisado) {
		this.fcSupervisado = fcSupervisado;
	}

	public byte[] getDocumento() {
		return documento;
	}

	public void setDocumento(byte[] documento) {
		this.documento = documento;
	}


	
}