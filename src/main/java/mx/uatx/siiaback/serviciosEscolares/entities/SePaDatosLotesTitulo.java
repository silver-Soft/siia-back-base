package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosLotesTitulo {

	@Id
	@Column(name = "FOLIORECEP")
	private Integer intNoLote;

	@Column(name = "FCENVIOPROF")
	private Date fcEnvioProfesiones;

	@Column(name = "NMTITULOS")
	private Integer intNoTitulos;

	@Column(name = "PERMITECONSULTAR")
	private boolean blnPermiteConsulta;

	@Column(name = "PERMITEDESCARGAR")
	private boolean blnPermiteDescarga;

	@Column(name = "PERMITECONSULTARDETALLE")
	private boolean blnPermiteConsultaDetalle;
	
	

	public Integer getIntNoLote() {
		return intNoLote;
	}

	public void setIntNoLote(Integer intNoLote) {
		this.intNoLote = intNoLote;
	}

	public Date getFcEnvioProfesiones() {
		return fcEnvioProfesiones;
	}

	public void setFcEnvioProfesiones(Date fcEnvioProfesiones) {
		this.fcEnvioProfesiones = fcEnvioProfesiones;
	}

	public Integer getIntNoTitulos() {
		return intNoTitulos;
	}

	public void setIntNoTitulos(Integer intNoTitulos) {
		this.intNoTitulos = intNoTitulos;
	}

	public boolean isBlnPermiteConsulta() {
		return blnPermiteConsulta;
	}

	public void setBlnPermiteConsulta(boolean blnPermiteConsulta) {
		this.blnPermiteConsulta = blnPermiteConsulta;
	}

	public boolean isBlnPermiteDescarga() {
		return blnPermiteDescarga;
	}

	public void setBlnPermiteDescarga(boolean blnPermiteDescarga) {
		this.blnPermiteDescarga = blnPermiteDescarga;
	}

	public boolean isBlnPermiteConsultaDetalle() {
		return blnPermiteConsultaDetalle;
	}

	public void setBlnPermiteConsultaDetalle(boolean blnPermiteConsultaDetalle) {
		this.blnPermiteConsultaDetalle = blnPermiteConsultaDetalle;
	}

}
