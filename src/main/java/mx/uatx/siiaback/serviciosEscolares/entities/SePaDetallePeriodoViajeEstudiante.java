package mx.uatx.siiaback.serviciosEscolares.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaDetallePeriodoViajeEstudiante {
	
	@Id
    @Column(name = "ID")
	private Integer intId;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcion;
	
	@Column(name = "COLOR")
	private String strColor;
	
	@Column(name = "IDPERIODO")
	private Integer idPeriodo;
	
	public Integer getIntId() {
		return intId;
	}
	public void setIntId(Integer intId) {
		this.intId = intId;
	}
	public String getStrDescripcion() {
		return strDescripcion;
	}
	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}
	public String getStrColor() {
		return strColor;
	}
	public void setStrColor(String strColor) {
		this.strColor = strColor;
	}
	public Integer getIdPeriodo() {
		return idPeriodo;
	}
	public void setIdPeriodo(Integer idPeriodo) {
		this.idPeriodo = idPeriodo;
	}

}
