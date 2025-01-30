package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosEncabezadoControlExpSerSoc {
	
	@Id
	@Column(name = "PROGRAMA")
	private String programa;
	
	@Column(name = "PERIODO")
	private String periodo;

	@Column(name = "GRUPO")
	private String grupo;

	@Column(name = "GENERACION")
	private String generacion;

	@Column(name = "DOCENTE")
	private String docente;

	@Column(name = "RESPSERSOC")
	private String respSerSoc;
	
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public String getGeneracion() {
		return generacion;
	}
	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getRespSerSoc() {
		return respSerSoc;
	}
	public void setRespSerSoc(String respSerSoc) {
		this.respSerSoc = respSerSoc;
	}
	

}
