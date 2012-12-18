package net.vin.box.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.vin.box.dao.SUserDaoImpl;
import net.vin.box.domain.SUser;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("sUserService")
public class SUserService {

    @Value("#{sUserDaoImpl}")
    private SUserDaoImpl sUserDaoImpl;

    public List<SUser> listUser(int gid) {
        return sUserDaoImpl.listUser(0);
    }

    @Transactional
    public void addUser(SUser user) {
        sUserDaoImpl.addUser(user);
    }

    public Map<String, String> lookupMapSearchFilter() {
        Map<String, String> lookupMap = new HashMap<String, String>();
        lookupMap.put("userId", "User Id");
        lookupMap.put("firstName", "First Name");
        lookupMap.put("lastName", "Last Name");

        return lookupMap;
    }
}
