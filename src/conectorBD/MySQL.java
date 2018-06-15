package conectorBD;

import java.sql.*;


public class MySQL {
	
	private String USER = "root";
	private String PASSWORD = "";
	private String HOST = "127.0.0.1";
	private String PORT = "3306";
	private String DATABASE = "SGC";
	private String CLASSNAME = "com.mysql.jdbc.Driver";
	private String URL = "jdbc:mysql://"+HOST+":"+PORT+"/"+DATABASE;
	private Connection con;
	
	public MySQL() {
		try {
			Class.forName(CLASSNAME);
			con = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
		
			System.out.println("No se cargo el driver de base de datos " +e);
			e.printStackTrace();
		} catch (SQLException eSQL) {
			
			System.out.println("No se cargo la base de datos " +eSQL);
			eSQL.printStackTrace();
		}
	}
	public Connection getConexion() {
		return con;
	}
	
	public static void main(String[] args) {
		MySQL con = new MySQL();
	}
}
