package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtDtLoteFotoEstudio {
	
	@Id
	@Column(name = "IDTITULO")
	private Long idTitulo;
	
	@Column(name = "NUMEROTITULO")
	private Long nmTitulo;
	
	@Column(name = "FOTO")
	private byte[] foto;
	
	public Long getIdTitulo() {
		return idTitulo;
	}
	public void setIdTitulo(Long idTitulo) {
		this.idTitulo = idTitulo;
	}
	public Long getNmTitulo() {
		return nmTitulo;
	}
	public void setNmTitulo(Long nmTitulo) {
		this.nmTitulo = nmTitulo;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

}
