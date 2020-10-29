package org.hcl.services;


import javax.transaction.Transactional;

import org.hcl.dao.UserDao;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao dao;
	@Override
	@Transactional
	public void insertUser(User user) {
		dao.insert(user);

	}
	
}
