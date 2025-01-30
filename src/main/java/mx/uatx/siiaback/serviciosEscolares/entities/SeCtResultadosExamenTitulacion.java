package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(schema = "SERESC", name = "SECTRESULTADOSEXAMENTITULACION")

public class SeCtResultadosExamenTitulacion implements Serializable {
	
    private static final long serialVersionUID = 1L;
    
    public SeCtResultadosExamenTitulacion() {
    }

    public SeCtResultadosExamenTitulacion(int idResultadoExamenTitulacion) {
        this.idResultadoExamenTitulacion = idResultadoExamenTitulacion;
    }

    public SeCtResultadosExamenTitulacion(int idResultadoExamenTitulacion, String dsResultadoExamenTitulacion, String usuarioaudit) {
        this.idResultadoExamenTitulacion = idResultadoExamenTitulacion;
        this.dsResultadoExamenTitulacion = dsResultadoExamenTitulacion;
        this.usuarioaudit = usuarioaudit;
    }
    
    @Id
    @Column(name = "IDRESULTADOEXAMENTITULACION")
    private int idResultadoExamenTitulacion;
    
    @Column(name = "DSRESULTADOEXAMENTITULACION")
    private String dsResultadoExamenTitulacion;
    
    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcaudit;
    
    @Basic(optional = false)
    @Column(name = "USUARIOAUDIT")
    private String usuarioaudit;

    
    public int getIdResultadoExamenTitulacion() {
		return idResultadoExamenTitulacion;
	}

	public void setIdResultadoExamenTitulacion(int idResultadoExamenTitulacion) {
		this.idResultadoExamenTitulacion = idResultadoExamenTitulacion;
	}

    public String getDsResultadoExamenTitulacion() {
		return dsResultadoExamenTitulacion;
	}

	public void setDsResultadoExamenTitulacion(String dsResultadoExamenTitulacion) {
		this.dsResultadoExamenTitulacion = dsResultadoExamenTitulacion;
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
    
}
