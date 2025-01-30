package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtEncEgresados {
	
	@Id
	@Column(name = "PROGRAMA")
	private String dsProgramaEducativo;
	
	@Column(name = "PERIODOINGRESO")
	private String periodoIngreso;
	
	@Column(name = "PERIODOEGRESO")
	private String periodoEgreso;
	
	@Column(name = "CONTINGRESO")
	private Integer nmIngreso;
	
	@Column(name = "CONTEGRESO")
	private Integer nmEgreso;
	
	public String getPeriodoIngreso() {
		return periodoIngreso;
	}
	public void setPeriodoIngreso(String periodoIngreso) {
		this.periodoIngreso = periodoIngreso;
	}
	public String getPeriodoEgreso() {
		return periodoEgreso;
	}
	public void setPeriodoEgreso(String periodoEgreso) {
		this.periodoEgreso = periodoEgreso;
	}
	public String getDsProgramaEducativo() {
		return dsProgramaEducativo;
	}
	public void setDsProgramaEducativo(String dsProgramaEducativo) {
		this.dsProgramaEducativo = dsProgramaEducativo;
	}
	public Integer getNmIngreso() {
		return nmIngreso;
	}
	public void setNmIngreso(Integer nmIngreso) {
		this.nmIngreso = nmIngreso;
	}
	public Integer getNmEgreso() {
		return nmEgreso;
	}
	public void setNmEgreso(Integer nmEgreso) {
		this.nmEgreso = nmEgreso;
	}

}
