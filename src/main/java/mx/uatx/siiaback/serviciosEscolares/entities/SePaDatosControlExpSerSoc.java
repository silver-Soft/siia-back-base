package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosControlExpSerSoc {
	
	@Id
	@Column(name = "NMEXPEDIENTE")
	private Long idSolicitudSerSoc;
	
	@Column(name = "NOMBREPRESTADOR")
	private String nombrePrestador;
	
	@Column(name = "NOMBRESECTDEPENDENCIAS")
	private String nombreDependencia;
	
	@Column(name = "NOMBRE_SEAXPROGRAMASSERSOC")
	private String nombreProgramaSerSoc;
	
	@Column(name = "PER_INICIO")
	private String perInicio;
	
	@Column(name = "PER_FIN")
	private String perFin;
	
	@Column(name = "DOCUMENTO1")
	private String documento1;

	@Column(name = "DOCUMENTO2")
	private String documento2;

	@Column(name = "DOCUMENTO3")
	private String documento3;

	@Column(name = "DOCUMENTO4")
	private String documento4;

	@Column(name = "DOCUMENTO5")
	private String documento5;

	@Column(name = "DOCUMENTO6")
	private String documento6;

	@Column(name = "DOCUMENTO7")
	private String documento7;

	@Column(name = "DOCUMENTO8")
	private String documento8;

	@Column(name = "DOCUMENTO9")
	private String documento9;

	@Column(name = "OBSERVACIONES")
	private String observaciones;
	
	public Long getIdSolicitudSerSoc() {
		return idSolicitudSerSoc;
	}
	public void setIdSolicitudSerSoc(Long idSolicitudSerSoc) {
		this.idSolicitudSerSoc = idSolicitudSerSoc;
	}
	public String getNombrePrestador() {
		return nombrePrestador;
	}
	public void setNombrePrestador(String nombrePrestador) {
		this.nombrePrestador = nombrePrestador;
	}
	public String getNombreDependencia() {
		return nombreDependencia;
	}
	public void setNombreDependencia(String nombreDependencia) {
		this.nombreDependencia = nombreDependencia;
	}
	public String getNombreProgramaSerSoc() {
		return nombreProgramaSerSoc;
	}
	public void setNombreProgramaSerSoc(String nombreProgramaSerSoc) {
		this.nombreProgramaSerSoc = nombreProgramaSerSoc;
	}
	public String getPerInicio() {
		return perInicio;
	}
	public void setPerInicio(String perInicio) {
		this.perInicio = perInicio;
	}
	public String getPerFin() {
		return perFin;
	}
	public void setPerFin(String perFin) {
		this.perFin = perFin;
	}
	public String getDocumento1() {
		return documento1;
	}
	public void setDocumento1(String documento1) {
		this.documento1 = documento1;
	}
	public String getDocumento2() {
		return documento2;
	}
	public void setDocumento2(String documento2) {
		this.documento2 = documento2;
	}
	public String getDocumento3() {
		return documento3;
	}
	public void setDocumento3(String documento3) {
		this.documento3 = documento3;
	}
	public String getDocumento4() {
		return documento4;
	}
	public void setDocumento4(String documento4) {
		this.documento4 = documento4;
	}
	public String getDocumento5() {
		return documento5;
	}
	public void setDocumento5(String documento5) {
		this.documento5 = documento5;
	}
	public String getDocumento6() {
		return documento6;
	}
	public void setDocumento6(String documento6) {
		this.documento6 = documento6;
	}
	public String getDocumento7() {
		return documento7;
	}
	public void setDocumento7(String documento7) {
		this.documento7 = documento7;
	}
	public String getDocumento8() {
		return documento8;
	}
	public void setDocumento8(String documento8) {
		this.documento8 = documento8;
	}
	public String getDocumento9() {
		return documento9;
	}
	public void setDocumento9(String documento9) {
		this.documento9 = documento9;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

}
