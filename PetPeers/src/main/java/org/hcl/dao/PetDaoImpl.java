package org.hcl.dao;

import org.hcl.entities.PetDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@Repository
public class PetDaoImpl implements PetDao{
	@Autowired
	private SessionFactory factory;
	@Override
	public void insert(PetDetails petdetails) {
		factory.getCurrentSession().save(petdetails);
	}



}
