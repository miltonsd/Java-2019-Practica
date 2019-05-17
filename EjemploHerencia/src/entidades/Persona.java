package entidades;

public class Persona{

	private String dni;
	private String nombre;
	private String apellido;

// Constructor para los datos
	public Persona() {
		this.setDni("00000000");
		this.setNombre("Sin");
		this.setApellido("Datos");
	}

	public String getDni() {
		return this.dni;
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

/*
	public String getDetalle() {
//		return this.dni+" - "+apellido+", "+getNombre();
		return this.getDni()+" - "+this.getApellido()+", "+this.getNombre();
	}
*/
	
	
	public String getDetalle(boolean incluirDatosSensibles) {
		String det="";
		if(incluirDatosSensibles) {
			det=det+"DNI: "+this.getDni()+" - ";
		}
		det+=this.getApellido()+", "+this.getNombre();
		return det;
	}
	
	public String getDetalle() {
		return this.getDetalle(true);
	}
	
}
