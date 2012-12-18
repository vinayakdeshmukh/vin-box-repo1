package net.vin.box.dao;

import java.util.List;

import net.vin.box.domain.SUser;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.criterion.Example;
import org.springframework.stereotype.Repository;

@Repository("sUserDaoImpl")
@DynamicUpdate
public class SUserDaoImpl extends BaseDaoImpl implements SUserDao {

    @SuppressWarnings("unchecked")
    public List<SUser> listUser(int gid) {
        SUser user = new SUser();
        user.setUserId("USER001");
        user.setFirstName("Vinayak");
        user.setLastName("Deshmukh");

        List<SUser> userList = getCurrentSession().createCriteria(SUser.class).add(Example.create(user)).list();
        return userList;

        // Query query = getCurrentSession().createQuery("from User");
        // return query.list();
    }

    public void addUser(SUser user) {
        getCurrentSession().save(user);
    }
}
