package mx.uatx.siiaback.serviciosEscolares.tutorias.dto;

import java.util.Date;

public class BusquedaTutoresTO {

	private Integer intIdPrograma;

	private Integer intIdProgramaCampus;

	private String strIdPeriodo;

	private String strIdPeriodoOrigen;

	private String strIdPeriodoDestino;

	private Integer intIdHostorialLaboral;

	private boolean blnMostrarTablaTutorados;
	
	private String strUsuario;
	
	private Date dteFcAudit;
	
	private Integer intPlantillaEmpleado;
	
	private Integer intIdHistorialLaboral;
	
	

	public BusquedaTutoresTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getIntIdPrograma() {
		return intIdPrograma;
	}

	public void setIntIdPrograma(Integer intIdPrograma) {
		this.intIdPrograma = intIdPrograma;
	}

	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}

	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}

	public String getStrIdPeriodoOrigen() {
		return strIdPeriodoOrigen;
	}

	public void setStrIdPeriodoOrigen(String strIdPeriodoOrigen) {
		this.strIdPeriodoOrigen = strIdPeriodoOrigen;
	}

	public String getStrIdPeriodoDestino() {
		return strIdPeriodoDestino;
	}

	public void setStrIdPeriodoDestino(String strIdPeriodoDestino) {
		this.strIdPeriodoDestino = strIdPeriodoDestino;
	}

	public Integer getIntIdHostorialLaboral() {
		return intIdHostorialLaboral;
	}

	public void setIntIdHostorialLaboral(Integer intIdHostorialLaboral) {
		this.intIdHostorialLaboral = intIdHostorialLaboral;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public boolean isBlnMostrarTablaTutorados() {
		return blnMostrarTablaTutorados;
	}

	public void setBlnMostrarTablaTutorados(boolean blnMostrarTablaTutorados) {
		this.blnMostrarTablaTutorados = blnMostrarTablaTutorados;
	}

	public String getStrUsuario() {
		return strUsuario;
	}

	public void setStrUsuario(String strUsuario) {
		this.strUsuario = strUsuario;
	}

	public Date getDteFcAudit() {
		return dteFcAudit;
	}

	public void setDteFcAudit(Date dteFcAudit) {
		this.dteFcAudit = dteFcAudit;
	}

	public Integer getIntPlantillaEmpleado() {
		return intPlantillaEmpleado;
	}

	public void setIntPlantillaEmpleado(Integer intPlantillaEmpleado) {
		this.intPlantillaEmpleado = intPlantillaEmpleado;
	}

	public Integer getIntIdHistorialLaboral() {
		return intIdHistorialLaboral;
	}

	public void setIntIdHistorialLaboral(Integer intIdHistorialLaboral) {
		this.intIdHistorialLaboral = intIdHistorialLaboral;
	}
	
	
	
	

}
