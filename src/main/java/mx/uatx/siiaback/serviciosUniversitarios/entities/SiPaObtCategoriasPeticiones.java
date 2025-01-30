package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaObtCategoriasPeticiones implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3495372551431284987L;
	
	@Id
	@Column(name = "IDCATEGORIAPROBLEMA")
	private Integer intIdCategoriaProblema;
	
	@Column(name = "DSCATEGORIA")
	private String strDsCategoria;
	
	public SiPaObtCategoriasPeticiones() {
		super();
	}

	public Integer getIntIdCategoriaProblema() {
		return intIdCategoriaProblema;
	}

	public void setIntIdCategoriaProblema(Integer intIdCategoriaProblema) {
		this.intIdCategoriaProblema = intIdCategoriaProblema;
	}

	public String getStrDsCategoria() {
		return strDsCategoria;
	}

	public void setStrDsCategoria(String strDsCategoria) {
		this.strDsCategoria = strDsCategoria;
	}

}
