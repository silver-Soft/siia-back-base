package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SePaObtResEncTit54 {
	
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

	@Column(name = "PREG3845")
	private String preg3845;
	
	@Column(name = "PREG3846")
	private String preg3846;

	@Column(name = "PREG3847")
	private String preg3847;

	@Column(name = "PREG3848")
	private String preg3848;

	@Column(name = "PREG3849")
	private String preg3849;

	@Column(name = "PREG3850")
	private String preg3850;

	@Column(name = "PREG3851")
	private String preg3851;

	@Column(name = "PREG3852")
	private String preg3852;
	
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
	public String getPreg3845() {
		return preg3845;
	}
	public void setPreg3845(String preg3845) {
		this.preg3845 = preg3845;
	}
	public String getPreg3846() {
		return preg3846;
	}
	public void setPreg3846(String preg3846) {
		this.preg3846 = preg3846;
	}
	public String getPreg3847() {
		return preg3847;
	}
	public void setPreg3847(String preg3847) {
		this.preg3847 = preg3847;
	}
	public String getPreg3848() {
		return preg3848;
	}
	public void setPreg3848(String preg3848) {
		this.preg3848 = preg3848;
	}
	public String getPreg3849() {
		return preg3849;
	}
	public void setPreg3849(String preg3849) {
		this.preg3849 = preg3849;
	}
	public String getPreg3850() {
		return preg3850;
	}
	public void setPreg3850(String preg3850) {
		this.preg3850 = preg3850;
	}
	public String getPreg3851() {
		return preg3851;
	}
	public void setPreg3851(String preg3851) {
		this.preg3851 = preg3851;
	}
	public String getPreg3852() {
		return preg3852;
	}
	public void setPreg3852(String preg3852) {
		this.preg3852 = preg3852;
	}
	
}
