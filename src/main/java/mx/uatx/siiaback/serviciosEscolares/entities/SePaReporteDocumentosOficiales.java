package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaReporteDocumentosOficiales {
	
	@Id
	@Column(name="ID")
	private Integer id;

	@Column(name="CLNIVELEDUCATIVO")
	private Integer clNivel;

	@Column(name="IDDOCUMENTO")
	private Integer idDocumento;

	@Column(name="NIVEL")
	private String strNivel;

	@Column(name="DOCUMENTO")
	private String strDocumento;

	@Column(name="CANTIDAD")
	private Integer intCantidad;

	
	
	
	
	
	public SePaReporteDocumentosOficiales() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getClNivel() {
		return clNivel;
	}

	public void setClNivel(Integer clNivel) {
		this.clNivel = clNivel;
	}

	public Integer getIdDocumento() {
		return idDocumento;
	}

	public void setIdDocumento(Integer idDocumento) {
		this.idDocumento = idDocumento;
	}

	public String getStrNivel() {
		return strNivel;
	}

	public void setStrNivel(String strNivel) {
		this.strNivel = strNivel;
	}

	public String getStrDocumento() {
		return strDocumento;
	}

	public void setStrDocumento(String strDocumento) {
		this.strDocumento = strDocumento;
	}

	public Integer getIntCantidad() {
		return intCantidad;
	}

	public void setIntCantidad(Integer intCantidad) {
		this.intCantidad = intCantidad;
	}
	
	
	

}
