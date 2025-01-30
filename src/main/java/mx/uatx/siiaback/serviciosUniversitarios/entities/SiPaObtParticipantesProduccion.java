package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtParticipantesProduccion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5772205104505792278L;

	@Id
	@Column(name = "ID_PARTICIPANTE_PRODUCCION")
	private Integer intIdParticipantesProduccion;
	
	@Column(name = "NOMBRE_PARTICIPANTE")
	private String strNombreParticipante;
	
	@Column(name = "TIPO_PARTICIPANTE")
	private String strTipoParticipante;
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	public Integer getIntIdParticipantesProduccion() {
		return intIdParticipantesProduccion;
	}

	public void setIntIdParticipantesProduccion(Integer intIdParticipantesProduccion) {
		this.intIdParticipantesProduccion = intIdParticipantesProduccion;
	}

	public String getStrNombreParticipante() {
		return strNombreParticipante;
	}

	public void setStrNombreParticipante(String strNombreParticipante) {
		this.strNombreParticipante = strNombreParticipante;
	}

	public String getStrTipoParticipante() {
		return strTipoParticipante;
	}

	public void setStrTipoParticipante(String strTipoParticipante) {
		this.strTipoParticipante = strTipoParticipante;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}
	
	

}
