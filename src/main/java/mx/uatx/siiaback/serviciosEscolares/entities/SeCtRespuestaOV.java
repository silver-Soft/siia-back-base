package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
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
@Table(schema = "SERESC", name = "SECTRESPUESTASOV")
public class SeCtRespuestaOV implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idrespuestaov;
	private String dsrespuestaov;
	private boolean clestatus;
	private Date fcaudit;
	private String usuarioaudit;
	private Set<SeAxMapaRespuestaOV> seAxMapaRespuestaOVs = new HashSet<SeAxMapaRespuestaOV>(
			0);
	

	public SeCtRespuestaOV() {
	}

	public SeCtRespuestaOV(int idrespuestaov, String dsrespuestaov,
			boolean clestatus) {
		this.idrespuestaov = idrespuestaov;
		this.dsrespuestaov = dsrespuestaov;
		this.clestatus = clestatus;
	}
	public SeCtRespuestaOV(int idrespuestaov, String dsrespuestaov,
			boolean clestatus, Date fcaudit, String usuarioaudit,
			Set<SeAxMapaRespuestaOV> seAxMapaRespuestaOVs) {
		this.idrespuestaov = idrespuestaov;
		this.dsrespuestaov = dsrespuestaov;
		this.clestatus = clestatus;
		this.fcaudit = fcaudit;
		this.usuarioaudit = usuarioaudit;
		this.seAxMapaRespuestaOVs = seAxMapaRespuestaOVs;
		
	}

	@Id
	@Column(name = "IDRESPUESTAOV", unique = true, nullable = false, precision = 1, scale = 0)
	public int getIdrespuestaov() {
		return idrespuestaov;
	}

	public void setIdrespuestaov(int idrespuestaov) {
		this.idrespuestaov = idrespuestaov;
	}

	@Column(name = "DSRESPUESTAOV", nullable = false, length = 30)
	public String getDsrespuestaov() {
		return this.dsrespuestaov;
	}

	public void setDsrespuestaov(String dsrespuestaov) {
		this.dsrespuestaov = dsrespuestaov;
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
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "seCtRespuestaOV")
	public Set<SeAxMapaRespuestaOV> getSeAxMapaRespuestaOVs() {
		return seAxMapaRespuestaOVs;
	}

	public void setSeAxMapaRespuestaOVs(
			Set<SeAxMapaRespuestaOV> seAxMapaRespuestaOVs) {
		this.seAxMapaRespuestaOVs = seAxMapaRespuestaOVs;
	}



}
