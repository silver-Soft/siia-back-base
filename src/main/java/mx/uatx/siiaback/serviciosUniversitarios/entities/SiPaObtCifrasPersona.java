package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaObtCifrasPersona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8471417882585637797L;
	@Id
	@Column(name = "IDPERSONAREALIZA")
	private Long lngIdPersonaRealiza;
	
	@Column(name = "NOMBRE")
	private String strNbPersona;
	
	@Column(name = "PENDIENTES")
	private Integer intPendientes;
	
	@Column(name = "ATENDIDOS")
	private Integer intAtendidos;
	
	public SiPaObtCifrasPersona(){
		super();
	}

	

	public Long getLngIdPersonaRealiza() {
		return lngIdPersonaRealiza;
	}



	public void setLngIdPersonaRealiza(Long lngIdPersonaRealiza) {
		this.lngIdPersonaRealiza = lngIdPersonaRealiza;
	}



	public String getStrNbPersona() {
		return strNbPersona;
	}

	public void setStrNbPersona(String strNbPersona) {
		this.strNbPersona = strNbPersona;
	}

	public Integer getIntPendientes() {
		return intPendientes;
	}

	public void setIntPendientes(Integer intPendientes) {
		this.intPendientes = intPendientes;
	}

	public Integer getIntAtendidos() {
		return intAtendidos;
	}

	public void setIntAtendidos(Integer intAtendidos) {
		this.intAtendidos = intAtendidos;
	}
	
	
}
