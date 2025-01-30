package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.Date;
import mx.uatx.siiaback.serviciosEscolares.entities.SePaTutorias;
import mx.uatx.siiaback.serviciosUniversitarios.helper.FechaHelper;

public class TutoriasTO implements Serializable, Cloneable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3997110275188309186L;

	private Long lngIdTutoriaAx;
	private String strDsAsunto;
	private String strDsResumen;
	private String strDsTutor;
	private Date fcTutoria;
	private String strFcTutoria;
	private String strDsTipoTutoria;
	private String strDsEstatusTutoria;
	private Date fcAudit;
	private String strUsuarioAudit;

	public TutoriasTO() {

	}

	public TutoriasTO(SePaTutorias tutoria, FechaHelper fcHelper) {

		lngIdTutoriaAx = tutoria.getLngIdTutoriaAx();
		strDsAsunto = tutoria.getStrDsAsunto();
		strDsResumen = tutoria.getStrDsResumen();
		strDsTutor = tutoria.getStrDsTutor();
		fcTutoria = tutoria.getFcTutoria();
		strFcTutoria = fcHelper.formatearFecha(fcTutoria);
		strDsTipoTutoria = tutoria.getStrDsTipoTutoria();
		strDsEstatusTutoria = tutoria.getStrDsEstatusTutoria();

	}

	public Long getLngIdTutoriaAx() {
		return lngIdTutoriaAx;
	}

	public void setLngIdTutoriaAx(Long lngIdTutoriaAx) {
		this.lngIdTutoriaAx = lngIdTutoriaAx;
	}

	public String getStrDsAsunto() {
		return strDsAsunto;
	}

	public void setStrDsAsunto(String strDsAsunto) {
		this.strDsAsunto = strDsAsunto;
	}

	public String getStrDsResumen() {
		return strDsResumen;
	}

	public void setStrDsResumen(String strDsResumen) {
		this.strDsResumen = strDsResumen;
	}

	public String getStrDsTutor() {
		return strDsTutor;
	}

	public void setStrDsTutor(String strDsTutor) {
		this.strDsTutor = strDsTutor;
	}

	public Date getFcTutoria() {
		return fcTutoria;
	}

	public void setFcTutoria(Date fcTutoria) {
		this.fcTutoria = fcTutoria;
	}

	public String getStrDsTipoTutoria() {
		return strDsTipoTutoria;
	}

	public void setStrDsTipoTutoria(String strDsTipoTutoria) {
		this.strDsTipoTutoria = strDsTipoTutoria;
	}

	public String getStrDsEstatusTutoria() {
		return strDsEstatusTutoria;
	}

	public void setStrDsEstatusTutoria(String strDsEstatusTutoria) {
		this.strDsEstatusTutoria = strDsEstatusTutoria;
	}

	public String getStrFcTutoria() {
		return strFcTutoria;
	}

	public void setStrFcTutoria(String strFcTutoria) {
		this.strFcTutoria = strFcTutoria;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}
}
