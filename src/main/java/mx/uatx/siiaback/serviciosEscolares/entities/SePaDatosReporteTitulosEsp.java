package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDatosReporteTitulosEsp {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "DSPROGRAMAEDUCATIVO")
	private String dsProgramaEducativo;
	
	@Column(name = "DSNIVELEDUCATIVO")
	private String dsNivelEducativo;

	@Column(name = "TOTAL")
	private Integer total;

	@Column(name = "TOTALHOMBRES")
	private Integer totalHombres;

	@Column(name = "TOTALMUJERES")
	private Integer totalMujeres;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDsProgramaEducativo() {
		return dsProgramaEducativo;
	}

	public void setDsProgramaEducativo(String dsProgramaEducativo) {
		this.dsProgramaEducativo = dsProgramaEducativo;
	}

	public String getDsNivelEducativo() {
		return dsNivelEducativo;
	}

	public void setDsNivelEducativo(String dsNivelEducativo) {
		this.dsNivelEducativo = dsNivelEducativo;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTotalHombres() {
		return totalHombres;
	}

	public void setTotalHombres(Integer totalHombres) {
		this.totalHombres = totalHombres;
	}

	public Integer getTotalMujeres() {
		return totalMujeres;
	}

	public void setTotalMujeres(Integer totalMujeres) {
		this.totalMujeres = totalMujeres;
	}

}
