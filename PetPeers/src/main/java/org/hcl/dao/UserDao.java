package org.hcl.dao;

import org.hcl.entities.User;

public interface UserDao {
public void insert(User user);
	
	
	
	public User verifyUser(User user);

}
