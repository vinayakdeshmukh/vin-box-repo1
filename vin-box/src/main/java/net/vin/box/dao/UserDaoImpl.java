package net.vin.box.dao;

import java.util.List;

import net.vin.box.domain.User;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

@Repository("userDaoImpl")
@DynamicUpdate
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	@SuppressWarnings("unchecked")
	public List<User> listUser(int gid) {
		User user = new User();
		user.setUserId("USER001");
		user.setFirstName("Vinayak");
		user.setLastName("Deshmukh");
		
		List<User> userList = getCurrentSession().createCriteria(User.class)
				.add(Example.create(user)).list();
		return userList;

		// Query query = getCurrentSession().createQuery("from User");
		// return query.list();
	}

	public void addUser(User user) {
		getCurrentSession().save(user);
	}
}
