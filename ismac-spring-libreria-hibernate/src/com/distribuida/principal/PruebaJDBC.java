package com.distribuida.principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jdbcURL = "jdbc:mysql://localhost:3306/dbLibrerias60";
				String user = "root";
				String clave = "Admin";
				
		try {
			System.out.println("Estableciendo conexion a BD....");
			
			Connection connection = DriverManager.getConnection(jdbcURL, user, clave);
			
			System.out.println("Conexion establecida!");
			
		} catch (Exception e) {
			//TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
