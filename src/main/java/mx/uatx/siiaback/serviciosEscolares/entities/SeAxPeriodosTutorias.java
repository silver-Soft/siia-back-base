

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
@Table(schema = "SERESC", name = "SEAXPERIODOSTUTORIAS")
public class SeAxPeriodosTutorias implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "GENIDPERIODOTUTORIA", sequenceName = "SERESC.IDPERIODOTUTORIA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GENIDPERIODOTUTORIA")
    @Column(name = "IDPERIODOTUTORIA")
    private Long lngIdPeriodoTutoria;
    
    @Column(name = "FCINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcInicio;
    
    @Column(name = "FCFIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcFin;
    
    @Column(name = "NMTUTORIA")
    private Integer intNmTutoria;
    
    @Column(name = "IDPERIODO", length = 20)
    private String strIdPeriodo;
    
    @Column(name = "USUARIOAUDIT", length = 30)
    private String strUsuarioAudit;
    
    @Column(name = "FCAUDIT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fcAudit;
    
    @Column(name = "IDAREACAMPUS")
    private Integer intIdAreaCampus;
    
    @Column(name = "IDPROGRAMACAMPUS")
    private Integer intIdProgramaCampus;
    
    @Column(name = "PERMISO")
    private String strPermiso;

    public SeAxPeriodosTutorias() {
    }

    public Long getLngIdPeriodoTutoria() {
        return lngIdPeriodoTutoria;
    }

    public void setLngIdPeriodoTutoria(Long lngIdPeriodoTutoria) {
        this.lngIdPeriodoTutoria = lngIdPeriodoTutoria;
    }

    public Date getFcInicio() {
        return fcInicio;
    }

    public void setFcInicio(Date fcInicio) {
        this.fcInicio = fcInicio;
    }

    public Date getFcFin() {
        return fcFin;
    }

    public void setFcFin(Date fcFin) {
        this.fcFin = fcFin;
    }

    public Integer getIntNmTutoria() {
        return intNmTutoria;
    }

    public void setIntNmTutoria(Integer intNmTutoria) {
        this.intNmTutoria = intNmTutoria;
    }

    public String getStrIdPeriodo() {
        return strIdPeriodo;
    }

    public void setStrIdPeriodo(String strIdPeriodo) {
        this.strIdPeriodo = strIdPeriodo;
    }

    public String getStrUsuarioAudit() {
        return strUsuarioAudit;
    }

    public void setStrUsuarioAudit(String strUsuarioAudit) {
        this.strUsuarioAudit = strUsuarioAudit;
    }

    public Date getFcAudit() {
        return fcAudit;
    }

    public void setFcAudit(Date fcAudit) {
        this.fcAudit = fcAudit;
    }

	public Integer getIntIdAreaCampus() {
		return intIdAreaCampus;
	}

	public void setIntIdAreaCampus(Integer intIdAreaCampus) {
		this.intIdAreaCampus = intIdAreaCampus;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrPermiso() {
		return strPermiso;
	}

	public void setStrPermiso(String strPermiso) {
		this.strPermiso = strPermiso;
	}

	    

}
