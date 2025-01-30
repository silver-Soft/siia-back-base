package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDatosConstanciasPracProSelladoHist implements java.io.Serializable {
	@Id
	@Column(name = "IDSOLICITUDPRACPRO")
	private Integer intIdSolicitud;

	@Column(name = "CADENAORIGINAL")
	private String strCadena;
	
	@Column(name = "MATRICULA")
	private String strMatricula;

	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "APELLIDOPATERNO")
	private String strApellidoPaterno;
	
	@Column(name = "APELLIDOMATERNO")
	private String strApellidoMaterno;
	
	@Column(name = "CURP")
	private String strCurp;
	
	@Column(name = "NBCARRERA")
	private String strNbCarrera;

	public Integer getIntIdSolicitud() {
		return intIdSolicitud;
	}

	public void setIntIdSolicitud(Integer intIdSolicitud) {
		this.intIdSolicitud = intIdSolicitud;
	}

	public String getStrCadena() {
		return strCadena;
	}

	public void setStrCadena(String strCadena) {
		this.strCadena = strCadena;
	}

	public String getStrMatricula() {
		return strMatricula;
	}

	public void setStrMatricula(String strMatricula) {
		this.strMatricula = strMatricula;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApellidoPaterno() {
		return strApellidoPaterno;
	}

	public void setStrApellidoPaterno(String strApellidoPaterno) {
		this.strApellidoPaterno = strApellidoPaterno;
	}

	public String getStrApellidoMaterno() {
		return strApellidoMaterno;
	}

	public void setStrApellidoMaterno(String strApellidoMaterno) {
		this.strApellidoMaterno = strApellidoMaterno;
	}

	public String getStrCurp() {
		return strCurp;
	}

	public void setStrCurp(String strCurp) {
		this.strCurp = strCurp;
	}

	public String getStrNbCarrera() {
		return strNbCarrera;
	}

	public void setStrNbCarrera(String strNbCarrera) {
		this.strNbCarrera = strNbCarrera;
	}

}
