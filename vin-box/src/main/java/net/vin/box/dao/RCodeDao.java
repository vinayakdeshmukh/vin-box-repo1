package net.vin.box.dao;

import java.util.List;

import net.vin.box.domain.RCode;

public interface RCodeDao extends BaseDao {
    public List<RCode> listCode();

    public void addCode(RCode rCode);

    public List<RCode> listByCodeType(String cdCodeType);
}
