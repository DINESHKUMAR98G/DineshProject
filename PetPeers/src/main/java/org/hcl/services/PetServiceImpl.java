package org.hcl.services;

import org.hcl.dao.PetDao;
import org.hcl.entities.PetDetails;
import org.springframework.beans.factory.annotation.Autowired;

public class PetServiceImpl implements PetService{
	@Autowired
	private PetDao dao;

	@Override
	public void insertPet(PetDetails petdetails) {
		dao.insert(petdetails);
		
	}

}
