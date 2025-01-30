package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.io.Serializable;
import java.util.Date;

import org.springframework.beans.BeanUtils;

import mx.uatx.siiaback.serviciosEscolares.entities.SePaTutoradosPrograma;

public class TutoradoProgramaTO implements Serializable {

	private static final long serialVersionUID = -3401968002168270730L;
	private String strMatricula;
	private String strNbAlumno;
	private String strNbTutor;
	private String strColor;
	private Long lngIdHistorialAcademico;
	private boolean seleccionado;
	private String strUsuario;
	private String strIdPeriodo;
	private Integer intIdPlantillaEmpleado;
	private Integer idTutor;
	private Date fcinicio;
	private Date fcfin;
	
	

	public TutoradoProgramaTO() {
		super();
	}
	
	

	public TutoradoProgramaTO(final SePaTutoradosPrograma entidad) {
		BeanUtils.copyProperties(entidad, this);
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNbAlumno() {
		return strNbAlumno;
	}

	public void setStrNbAlumno(String strNbAlumno) {
		this.strNbAlumno = strNbAlumno;
	}

	public String getStrNbTutor() {
		return strNbTutor;
	}

	public void setStrNbTutor(String strNbTutor) {
		this.strNbTutor = strNbTutor;
	}

	public String getStrColor() {
		return strColor;
	}

	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}

	public Long getLngIdHistorialAcademico() {
		return lngIdHistorialAcademico;
	}

	public void setLngIdHistorialAcademico(Long lngIdHistorialAcademico) {
		this.lngIdHistorialAcademico = lngIdHistorialAcademico;
	}

	public boolean isSeleccionado() {
		return seleccionado;
	}

	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrUsuario() {
		return strUsuario;
	}

	public void setStrUsuario(String strUsuario) {
		this.strUsuario = strUsuario;
	}

	public Integer getIntIdPlantillaEmpleado() {
		return intIdPlantillaEmpleado;
	}

	public void setIntIdPlantillaEmpleado(Integer intIdPlantillaEmpleado) {
		this.intIdPlantillaEmpleado = intIdPlantillaEmpleado;
	}

	public Integer getIdTutor() {
		return idTutor;
	}

	public void setIdTutor(Integer idTutor) {
		this.idTutor = idTutor;
	}

	public Date getFcinicio() {
		return fcinicio;
	}

	public void setFcinicio(Date fcinicio) {
		this.fcinicio = fcinicio;
	}

	public Date getFcfin() {
		return fcfin;
	}

	public void setFcfin(Date fcfin) {
		this.fcfin = fcfin;
	}

}