package mx.uatx.siiaback.serviciosEscolares.entities;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(schema = "SERESC", name = "SECTMAPASOV")
public class SeCtMapaOV implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idmapaov;
	private SeCtAreaEstudioOV seCtAreaEstudioOV;
	private String dsmapaov;

	private Date fcaudit;
	private String usuarioaudit;
	private String dsInterpretacionMapaov;

	private Set<SeAxMapaRespuestaOV> seAxMapaRespuestaOVs = new HashSet<SeAxMapaRespuestaOV>(
			0);

	public SeCtMapaOV() {
	}

	

	@Id
	@Column(name = "IDMAPAOV", unique = true, nullable = false, precision = 2, scale = 0)
	public int getIdmapaov() {
		return this.idmapaov;
	}

	public void setIdmapaov(int idmapaov) {
		this.idmapaov = idmapaov;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDAREAESTUDIOOV")
	public SeCtAreaEstudioOV getSeCtAreaEstudioOV() {
		return seCtAreaEstudioOV;
	}

	public void setSeCtAreaEstudioOV(SeCtAreaEstudioOV seCtAreaEstudioOV) {
		this.seCtAreaEstudioOV = seCtAreaEstudioOV;
	}

	@Column(name = "DSMAPAOV", nullable = false, length = 5)

	public String getDsmapaov() {
		return this.dsmapaov;
	}

	public void setDsmapaov(String dsmapaov) {
		this.dsmapaov = dsmapaov;
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
	
	@Column(name = "DSINTERPRETACIONMAPAOV", nullable = false, length = 1000)
	public String getDsInterpretacionMapaov() {
		return this.dsInterpretacionMapaov;
	}

	public void setDsInterpretacionMapaov(String dsInterpretacionMapaov) {
		this.dsInterpretacionMapaov = dsInterpretacionMapaov;
	}
	
	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "seCtMapaOV")
	public Set<SeAxMapaRespuestaOV> getSeAxMapaRespuestaOVs() {
		return seAxMapaRespuestaOVs;
	}

	public void setSeAxMapaRespuestaOVs(
			Set<SeAxMapaRespuestaOV> seAxMapaRespuestaOVs) {
		this.seAxMapaRespuestaOVs = seAxMapaRespuestaOVs;
	}

}
