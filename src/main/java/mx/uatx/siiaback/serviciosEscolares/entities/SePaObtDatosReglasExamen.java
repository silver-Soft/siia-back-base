package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosReglasExamen {
	
	@Id
	@Column(name = "IDFICHASOLICITUDINGRESO")
	private Long lngIdSolcitudFicha;

	@Column(name = "FCACEPTACIONREGLAS")
	private String fcAceptacionReglas;
	
	@Column(name = "FCTERMINO")
	private String fcTermino;

	@Column(name = "MENSAJE")
	private String strMensaje;

	@Column(name = "SEVERIDAD")
	private String strSeveridad;

	@Column(name = "PERMITECONTINUAR")
	private Integer intPermiteContinuar;
	
	@Column(name = "HRINICIO")
	private String strHrInicio;
	
	@Column(name = "HRFIN")
	private String strHrFin;

	public Long getLngIdSolcitudFicha() {
		return lngIdSolcitudFicha;
	}

	public void setLngIdSolcitudFicha(Long lngIdSolcitudFicha) {
		this.lngIdSolcitudFicha = lngIdSolcitudFicha;
	}

	public String getFcAceptacionReglas() {
		return fcAceptacionReglas;
	}

	public void setFcAceptacionReglas(String fcAceptacionReglas) {
		this.fcAceptacionReglas = fcAceptacionReglas;
	}

	public String getFcTermino() {
		return fcTermino;
	}

	public void setFcTermino(String fcTermino) {
		this.fcTermino = fcTermino;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}

	public String getStrSeveridad() {
		return strSeveridad;
	}

	public void setStrSeveridad(String strSeveridad) {
		this.strSeveridad = strSeveridad;
	}

	public Integer getIntPermiteContinuar() {
		return intPermiteContinuar;
	}

	public void setIntPermiteContinuar(Integer intPermiteContinuar) {
		this.intPermiteContinuar = intPermiteContinuar;
	}

	public String getStrHrInicio() {
		return strHrInicio;
	}

	public void setStrHrInicio(String strHrInicio) {
		this.strHrInicio = strHrInicio;
	}

	public String getStrHrFin() {
		return strHrFin;
	}

	public void setStrHrFin(String strHrFin) {
		this.strHrFin = strHrFin;
	}

	
}
