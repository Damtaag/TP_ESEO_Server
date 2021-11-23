package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Repository;

import com.dto.Ville;

@Repository
public class VilleDAOImpl implements VilleDAO {

	//Connection co;
	
	public Ville findVille() {
		/*dbConnexion();
		
		Statement st;
		try {
			st = co.createStatement();
			ResultSet rst = st.executeQuery("SELECT * FROM ville_france");
			while(rst.next()){
	            System.out.print(rst.getString("Nom_commune")+"\t");
	            System.out.println();
	        }
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		Ville ville = new Ville();
		ville.setCodeCommune("plop");
		ville.setCommune("plop");
		return ville;
	}
	
	/*public void dbConnexion() {
		String url = "jdbc:mysql://127.0.0.1/twic";
        String user = "root";
        String password = "root";
         
        try {
        	co = DriverManager.getConnection(url, user, password);
		}catch(Exception e){
			e.printStackTrace();
		}
	}*/
}
