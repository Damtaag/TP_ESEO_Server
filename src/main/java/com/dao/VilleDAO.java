package com.dao;

import org.springframework.stereotype.Repository;

import com.dto.Ville;

@Repository
public interface VilleDAO {

	public Ville findVille();
}
