package AgendaConSQL;

public class Persona {

	String nombre;
	int celular;
	String direccion;
	
	public Persona(String nombre, int celular, String direccion) {
		this.nombre = nombre;
		this.celular = celular;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", celular=" + celular + ", direccion=" + direccion + "]";
	}

	
}
