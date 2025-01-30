package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosAspiranteEstudiante {
	
	@Id
	@Column(name = "IDHISTORIALACADEMICO")
	private Long idHistorialAcademico;
	
	@Column(name = "DSCONVOCATORIA")
	private String dsConvocatoria;
	
	@Column(name = "FOLIOUATX")
	private Long idSolicitudIngreso;
	
	@Column(name = "FCREGISTRO")
	private Date fcSolicitud;
	
	@Column(name = "PEELEGIDO")
	private String dsOpcion1;
	
	@Column(name = "PESEGUNDAOPCION")
	private String dsOpcion2;
	
	@Column(name = "NMFOLIOCENEVAL")
	private String nmFicha;
	
	@Column(name = "NBESCUELA")
	private String dsEscuelaProcedencia;
	
	@Column(name = "NBENTIDAD")
	private String dsEstadoEscuelaProcedencia;
	
	@Column(name = "NMPROMEDIOGENERAL")
	private Float promedio;
	
	@Column(name = "CLESTATUSCOINCIDE")
	private Integer dsAplicoSOV;

	@Column(name = "RESULTADOCENEVAL")
	private byte[] resultadosKuder;

	public Long getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Long idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}

	public String getDsConvocatoria() {
		return dsConvocatoria;
	}

	public void setDsConvocatoria(String dsConvocatoria) {
		this.dsConvocatoria = dsConvocatoria;
	}

	public Long getIdSolicitudIngreso() {
		return idSolicitudIngreso;
	}

	public void setIdSolicitudIngreso(Long idSolicitudIngreso) {
		this.idSolicitudIngreso = idSolicitudIngreso;
	}

	public Date getFcSolicitud() {
		return fcSolicitud;
	}

	public void setFcSolicitud(Date fcSolicitud) {
		this.fcSolicitud = fcSolicitud;
	}

	public String getDsOpcion1() {
		return dsOpcion1;
	}

	public void setDsOpcion1(String dsOpcion1) {
		this.dsOpcion1 = dsOpcion1;
	}

	public String getDsOpcion2() {
		return dsOpcion2;
	}

	public void setDsOpcion2(String dsOpcion2) {
		this.dsOpcion2 = dsOpcion2;
	}

	public String getNmFicha() {
		return nmFicha;
	}

	public void setNmFicha(String nmFicha) {
		this.nmFicha = nmFicha;
	}

	public String getDsEscuelaProcedencia() {
		return dsEscuelaProcedencia;
	}

	public void setDsEscuelaProcedencia(String dsEscuelaProcedencia) {
		this.dsEscuelaProcedencia = dsEscuelaProcedencia;
	}

	public String getDsEstadoEscuelaProcedencia() {
		return dsEstadoEscuelaProcedencia;
	}

	public void setDsEstadoEscuelaProcedencia(String dsEstadoEscuelaProcedencia) {
		this.dsEstadoEscuelaProcedencia = dsEstadoEscuelaProcedencia;
	}

	public Float getPromedio() {
		return promedio;
	}

	public void setPromedio(Float promedio) {
		this.promedio = promedio;
	}

	public Integer getDsAplicoSOV() {
		return dsAplicoSOV;
	}

	public void setDsAplicoSOV(Integer dsAplicoSOV) {
		this.dsAplicoSOV = dsAplicoSOV;
	}

	public byte[] getResultadosKuder() {
		return resultadosKuder;
	}

	public void setResultadosKuder(byte[] resultadosKuder) {
		this.resultadosKuder = resultadosKuder;
	}
	

}
