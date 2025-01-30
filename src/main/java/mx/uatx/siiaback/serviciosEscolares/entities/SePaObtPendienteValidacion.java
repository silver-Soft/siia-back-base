package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class SePaObtPendienteValidacion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2161373733176806367L;
	@Id
	@Column(name = "IDALUMNOCARGA")
	private Long lngIdAlumnoCarga;

	@Column(name = "IDOFERTA")
	private Long lngIdOferta;
	
	@Column(name = "MATRICULA")
	private String strMatricula;
	
	@Column(name = "NOMBRE")
	private String strNombre;
	
	@Column(name = "MATERIA")
	private String strMateria;
	
	@Column(name = "PROGRAMAEDUCATIVO")
	private String strProgramaEducativo;
	
	@Column(name = "ESTATUS")
	private String strEstatus;
	
	public SePaObtPendienteValidacion() {
		super();
	}

	public Long getLngIdAlumnoCarga() {
		return lngIdAlumnoCarga;
	}

	public void setLngIdAlumnoCarga(Long lngIdAlumnoCarga) {
		this.lngIdAlumnoCarga = lngIdAlumnoCarga;
	}

	public Long getLngIdOferta() {
		return lngIdOferta;
	}

	public void setLngIdOferta(Long lngIdOferta) {
		this.lngIdOferta = lngIdOferta;
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

	public String getStrMateria() {
		return strMateria;
	}

	public void setStrMateria(String strMateria) {
		this.strMateria = strMateria;
	}

	public String getStrProgramaEducativo() {
		return strProgramaEducativo;
	}

	public void setStrProgramaEducativo(String strProgramaEducativo) {
		this.strProgramaEducativo = strProgramaEducativo;
	}

	public String getStrEstatus() {
		return strEstatus;
	}

	public void setStrEstatus(String strEstatus) {
		this.strEstatus = strEstatus;
	}
	
	
}
