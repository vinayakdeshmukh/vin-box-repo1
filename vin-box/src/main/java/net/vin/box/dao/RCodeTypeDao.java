package net.vin.box.dao;

import java.util.List;

import net.vin.box.domain.RCodeType;

public interface RCodeTypeDao extends BaseDao {
    public List<RCodeType> listCodeType();

    public void addCodeType(RCodeType rCodeType);
}
