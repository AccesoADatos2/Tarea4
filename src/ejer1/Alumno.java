package ejer1;


import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/* @author Ainhoa
 * @version 1.0.0
 */

/**
 * Informacion de un alumno como
 * NIA, nombre, apellidos,género, fecha de nacimiento ciclo, curso y grupo.
 */
public class Alumno {

	private Integer nia;
	private String nombre;
	private String apellidos;
	private Character genero;
	private Date fechaNacimiento;
	private String ciclo;
	private String curso;
	private String grupo;

	// contructores

	public Alumno() {

	}
	public Alumno(Integer nia, String nombre, String apellidos, Character genero, Date fechaNacimiento, String ciclo,
			String curso, String grupo) {

		this.nia = nia;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
		this.ciclo = ciclo;
		this.curso = curso;
		this.grupo = grupo;
	}

	// Getters y Setters
	public Integer getNia() {
		return nia;
	}
	public void setNia(int nia) {
		this.nia = nia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Character getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCiclo() {
		return ciclo;
	}
	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	// metodos
	
	/**
	 * Representación legible del alumno.
	 * @return cadena con los campos principales del alumno
	 */
	@Override
	public String toString() {
		return "Alumno: nia=" + nia + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero=" + genero
				+ ", fechaNacimiento=" + fechaNacimiento + ", ciclo=" + ciclo + ", curso=" + curso + ", grupo=" + grupo
				+ "/n";
	}

}
