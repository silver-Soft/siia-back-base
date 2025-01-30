package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SiPaLeccionesAprendidas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7409165976557375308L;
	@Id
	@Column(name = "IDLECCIONAPRENDIDA")
	private Integer intIdLeccionAprendida;
	
	@Column(name = "DSPROBLEMA")
	private String strDsProblema;
	
	@Column(name = "DSSOLUCION")
	private String strDsSolucion;
	
	@Column(name = "IDMODULO")
	private Integer intIdModulo;
	
	@Column(name = "IDTIPOLECCION")
	private Integer intIdTipoLeccion;
	
	@Column(name = "INTERESADOS")
	private String strInteresados;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcion;
	
	@Column(name = "DSPROCESO")
	private String strDsProceso;

	public SiPaLeccionesAprendidas(){
		super();
	}
	
	public Integer getIntIdLeccionAprendida() {
		return intIdLeccionAprendida;
	}

	public void setIntIdLeccionAprendida(Integer intIdLeccionAprendida) {
		this.intIdLeccionAprendida = intIdLeccionAprendida;
	}

	public String getStrDsProblema() {
		return strDsProblema;
	}

	public void setStrDsProblema(String strDsProblema) {
		this.strDsProblema = strDsProblema;
	}

	public String getStrDsSolucion() {
		return strDsSolucion;
	}

	public void setStrDsSolucion(String strDsSolucion) {
		this.strDsSolucion = strDsSolucion;
	}

	public Integer getIntIdModulo() {
		return intIdModulo;
	}

	public void setIntIdModulo(Integer intIdModulo) {
		this.intIdModulo = intIdModulo;
	}

	public Integer getIntIdTipoLeccion() {
		return intIdTipoLeccion;
	}

	public void setIntIdTipoLeccion(Integer intIdTipoLeccion) {
		this.intIdTipoLeccion = intIdTipoLeccion;
	}

	public String getStrInteresados() {
		return strInteresados;
	}

	public void setStrInteresados(String strInteresados) {
		this.strInteresados = strInteresados;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public String getStrDsProceso() {
		return strDsProceso;
	}

	public void setStrDsProceso(String strDsProceso) {
		this.strDsProceso = strDsProceso;
	}
		
	
}
