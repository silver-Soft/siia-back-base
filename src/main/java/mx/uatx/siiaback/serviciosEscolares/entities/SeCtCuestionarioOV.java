package mx.uatx.siiaback.serviciosEscolares.entities;
// Generated 9/03/2010 11:26:21 AM by Hibernate Tools 3.2.2.GA

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(schema = "SERESC", name = "SECTCUESTIONARIOSOV")
public class SeCtCuestionarioOV implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idcuestionarioov;
	private String dscuestionarioov;
	private boolean clestatus;
	private Date fcaudit;
	private String usuarioaudit;
	private List<SeAxSeccionCuestionarioOV> seaxseccionescuestionariosov = new ArrayList<SeAxSeccionCuestionarioOV>();

	public SeCtCuestionarioOV() {
	}

	public SeCtCuestionarioOV(int idcuestionarioov,
			String dscuestionarioov, boolean clestatus) {
		this.idcuestionarioov = idcuestionarioov;
		this.dscuestionarioov = dscuestionarioov;
		this.clestatus = clestatus;
	}
	public SeCtCuestionarioOV(int idcuestionarioov,
			String dscuestionarioov, boolean clestatus, Date fcaudit,
			String usuarioaudit) {
		this.idcuestionarioov = idcuestionarioov;
		this.dscuestionarioov = dscuestionarioov;
		this.clestatus = clestatus;
		this.fcaudit = fcaudit;
		this.usuarioaudit = usuarioaudit;
	}

	@Id
	@Column(name = "IDCUESTIONARIOOV", unique = true)
	public int getIdcuestionarioov() {
		return this.idcuestionarioov;
	}

	public void setIdcuestionarioov(int idcuestionarioov) {
		this.idcuestionarioov = idcuestionarioov;
	}

	@Column(name = "DSCUESTIONARIOOV", nullable = false, length = 200)
	public String getDscuestionarioov() {
		return this.dscuestionarioov;
	}

	public void setDscuestionarioov(String dscuestionarioov) {
		this.dscuestionarioov = dscuestionarioov;
	}

	@Column(name = "CLESTATUS", nullable = false, precision = 1, scale = 0)
	public boolean isClestatus() {
		return this.clestatus;
	}

	public void setClestatus(boolean clestatus) {
		this.clestatus = clestatus;
	}
	@Temporal(TemporalType.DATE)
	@Column(name = "FCAUDIT", length = 7)
	public Date getFcaudit() {
		return this.fcaudit;
	}

	public void setFcaudit(Date fcaudit) {
		this.fcaudit = fcaudit;
	}

	@Column(name = "USUARIOAUDIT", length = 30)
	public String getUsuarioaudit() {
		return this.usuarioaudit;
	}

	public void setUsuarioaudit(String usuarioaudit) {
		this.usuarioaudit = usuarioaudit;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "seCtCuestionarioOV")
	public List<SeAxSeccionCuestionarioOV> getSeaxseccionescuestionariosov() {
		return seaxseccionescuestionariosov;
	}

	public void setSeaxseccionescuestionariosov(
			List<SeAxSeccionCuestionarioOV> seaxseccionescuestionariosov) {
		this.seaxseccionescuestionariosov = seaxseccionescuestionariosov;
	}

}
