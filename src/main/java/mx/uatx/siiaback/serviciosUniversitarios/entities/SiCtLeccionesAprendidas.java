package mx.uatx.siiaback.serviciosUniversitarios.entities;

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
import javax.validation.constraints.NotNull;

@Entity
@Table(schema = "SIIUAT", name="SIMSLECCIONESAPRENDIDAS")
public class SiCtLeccionesAprendidas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Basic(optional = false)
	@SequenceGenerator(name = "IDLECCIONAPRENDIDA", sequenceName = "SIIUAT.IDLECCIONAPRENDIDA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IDLECCIONAPRENDIDA")
    @NotNull
    
    @Column(name = "IDLECCIONAPRENDIDA")
	private Integer intIdLeccionAprendida;
	
	@Column(name = "DSPROBLEMA")
	private String strDsProblema;
	
	@Column(name = "DSSOLUCION")
	private String strDsSolucion;
	
	@Column(name = "IDMODULO")
	private Integer intIdModulo;
	
	@Column(name = "IDTIPOLECCION")
	private Integer intIdTipoLeccion;
	
	@Column(name = "INTERESADOS")
	private String strInteresados;
	
	@Column(name = "FCREGISTRO")
	private Date fcRegistro;
	
	@Column(name = "USUARIOCREACION")
	private String strUsuarioCreacion;
	
	@Column(name = "USUARIOAUDIT")
    private String strUsuarioAudit;

	public Integer getIntIdLeccionAprendida() {
		return intIdLeccionAprendida;
	}

	public void setIntIdLeccionAprendida(Integer intIdLeccionAprendida) {
		this.intIdLeccionAprendida = intIdLeccionAprendida;
	}

	public String getStrDsProblema() {
		return strDsProblema;
	}

	public void setStrDsProblema(String strDsProblema) {
		this.strDsProblema = strDsProblema;
	}

	public String getStrDsSolucion() {
		return strDsSolucion;
	}

	public void setStrDsSolucion(String strDsSolucion) {
		this.strDsSolucion = strDsSolucion;
	}

	public Integer getIntIdModulo() {
		return intIdModulo;
	}

	public void setIntIdModulo(Integer intIdModulo) {
		this.intIdModulo = intIdModulo;
	}

	public Integer getIntIdTipoLeccion() {
		return intIdTipoLeccion;
	}

	public void setIntIdTipoLeccion(Integer intIdTipoLeccion) {
		this.intIdTipoLeccion = intIdTipoLeccion;
	}

	public String getStrInteresados() {
		return strInteresados;
	}

	public void setStrInteresados(String strInteresados) {
		this.strInteresados = strInteresados;
	}

	public Date getFcRegistro() {
		return fcRegistro;
	}

	public void setFcRegistro(Date fcRegistro) {
		this.fcRegistro = fcRegistro;
	}

	public String getStrUsuarioCreacion() {
		return strUsuarioCreacion;
	}

	public void setStrUsuarioCreacion(String strUsuarioCreacion) {
		this.strUsuarioCreacion = strUsuarioCreacion;
	}

	public String getStrUsuarioAudit() {
		return strUsuarioAudit;
	}

	public void setStrUsuarioAudit(String strUsuarioAudit) {
		this.strUsuarioAudit = strUsuarioAudit;
	}
	
	
}
