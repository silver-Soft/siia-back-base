package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

public interface SeMsAlumnosPeriodosI {

	Long getLngIdAlumnoPeriodo();

	void setLngIdAlumnoPeriodo(Long lngIdAlumnoPeriodo);
	
	Long getLngIdHistorialAcademico();

	void setLngIdHistorialAcademico(Long lngIdHistorialAcademico);

	String getStrIdPeriodo();

	void setStrIdPeriodo(String strIdPeriodo);

	String getStrIdPago();

	void setStrIdPago(String strIdPago);

	String getStrClTipoAlumno();

	void setStrClTipoAlumno(String strClTipoAlumno);

	String getStrClStaAlumnoPeriodo();

	void setStrClStaAlumnoPeriodo(String strClStaAlumnoPeriodo);

	Long getLngClPeriodoCursado();

	void setLngClPeriodoCursado(Long lngClPeriodoCursado);

	Date getFcSolicitud();

	void setFcSolicitud(Date fcSolicitud);

	Date getFcAutorizacion();

	void setFcAutorizacion(Date fcAutorizacion);

	Date getFcInscripcion();

	void setFcInscripcion(Date fcInscripcion);

	Date getFcAudit();

	void setFcAudit(Date fcAudit);

	String getStrUsuarioAudit();

	void setStrUsuarioAudit(String strUsuarioAudit);

	Integer getIntClStCredencial();

	void setIntClStCredencial(Integer intClStCredencial);

	Integer getIntClStSeguroSocial();

	void setIntClStSeguroSocial(Integer intClStSeguroSocial);

	Integer getIntClEstatusCambioFoto();

	void setIntClEstatusCambioFoto(Integer intClEstatusCambioFoto);

	Integer getIntClEstatusCambioFirma();

	void setIntClEstatusCambioFirma(Integer intClEstatusCambioFirma);

}
