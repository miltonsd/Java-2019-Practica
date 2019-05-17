package entidades;

import java.math.BigDecimal;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	private BigDecimal sueldoBase;
	
	public Empleado(String dni, String nombre, String apellido, String email, BigDecimal sueldoBase) {
		this.setDni(dni);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
		this.setSueldoBase(sueldoBase);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(BigDecimal sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public String getDetalle() {
		String det = "DNI: "+this.getDni()+" - "+this.getApellido()+", "+this.getNombre()+" - Sueldo: $ "+this.getSueldo();
		return det;
	}
	
	public BigDecimal getSueldo() {
		return this.getSueldo();
	}
	
}
