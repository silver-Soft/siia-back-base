package mx.uatx.siiaback.serviciosEscolares.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "SERESC", name="SECTESCUELASPROCEDENCIA")
public class SeCtEscuelasProcedencia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "IDESCUELAPROCEDENCIA", sequenceName = "SERESC.IDESCUELAPROCEDENCIA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDESCUELAPROCEDENCIA")	
    @Column(name = "IDESCUELAPROCEDENCIA")
    private Integer intIdEscuelaProcedencia;

    @Column(name = "NBESCUELA")
    private String strNbEscuela;

    @Column(name = "NBLOCALIDAD")
    private String strNbLocalidad;

    @Column(name = "IDMUNICIPIO")
    private Long LongIdMunicipio;

    @Column(name = "CLREGIMEN")
    private Integer intClRegimen;

    @Column(name = "FCAUDIT")
    private Date fcAudit;
    
    @Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

	

	public Integer getIntIdEscuelaProcedencia() {
		return intIdEscuelaProcedencia;
	}

	public void setIntIdEscuelaProcedencia(Integer intIdEscuelaProcedencia) {
		this.intIdEscuelaProcedencia = intIdEscuelaProcedencia;
	}

	public String getStrNbEscuela() {
		return strNbEscuela;
	}

	public void setStrNbEscuela(String strNbEscuela) {
		this.strNbEscuela = strNbEscuela;
	}

	public String getStrNbLocalidad() {
		return strNbLocalidad;
	}

	public void setStrNbLocalidad(String strNbLocalidad) {
		this.strNbLocalidad = strNbLocalidad;
	}

	

	public Long getLongIdMunicipio() {
		return LongIdMunicipio;
	}

	public void setLongIdMunicipio(Long longIdMunicipio) {
		LongIdMunicipio = longIdMunicipio;
	}

	public Integer getIntClRegimen() {
		return intClRegimen;
	}

	public void setIntClRegimen(Integer intClRegimen) {
		this.intClRegimen = intClRegimen;
	}

	public Date getFcAudit() {
		return fcAudit;
	}

	public void setFcAudit(Date fcAudit) {
		this.fcAudit = fcAudit;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}

		
}