package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SePaObtSeccionesFaltantes implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6595920977866013513L;

	
	public SePaObtSeccionesFaltantes() {
	}
	
	public SePaObtSeccionesFaltantes(Integer idseccionov, String dsseccionov,
			Integer clestatus, Integer seCtCuestionarioOV, Integer nmorden) {
		this.idseccionov = idseccionov;
		this.dsseccionov = dsseccionov;
		this.clestatus = clestatus;
		this.seCtCuestionarioOV = seCtCuestionarioOV;
		this.nmorden = nmorden;
	}

	public Integer getIdseccionov() {
		return idseccionov;
	}

	public void setIdseccionov(Integer idseccionov) {
		this.idseccionov = idseccionov;
	}

	public String getDsseccionov() {
		return dsseccionov;
	}

	public void setDsseccionov(String dsseccionov) {
		this.dsseccionov = dsseccionov;
	}

	public Integer getClestatus() {
		return clestatus;
	}

	public void setClestatus(Integer clestatus) {
		this.clestatus = clestatus;
	}

	public Integer getSeCtCuestionarioOV() {
		return seCtCuestionarioOV;
	}

	public void setSeCtCuestionarioOV(Integer seCtCuestionarioOV) {
		this.seCtCuestionarioOV = seCtCuestionarioOV;
	}

	public Integer getNmorden() {
		return nmorden;
	}

	public void setNmorden(Integer nmorden) {
		this.nmorden = nmorden;
	}

	@Column(name = "IDCUESTIONARIO", nullable = false)
	private Integer seCtCuestionarioOV;
	@Id
	@Column(name = "IDSECCIONOV", unique = true, nullable = false, precision = 3, scale = 0)
	private Integer idseccionov;

	@Column(name = "DSSECCIONOV", nullable = false, length = 50)
	private String dsseccionov;

	@Column(name = "CLESTATUS", nullable = false, precision = 1, scale = 0)
	private Integer clestatus;
	
	@Column(name = "NMORDEN", nullable = false, precision = 3, scale = 0)
	private Integer nmorden;
}
