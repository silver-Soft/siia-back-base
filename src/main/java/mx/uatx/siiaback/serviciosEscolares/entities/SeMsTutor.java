package mx.uatx.siiaback.serviciosEscolares.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SERESC", name = "SEMSTUTORES")	
public class SeMsTutor {
	
	@Id
	@Column(name = "IDTUTOR", unique = true, nullable = false, precision = 9, scale = 0)
	@SequenceGenerator(name = "generadorSeq", sequenceName = "SERESC.IDTUTOR", allocationSize=1) 
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="generadorSeq")
	private Integer idTutor;
	
	@Column(name = "IDHRTUTOR")
	private Integer intidHrTutor;
	
	@Column(name = "IDHISTORIALACADEMICO")
	private Integer idHistorialAcademico;
	
	@Column(name = "CLESTATUS")
	private Integer intClEstatus;
	
	@Column(name = "FCINICIO")
	private Date fcinicio;
	
	@Column(name = "FCFIN")
	private Date fcfin;
	
	@Column(name = "DSOBJETIVO")
	private String dsobjetivo;
	
	@Column(name = "DSCONCLUSION")
	private String dsconclusion;
	
	@Column(name = "IDPERIODO")
	private String strIdPeriodo;
	
	@Column(name = "IDPLANTILLAEMPLEADO")
	private Integer intDtPlantillaEmpleado;
	
	@Column(name = "FCAUDIT")
	private Date fcaudit;
	
	@Column(name = "USUARIOAUDIT")
	private String usuarioaudit;
	
	
	
	
	public SeMsTutor() {
		super();
	}

	public Integer getIdTutor() {
		return idTutor;
	}

	public void setIdTutor(Integer idTutor) {
		this.idTutor = idTutor;
	}

	public Integer getIntidHrTutor() {
		return intidHrTutor;
	}
	
	public void setIntidHrTutor(Integer intidHrTutor) {
		this.intidHrTutor = intidHrTutor;
	}
	
	
	
	public Integer getIdHistorialAcademico() {
		return idHistorialAcademico;
	}

	public void setIdHistorialAcademico(Integer idHistorialAcademico) {
		this.idHistorialAcademico = idHistorialAcademico;
	}

	public Integer getIntClEstatus() {
		return intClEstatus;
	}
	
	public void setIntClEstatus(Integer intClEstatus) {
		this.intClEstatus = intClEstatus;
	}
	
	public Date getFcinicio() {
		return fcinicio;
	}
	
	public void setFcinicio(Date fcinicio) {
		this.fcinicio = fcinicio;
	}
	
	public Date getFcfin() {
		return fcfin;
	}
	
	public void setFcfin(Date fcfin) {
		this.fcfin = fcfin;
	}
	
	public String getDsobjetivo() {
		return dsobjetivo;
	}
	
	public void setDsobjetivo(String dsobjetivo) {
		this.dsobjetivo = dsobjetivo;
	}
	
	public String getDsconclusion() {
		return dsconclusion;
	}
	
	public void setDsconclusion(String dsconclusion) {
		this.dsconclusion = dsconclusion;
	}
	
	public String getStrIdPeriodo() {
		return strIdPeriodo;
	}
	
	public void setStrIdPeriodo(String strIdPeriodo) {
		this.strIdPeriodo = strIdPeriodo;
	}
	
	public Integer getIntDtPlantillaEmpleado() {
		return intDtPlantillaEmpleado;
	}
	
	public void setIntDtPlantillaEmpleado(Integer intDtPlantillaEmpleado) {
		this.intDtPlantillaEmpleado = intDtPlantillaEmpleado;
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
