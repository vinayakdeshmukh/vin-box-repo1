package net.vin.box.dao;

import java.util.List;

import net.vin.box.domain.SUser;

public interface SUserDao {

    public List<SUser> listUser(int gid);

    public void addUser(SUser user);
}
