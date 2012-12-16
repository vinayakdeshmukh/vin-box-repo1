package net.vin.box.service;

import java.util.List;

import net.vin.box.dao.UserDaoImpl;
import net.vin.box.domain.User;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userService")
public class UserService {

	@Value("#{userDaoImpl}")
	private UserDaoImpl userDaoImpl;
	
	public List<User> listUser(int gid) {		
		return userDaoImpl.listUser(0);
	}
	
	@Transactional
	public void addUser(User user) {
		userDaoImpl.addUser(user);
	}

}
