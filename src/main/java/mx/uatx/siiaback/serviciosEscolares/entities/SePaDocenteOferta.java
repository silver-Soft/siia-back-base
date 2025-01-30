package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDocenteOferta implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5452918771675821149L;

	@Id
	@Column(name = "IDOFERTADOCENTE")
	private Integer intIdOfertaDocente;

	@Column(name = "NOMBRE")
	private String strNombre;

	@Column(name = "DSTIPODOCENCIA")
	private String strTipoDocencia;
	
	@Column(name = "PERMITEELIMINAR")
	private boolean blnPermiteEliminar;

	
	public SePaDocenteOferta() {
		super();
	}


	public Integer getIntIdOfertaDocente() {
		return intIdOfertaDocente;
	}


	public void setIntIdOfertaDocente(Integer intIdOfertaDocente) {
		this.intIdOfertaDocente = intIdOfertaDocente;
	}


	public String getStrNombre() {
		return strNombre;
	}


	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}


	public String getStrTipoDocencia() {
		return strTipoDocencia;
	}


	public void setStrTipoDocencia(String strTipoDocencia) {
		this.strTipoDocencia = strTipoDocencia;
	}


	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}


	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}


	
}
