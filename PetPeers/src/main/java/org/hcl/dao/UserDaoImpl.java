package org.hcl.dao;

import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
@Autowired
private SessionFactory factory;
	@Override
	public void insert(User user) {
		factory.getCurrentSession().save(user);

		
	}

	@Override
	@Transactional
	public User verifyUser(User user) {
		Session session = factory.getCurrentSession();
		System.out.println(user.getPassword());
		String query="from org.hcl.entities.User u where u.vendorId=:vendorId and u.password=:password";
		User verifiedUser = (User) session.createQuery(query).setParameter("vendorId", user.getVendorId()).setParameter("password", user.getPassword()).uniqueResult();
		if(verifiedUser!=null) {
		System.out.println(verifiedUser.getVendorId());
		return verifiedUser;
		}else {
		return null;

		}

	}
	

}
