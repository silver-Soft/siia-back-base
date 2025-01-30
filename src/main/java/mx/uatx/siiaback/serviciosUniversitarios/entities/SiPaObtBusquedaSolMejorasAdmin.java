package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtBusquedaSolMejorasAdmin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4707120238311480069L;
	@Id
	@Column(name = "IDSOLICITUDMEJORA")
	private Integer intIdSolicitudMejora;
	
	@Column(name = "DSSOLICITUDMEJORA")
	private String strDsSolicitudMejora;
	
	@Column(name = "DSPROCESO")
	private String strDsProceso;
	
	@Column(name = "DSSTSOLICITUDMEJORA")
	private String strDsStSolicitudMejora;
	
	@Column(name = "FCTERMINO")
	private Date fcTermino;
	
	@Column(name="PERMITEMODIFICAR")
	private boolean blnPermiteModificar; 
	
	@Column(name="PERMITEELIMINAR")
	private boolean blnPermiteEliminar;



	public Integer getIntIdSolicitudMejora() {
		return intIdSolicitudMejora;
	}

	public void setIntIdSolicitudMejora(Integer intIdSolicitudMejora) {
		this.intIdSolicitudMejora = intIdSolicitudMejora;
	}

	public String getStrDsSolicitudMejora() {
		return strDsSolicitudMejora;
	}

	public void setStrDsSolicitudMejora(String strDsSolicitudMejora) {
		this.strDsSolicitudMejora = strDsSolicitudMejora;
	}

	public String getStrDsProceso() {
		return strDsProceso;
	}

	public void setStrDsProceso(String strDsProceso) {
		this.strDsProceso = strDsProceso;
	}

	public String getStrDsStSolicitudMejora() {
		return strDsStSolicitudMejora;
	}

	public void setStrDsStSolicitudMejora(String strDsStSolicitudMejora) {
		this.strDsStSolicitudMejora = strDsStSolicitudMejora;
	}

	public Date getFcTermino() {
		return fcTermino;
	}

	public void setFcTermino(Date fcTermino) {
		this.fcTermino = fcTermino;
	}

	public boolean isBlnPermiteModificar() {
		return blnPermiteModificar;
	}

	public void setBlnPermiteModificar(boolean blnPermiteModificar) {
		this.blnPermiteModificar = blnPermiteModificar;
	}

	public boolean isBlnPermiteEliminar() {
		return blnPermiteEliminar;
	}

	public void setBlnPermiteEliminar(boolean blnPermiteEliminar) {
		this.blnPermiteEliminar = blnPermiteEliminar;
	}
	
	
}
