package AgendaConSQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class ControladorAgenda {

private Connection con = null;
	
	public ControladorAgenda() {
		try {
			con = ConexionBD.getConnection();
		} catch (Exception e) {
			System.out.println("Error en conexion");
		}
	}

	public void agregaContacto(String nombre, int celular, String direccion) {
		try {
			PreparedStatement sql = con.prepareStatement("INSERT INTO Contactos VALUES (?,?,?)");
			String sNombre = nombre;
			int sCelular = celular;
			String sDireccion = direccion;
			sql.setString(1,sNombre);
			sql.setInt(2,sCelular);
			sql.setString(3, sDireccion);
			sql.executeUpdate();
		} catch (Exception e) {		
			System.out.println("Error... no se pudo agregar contacto");
		}
	}
	
	public ArrayList<Persona> getContactos(){
		ArrayList<Persona> contactos;
		try {
			Statement sql = con.createStatement();
			ResultSet miResultSet = sql.executeQuery("SELECT * FROM Contactos");
			contactos = new ArrayList<Persona>();
			String sNombre;
			int sCelular;
			String sDireccion;
				while (miResultSet.next()) {
					sNombre = miResultSet.getString("Nombre");
					sCelular = miResultSet.getInt("Telefono");
					sDireccion = miResultSet.getString("Direccion");
					Persona miPersona =new Persona(sNombre,sCelular,sDireccion);
					contactos.add(miPersona);
				}
		} catch (Exception e) {		
			System.out.println("Error...no se pudieron obtener los contanctos");
			contactos=null;
		}
		
		return contactos;
	}
	
	public void eliminaContacto(String nombre){
		try {
			PreparedStatement sql = con.prepareStatement("DELETE Contactos WHERE Nombre=?");
			sql.setString(1, nombre);
			sql.executeUpdate();
		} catch (Exception e) {		
			System.out.println("Error...no se pudo eliminar el contacto");
		}
		
	}
	
}
