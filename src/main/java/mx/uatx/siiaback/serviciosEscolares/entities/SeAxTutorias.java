
package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "SERESC", name = "SEAXTUTORIAS")
public class SeAxTutorias implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5170149923911805113L;

	private static final String GENID_SEAXTUTORIAS = "GENID_SEAXTUTORIAS";

	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = GENID_SEAXTUTORIAS, sequenceName = "SERESC.IDTUTORIAAX", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GENID_SEAXTUTORIAS)
	@Column(name = "IDTUTORIAAX")
	private Long idtutoriaax;

	@Basic(optional = false)
	@Column(name = "IDTUTORIA")
	private Long idtutoria;

	@Basic(optional = false)
	@Column(name = "IDTUTOR")
	private Long idtutor;

	@Column(name = "FCAUDIT")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fcaudit;

	@Column(name = "USUARIOAUDIT", length = 30)
	private String usuarioaudit;

	@Column(name = "CLESTATUSTUTORIA")
	private Integer clestatustutoria;

	@Column(name = "NMTUTORIA")
	private Integer nmtutoria;

	public SeAxTutorias() {
	}

	public SeAxTutorias(Long idtutoriaax) {
		this.idtutoriaax = idtutoriaax;
	}

	public SeAxTutorias(Long idtutoriaax, Long idtutoria, Long idtutor) {
		this.idtutoriaax = idtutoriaax;
		this.idtutoria = idtutoria;
		this.idtutor = idtutor;
	}

	public Long getIdtutoriaax() {
		return idtutoriaax;
	}

	public void setIdtutoriaax(Long idtutoriaax) {
		this.idtutoriaax = idtutoriaax;
	}

	public Date getFcaudit() {
		return fcaudit;
	}

	public void setFcaudit(Date fcaudit) {
		this.fcaudit = fcaudit;
	}

	public String getUsuarioaudit() {
		return usuarioaudit;
	}

	public void setUsuarioaudit(String usuarioaudit) {
		this.usuarioaudit = usuarioaudit;
	}

	public Long getIdtutoria() {
		return idtutoria;
	}

	public void setIdtutoria(Long idtutoria) {
		this.idtutoria = idtutoria;
	}

	public Long getIdtutor() {
		return idtutor;
	}

	public void setIdtutor(Long idtutor) {
		this.idtutor = idtutor;
	}

	public Integer getClestatustutoria() {
		return clestatustutoria;
	}

	public void setClestatustutoria(Integer clestatustutoria) {
		this.clestatustutoria = clestatustutoria;
	}

	public Integer getNmtutoria() {
		return nmtutoria;
	}

	public void setNmtutoria(Integer nmtutoria) {
		this.nmtutoria = nmtutoria;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idtutoriaax != null ? idtutoriaax.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof SeAxTutorias)) {
			return false;
		}
		SeAxTutorias other = (SeAxTutorias) object;
		if ((this.idtutoriaax == null && other.idtutoriaax != null)
				|| (this.idtutoriaax != null && !this.idtutoriaax.equals(other.idtutoriaax))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "mx.uatx.siia.serviciosEscolares.modelo.Seaxtutorias[ idtutoriaax=" + idtutoriaax + " ]";
	}

}
