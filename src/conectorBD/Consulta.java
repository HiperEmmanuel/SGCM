package conectorBD;

import java.sql.*;

public class Consulta extends MySQL {
	public static void main(String[] args) {
	//Consulta co = new Consulta();
	//java.sql.Date sqlDate = new java.sql.Date(6);
		//System.out.println(co.registrar("ojala@funcione.com","123123","Probando","Otra vez","FIM",sqlDate,"M"));
	}
	public boolean autenticacion(String USER, String PASS) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			String consulta = "SELECT * FROM `GestionDeUsuario.Usuario` where Email = ? and Password = ?;";
			pst = getConexion().prepareStatement(consulta);
			pst.setString(1, USER);
			pst.setString(2, PASS);
			rs = pst.executeQuery();
			
				if(rs.absolute(1)) {
					return true;
					
				}
		} catch (Exception e) {
			System.err.println("Error: "+ e);
		} finally {
			try {
				if(getConexion() != null) getConexion().close();
				if (pst != null) pst.close();
				if (rs != null) rs.close();
			} catch (Exception e) {
				System.err.println("Error: "+ e);
			}
		}
		return false;
	}
	public boolean registrar(String email, String password, String name, String lastname, String academy, Date date, String sex) {
	//DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		//Date fecha=df.format(date);
		PreparedStatement pst = null;
		PreparedStatement pst2 = null;
		System.out.println(date);
		try {
			String insertRegistro = "insert into `GestionDeUsuario.Usuario` (Email, Password) values (?, ?);";
			
			pst = getConexion().prepareStatement(insertRegistro);
			//pst = getConexion().prepareStatement(insertRegistro2);
			pst.setString(1, email);
			pst.setString(2, password);
			
			if(pst.executeUpdate() == 1) {
				String insertRegistro2 = "insert into `GestionDeUsuario.Usuario.Datos` (Nombres, Apellidos, UnidadAcademica, FechaDeNacimiento, Sexo) values (?, ?, ?, ?, ?);";
				pst2 = getConexion().prepareStatement(insertRegistro2);
				pst2.setString(1, name);
				pst2.setString(2, lastname);
				pst2.setString(3, academy);
				pst2.setDate(4, date);
				pst2.setString(5, sex);
				if(pst2.executeUpdate() == 1) {
				return true;
				}
			}
		} catch (Exception ex) {
			System.err.println("Error: "+ ex);
		} finally {
			try {
				if(getConexion() != null) getConexion().close();
				if (pst != null) pst.close();
			} catch (Exception e) {
				System.err.println("Error: "+ e);
			}
		}
		return false;
	}
}
