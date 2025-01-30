package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaDtSeguimientoQueja implements Serializable {
	
	@Id
	@Column(name = "IDSEGUIMIENTOQUEJA")
	private Long longIdSeguimientoQueja;
	
	@Column(name = "IDQUEJADENUNCIA")
	private Long lngIdQuejaDenuncia;
	
	@Column(name = "FCREGISTRO")
	private Date fcRegistro;
	
	@Column(name = "DSSEGUIMIENTO")
	private String strDsSeguimiento;

	public Long getLongIdSeguimientoQueja() {
		return longIdSeguimientoQueja;
	}

	public void setLongIdSeguimientoQueja(Long longIdSeguimientoQueja) {
		this.longIdSeguimientoQueja = longIdSeguimientoQueja;
	}

	public Long getLngIdQuejaDenuncia() {
		return lngIdQuejaDenuncia;
	}

	public void setLngIdQuejaDenuncia(Long lngIdQuejaDenuncia) {
		this.lngIdQuejaDenuncia = lngIdQuejaDenuncia;
	}

	public Date getFcRegistro() {
		return fcRegistro;
	}

	public void setFcRegistro(Date fcRegistro) {
		this.fcRegistro = fcRegistro;
	}

	public String getStrDsSeguimiento() {
		return strDsSeguimiento;
	}

	public void setStrDsSeguimiento(String strDsSeguimiento) {
		this.strDsSeguimiento = strDsSeguimiento;
	}
	

}
