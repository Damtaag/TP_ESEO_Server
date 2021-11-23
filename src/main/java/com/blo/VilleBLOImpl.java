package com.blo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.dao.VilleDAO;
import com.dto.Ville;

@Service
public class VilleBLOImpl implements VilleBLO {

	@Autowired
	private VilleDAO villeDAO;
	
	public Ville getInfoVilles() {
		// code métier
		System.out.println("test");
		return villeDAO.findVille();
	}

}
