package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtCuestionariosPersonas implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8030163591921523923L;

	@Id
	@Column(name = "IDCUESTIONARIOPERSONA")
	private Long lngIdCuestionarioPersona;

	@Column(name = "DSCUESTIONARIO")
	private String strDsCuestionario;

	@Column(name = "DSPERIODOTEMPORADA")
	private String strPeriodo;

	@Column(name = "DSESTATUSCUESTIONARIO")
	private String strEstatus;

	@Column(name = "PERMITECONTESTAR")
	private Boolean blnPermiteContestar;

	@Column(name = "PERMITERECONOCIMIENTO")
	private Boolean blnPermiteReconocimiento;

	@Column(name = "LEYENDA")
	private String strLeyendaReporte;

	@Column(name = "NBCOORDINADORMHIC")
	private String strNombreCoordinadorRMHIC;

	@Column(name = "NBDIRECTORPLANEACION")
	private String strNombreDirectorPlaneacion;

	@Column(name = "PERMITEIMPRIMIR")
	private Boolean blnPermiteImprimir;

	public Long getLngIdCuestionarioPersona() {
		return lngIdCuestionarioPersona;
	}

	public void setLngIdCuestionarioPersona(Long lngIdCuestionarioPersona) {
		this.lngIdCuestionarioPersona = lngIdCuestionarioPersona;
	}

	public String getStrDsCuestionario() {
		return strDsCuestionario;
	}

	public void setStrDsCuestionario(String strDsCuestionario) {
		this.strDsCuestionario = strDsCuestionario;
	}

	public String getStrPeriodo() {
		return strPeriodo;
	}

	public void setStrPeriodo(String strPeriodo) {
		this.strPeriodo = strPeriodo;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}

	public Boolean getBlnPermiteContestar() {
		return blnPermiteContestar;
	}

	public void setBlnPermiteContestar(Boolean blnPermiteContestar) {
		this.blnPermiteContestar = blnPermiteContestar;
	}

	public Boolean getBlnPermiteReconocimiento() {
		return blnPermiteReconocimiento;
	}

	public void setBlnPermiteReconocimiento(Boolean blnPermiteReconocimiento) {
		this.blnPermiteReconocimiento = blnPermiteReconocimiento;
	}

	public String getStrLeyendaReporte() {
		return strLeyendaReporte;
	}

	public void setStrLeyendaReporte(String strLeyendaReporte) {
		this.strLeyendaReporte = strLeyendaReporte;
	}

	public String getStrNombreCoordinadorRMHIC() {
		return strNombreCoordinadorRMHIC;
	}

	public void setStrNombreCoordinadorRMHIC(String strNombreCoordinadorRMHIC) {
		this.strNombreCoordinadorRMHIC = strNombreCoordinadorRMHIC;
	}

	public String getStrNombreDirectorPlaneacion() {
		return strNombreDirectorPlaneacion;
	}

	public void setStrNombreDirectorPlaneacion(String strNombreDirectorPlaneacion) {
		this.strNombreDirectorPlaneacion = strNombreDirectorPlaneacion;
	}

	public Boolean getBlnPermiteImprimir() {
		return blnPermiteImprimir;
	}

	public void setBlnPermiteImprimir(Boolean blnPermiteImprimir) {
		this.blnPermiteImprimir = blnPermiteImprimir;
	}

}
