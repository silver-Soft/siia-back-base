package mx.uatx.siiaback.serviciosUniversitarios.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SiPaPeticionesSolicitadas {
	
	
	@Id
	@Column(name = "IDPETICION")
	private Integer intIdPeticion;
	
	@Column(name = "DSPETICION")
	private String strDescripcion;
	
	@Column(name = "FCPETICION")
	private Date fcPeticion;
	
	@Column(name = "FCLIBERACION")
	private Date fcLiberacion;
	
	@Column(name = "DSSTPETICION")
	private String strDesStPeticion;
	
	@Column(name = "DSPRIORIDAD")
	private String strDescPrioridad;
	
	@Column(name = "PERMITEMODIFICAR")
	private Boolean blnPermitirModificar;
	
	@Column(name = "PERMITELIMINAR")
	private Boolean blnPermitirEliminar;
	
	@Column(name = "PERMITEFIRMAR")
	private Boolean blnPermitirFirmar;
	
	@Column(name = "IDPERSONADIRIGIRSECON")
	private Long longIdPersonaDirigirseCon;
	
	@Column(name = "IDPRIORIDAD")
	private Integer intIdPrioridad;
	
	@Column(name = "NBDIRIGIRSECON")
	private String strNombreCompletoDirigirse;

	@Column(name = "IDSTPETICION")
	private Integer intStPeticiones;
	
	@Column(name = "NMTICKET")
	private String strNmTicket;
	
	@Column(name = "IDCATEGORIA")
	private Integer intIdCategoria;
	
	@Column(name = "NMTELEFONO")
	private String strNmTelefono;
	
	@Column(name = "DSCORREO")
	private String strDsCorreo;


	public Integer getIntIdPeticion() {
		return intIdPeticion;
	}

	public void setIntIdPeticion(Integer intIdPeticion) {
		this.intIdPeticion = intIdPeticion;
	}

	public String getStrDescripcion() {
		return strDescripcion;
	}

	public void setStrDescripcion(String strDescripcion) {
		this.strDescripcion = strDescripcion;
	}

	public Date getFcPeticion() {
		return fcPeticion;
	}

	public void setFcPeticion(Date fcPeticion) {
		this.fcPeticion = fcPeticion;
	}

	public Date getFcLiberacion() {
		return fcLiberacion;
	}

	public void setFcLiberacion(Date fcLiberacion) {
		this.fcLiberacion = fcLiberacion;
	}

	

	public String getStrDesStPeticion() {
		return strDesStPeticion;
	}

	public void setStrDesStPeticion(String strDesStPeticion) {
		this.strDesStPeticion = strDesStPeticion;
	}

	public String getStrDescPrioridad() {
		return strDescPrioridad;
	}

	public void setStrDescPrioridad(String strDescPrioridad) {
		this.strDescPrioridad = strDescPrioridad;
	}

	public Boolean getBlnPermitirModificar() {
		return blnPermitirModificar;
	}

	public void setBlnPermitirModificar(Boolean blnPermitirModificar) {
		this.blnPermitirModificar = blnPermitirModificar;
	}

	public Boolean getBlnPermitirEliminar() {
		return blnPermitirEliminar;
	}

	public void setBlnPermitirEliminar(Boolean blnPermitirEliminar) {
		this.blnPermitirEliminar = blnPermitirEliminar;
	}

	public Boolean getBlnPermitirFirmar() {
		return blnPermitirFirmar;
	}

	public void setBlnPermitirFirmar(Boolean blnPermitirFirmar) {
		this.blnPermitirFirmar = blnPermitirFirmar;
	}

	public Long getLongIdPersonaDirigirseCon() {
		return longIdPersonaDirigirseCon;
	}

	public void setLongIdPersonaDirigirseCon(Long longIdPersonaDirigirseCon) {
		this.longIdPersonaDirigirseCon = longIdPersonaDirigirseCon;
	}

	public Integer getIntIdPrioridad() {
		return intIdPrioridad;
	}

	public void setIntIdPrioridad(Integer intIdPrioridad) {
		this.intIdPrioridad = intIdPrioridad;
	}

	public String getStrNombreCompletoDirigirse() {
		return strNombreCompletoDirigirse;
	}

	public void setStrNombreCompletoDirigirse(String strNombreCompletoDirigirse) {
		this.strNombreCompletoDirigirse = strNombreCompletoDirigirse;
	}

	public Integer getIntStPeticiones() {
		return intStPeticiones;
	}

	public void setIntStPeticiones(Integer intStPeticiones) {
		this.intStPeticiones = intStPeticiones;
	}

	public String getStrNmTicket() {
		return strNmTicket;
	}

	public void setStrNmTicket(String strNmTicket) {
		this.strNmTicket = strNmTicket;
	}

	public Integer getIntIdCategoria() {
		return intIdCategoria;
	}

	public void setIntIdCategoria(Integer intIdCategoria) {
		this.intIdCategoria = intIdCategoria;
	}

	public String getStrNmTelefono() {
		return strNmTelefono;
	}

	public void setStrNmTelefono(String strNmTelefono) {
		this.strNmTelefono = strNmTelefono;
	}

	public String getStrDsCorreo() {
		return strDsCorreo;
	}

	public void setStrDsCorreo(String strDsCorreo) {
		this.strDsCorreo = strDsCorreo;
	}
	
	
	

}
