package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaTipoReporteTutorias implements Serializable{
	
	@Id
	@Column(name = "ID")
	private String idTipoReporte;
	
	@Column(name = "DESCRIPCION")
	private String strDescripcon;

	public String getIdTipoReporte() {
		return idTipoReporte;
	}

	public void setIdTipoReporte(String idTipoReporte) {
		this.idTipoReporte = idTipoReporte;
	}

	public String getStrDescripcon() {
		return strDescripcon;
	}

	public void setStrDescripcon(String strDescripcon) {
		this.strDescripcon = strDescripcon;
	}
	
	
	
	

}
