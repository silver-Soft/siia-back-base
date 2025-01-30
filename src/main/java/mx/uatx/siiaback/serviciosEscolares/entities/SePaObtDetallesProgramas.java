package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDetallesProgramas {
	
	@Id
	@Column(name = "iddetalleprograma")
	private Long idDetallePrograma;
	
	@Column(name = "CLNIVELEDUCATIVO")
	private Integer clNivelEducativo;
	
	@Column(name = "DSNIVELEDUCATIVO")
	private String dsNivelEducativo;
		
	@Column(name = "PERFILES")
	private byte[] perfiles;

	@Column(name = "CAMPODESARROLLO")
	private byte[] campoDesarrollo;

	@Column(name = "REQUISITOS")
	private byte[] requsitos;

	@Column(name = "RESENIA")
	private byte[] resenia;
	
	@Column(name = "PERMITEMODIFICAR")
	private Boolean permiteModificar;
	
	@Column(name = "PERMITEELIMINAR")
	private Boolean permiteEliminar;

	public Long getIdDetallePrograma() {
		return idDetallePrograma;
	}

	public void setIdDetallePrograma(Long idDetallePrograma) {
		this.idDetallePrograma = idDetallePrograma;
	}

	public Integer getClNivelEducativo() {
		return clNivelEducativo;
	}

	public void setClNivelEducativo(Integer clNivelEducativo) {
		this.clNivelEducativo = clNivelEducativo;
	}

	public String getDsNivelEducativo() {
		return dsNivelEducativo;
	}

	public void setDsNivelEducativo(String dsNivelEducativo) {
		this.dsNivelEducativo = dsNivelEducativo;
	}

	public byte[] getPerfiles() {
		return perfiles;
	}

	public void setPerfiles(byte[] perfiles) {
		this.perfiles = perfiles;
	}

	public byte[] getCampoDesarrollo() {
		return campoDesarrollo;
	}

	public void setCampoDesarrollo(byte[] campoDesarrollo) {
		this.campoDesarrollo = campoDesarrollo;
	}

	public byte[] getRequsitos() {
		return requsitos;
	}

	public void setRequsitos(byte[] requsitos) {
		this.requsitos = requsitos;
	}

	public byte[] getResenia() {
		return resenia;
	}

	public void setResenia(byte[] resenia) {
		this.resenia = resenia;
	}

	public Boolean getPermiteModificar() {
		return permiteModificar;
	}

	public void setPermiteModificar(Boolean permiteModificar) {
		this.permiteModificar = permiteModificar;
	}

	public Boolean getPermiteEliminar() {
		return permiteEliminar;
	}

	public void setPermiteEliminar(Boolean permiteEliminar) {
		this.permiteEliminar = permiteEliminar;
	}
}
