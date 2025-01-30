package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaProgramasConvocatoria implements Serializable {
	
	@Id
	@Column(name = "IDPROGRAMACAMPUS")
	private Long lngIdProgramaCampus;
	
	@Column(name = "PROGRAMA")
	private String strProgramaEducativo;
	
	@Column(name = "PERMITESELECCIONAR")
	private Integer blnSeleccionado;
	
	@Column(name = "PERMITEELIMINAR")
	private Integer blnPermiteEliminar;

	public Long getLngIdProgramaCampus() {
		return lngIdProgramaCampus;
	}

	public void setLngIdProgramaCampus(Long lngIdProgramaCampus) {
		this.lngIdProgramaCampus = lngIdProgramaCampus;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public Integer getBlnSeleccionado() {
		return blnSeleccionado;
	}

	public void setBlnSeleccionado(Integer blnSeleccionado) {
		this.blnSeleccionado = blnSeleccionado;
	}

	public Integer getBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(Integer blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}

}
