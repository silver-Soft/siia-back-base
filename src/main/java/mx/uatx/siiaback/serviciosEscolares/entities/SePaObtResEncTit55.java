package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtResEncTit55 {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "FCNACIMIENTO")
	private Date fcNacimiento;

	@Column(name = "DSGENERO")
	private String dsGenero;

	@Column(name = "PROGRAMA")
	private String programa;

	@Column(name = "FACULTAD")
	private String facultad;

	@Column(name = "DIVISION")
	private String division;
	
	@Column(name = "PREG3853")
	private String preg3853;

	@Column(name = "PREG3854")
	private String preg3854;

	@Column(name = "PREG3855")
	private String preg3855;

	@Column(name = "PREG3856")
	private String preg3856;

	@Column(name = "PREG3857")
	private String preg3857;

	@Column(name = "PREG3858")
	private String preg3858;

	@Column(name = "PREG3859")
	private String preg3859;

	@Column(name = "PREG3860")
	private String preg3860;

	@Column(name = "PREG3861")
	private String preg3861;

	@Column(name = "PREG3862")
	private String preg3862;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFcNacimiento() {
		return fcNacimiento;
	}

	public void setFcNacimiento(Date fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
	}

	public String getDsGenero() {
		return dsGenero;
	}

	public void setDsGenero(String dsGenero) {
		this.dsGenero = dsGenero;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getPreg3853() {
		return preg3853;
	}

	public void setPreg3853(String preg3853) {
		this.preg3853 = preg3853;
	}

	public String getPreg3854() {
		return preg3854;
	}

	public void setPreg3854(String preg3854) {
		this.preg3854 = preg3854;
	}

	public String getPreg3855() {
		return preg3855;
	}

	public void setPreg3855(String preg3855) {
		this.preg3855 = preg3855;
	}

	public String getPreg3856() {
		return preg3856;
	}

	public void setPreg3856(String preg3856) {
		this.preg3856 = preg3856;
	}

	public String getPreg3857() {
		return preg3857;
	}

	public void setPreg3857(String preg3857) {
		this.preg3857 = preg3857;
	}

	public String getPreg3858() {
		return preg3858;
	}

	public void setPreg3858(String preg3858) {
		this.preg3858 = preg3858;
	}

	public String getPreg3859() {
		return preg3859;
	}

	public void setPreg3859(String preg3859) {
		this.preg3859 = preg3859;
	}

	public String getPreg3860() {
		return preg3860;
	}

	public void setPreg3860(String preg3860) {
		this.preg3860 = preg3860;
	}

	public String getPreg3861() {
		return preg3861;
	}

	public void setPreg3861(String preg3861) {
		this.preg3861 = preg3861;
	}

	public String getPreg3862() {
		return preg3862;
	}

	public void setPreg3862(String preg3862) {
		this.preg3862 = preg3862;
	}
	

}
