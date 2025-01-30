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

@Entity
@Table(schema = "SERESC", name="SEAXGRUPOSPROGRAMAS")
public class SeCtGruposProgramas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @SequenceGenerator(name = "IDGRUPOPROGRAMA", sequenceName = "SERESC.IDGRUPOPROGRAMA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDGRUPOPROGRAMA")	
    @Column(name = "IDGRUPOPROGRAMA")
    private Integer intIdGrupoPrograma;

    @Column(name = "IDPROGRAMACAMPUS")
    private Integer intIdProgramaCampus;

    @Column(name = "DSGRUPOPROGRAMA")
    private String strDsGrupoPrograma;	

    @Column(name = "FCAUDIT")
    private Date fcAudit;
    
    @Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

	public Integer getIntIdGrupoPrograma() {
		return intIdGrupoPrograma;
	}

	public void setIntIdGrupoPrograma(Integer intIdGrupoPrograma) {
		this.intIdGrupoPrograma = intIdGrupoPrograma;
	}

	public Integer getIntIdProgramaCampus() {
		return intIdProgramaCampus;
	}

	public void setIntIdProgramaCampus(Integer intIdProgramaCampus) {
		this.intIdProgramaCampus = intIdProgramaCampus;
	}

	public String getStrDsGrupoPrograma() {
		return strDsGrupoPrograma;
	}

	public void setStrDsGrupoPrograma(String strDsGrupoPrograma) {
		this.strDsGrupoPrograma = strDsGrupoPrograma;
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
