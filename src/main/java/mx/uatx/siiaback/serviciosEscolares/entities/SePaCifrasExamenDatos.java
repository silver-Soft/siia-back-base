package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaCifrasExamenDatos {
	
	
	@Id
    @Column(name = "ID")
	private Integer intId;
	
	@Column(name = "BLOQUE")
	private String intBloque;
	
	@Column(name = "GRUPOS")
	private String strGrupos;
	
	@Column(name = "CUANTOS")
	private Integer intCuantos;
	
	@Column(name = "ESTATUSEXAMEN")
	private String strEstatusExamen;
	
	
	

	public String getIntBloque() {
		return intBloque;
	}

	public void setIntBloque(String intBloque) {
		this.intBloque = intBloque;
	}

	public String getStrGrupos() {
		return strGrupos;
	}

	public void setStrGrupos(String strGrupos) {
		this.strGrupos = strGrupos;
	}

	public Integer getIntCuantos() {
		return intCuantos;
	}

	public void setIntCuantos(Integer intCuantos) {
		this.intCuantos = intCuantos;
	}

	public String getStrEstatusExamen() {
		return strEstatusExamen;
	}

	public void setStrEstatusExamen(String strEstatusExamen) {
		this.strEstatusExamen = strEstatusExamen;
	}
	
	
	
	
	

}
