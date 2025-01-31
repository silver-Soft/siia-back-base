package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class SePaProgramaEducativo implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 9029826307194139753L;

	@EmbeddedId
	private SePaProgramaEducativoID id;

	public SePaProgramaEducativo() {
		super();
	}

	public SePaProgramaEducativoID getId() {
		return id;
	}

	public void setId(SePaProgramaEducativoID id) {
		this.id = id;
	}
}
