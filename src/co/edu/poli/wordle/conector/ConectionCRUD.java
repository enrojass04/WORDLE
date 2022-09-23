package co.edu.poli.wordle.conector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectionCRUD {
	
	public static void main(String[] args) {
		ConnectionProyect conexion = new ConnectionProyect();
		Connection refConexion = null;
		Statement statement = null;
		ResultSet result = null;
		
		try {
			refConexion = conexion.iniciarConnection();
			statement = refConexion.createStatement();
			result = statement.executeQuery("SELECT * FROM word_list");
			
			while(result.next()) {
				int id = result.getInt(1);
				String word = result.getString(2);
				
				
				System.out.println(id + " " + word );
				
				
			}
		} catch (SQLException e) {
			
		} finally {
			try {
				if (result!=null) {
					result.close();
				}
				if (statement!=null) {
					statement.close();
				}
				if (refConexion!=null) {
					refConexion.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
}
