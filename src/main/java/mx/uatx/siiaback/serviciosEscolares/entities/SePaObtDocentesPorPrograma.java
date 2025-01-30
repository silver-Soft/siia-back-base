package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDocentesPorPrograma implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5930345693609549652L;
	@Id
	@Column(name = "IDPLANTILLAEMPLEADO")
	private Long lngIdPlantillaEmpleado;

	@Column(name = "IDDOCENTEPROGRAMA")
	private Long lngIdDocentePrograma;
	
	@Column(name = "IDHISTORIALLABORAL")
	private Long lngIdHistorialLoboral;
	
	@Column(name = "NBPERSONA")
	private String strNbPersona;
	
	@Column(name = "APPATERNO")
	private String strApPaterno;
	
	@Column(name = "APMATERNO")
	private String strApMaterno;
	
	@Column(name = "NMEMPLEADO")
	private String strNmEmpleado;
	
	public SePaObtDocentesPorPrograma() {
		super();
	}

	public Long getLngIdPlantillaEmpleado() {
		return lngIdPlantillaEmpleado;
	}

	public void setLngIdPlantillaEmpleado(Long lngIdPlantillaEmpleado) {
		this.lngIdPlantillaEmpleado = lngIdPlantillaEmpleado;
	}

	public Long getLngIdDocentePrograma() {
		return lngIdDocentePrograma;
	}

	public void setLngIdDocentePrograma(Long lngIdDocentePrograma) {
		this.lngIdDocentePrograma = lngIdDocentePrograma;
	}

	public Long getLngIdHistorialLoboral() {
		return lngIdHistorialLoboral;
	}

	public void setLngIdHistorialLoboral(Long lngIdHistorialLoboral) {
		this.lngIdHistorialLoboral = lngIdHistorialLoboral;
	}

	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public String getStrApPaterno() {
		return strApPaterno;
	}

	public void setStrApPaterno(String strApPaterno) {
		this.strApPaterno = strApPaterno;
	}

	public String getStrApMaterno() {
		return strApMaterno;
	}

	public void setStrApMaterno(String strApMaterno) {
		this.strApMaterno = strApMaterno;
	}

	public String getStrNmEmpleado() {
		return strNmEmpleado;
	}

	public void setStrNmEmpleado(String strNmEmpleado) {
		this.strNmEmpleado = strNmEmpleado;
	}

	
}
