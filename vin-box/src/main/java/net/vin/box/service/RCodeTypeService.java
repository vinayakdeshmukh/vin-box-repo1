package net.vin.box.service;

import java.util.List;

import net.vin.box.dao.RCodeTypeDaoImpl;
import net.vin.box.domain.RCodeType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("rCodeTypeService")
public class RCodeTypeService {

    @Value("#{rCodeTypeDaoImpl}")
    private RCodeTypeDaoImpl rCodeTypeDaoImpl;

    public List<RCodeType> listUser(int gid) {
        return rCodeTypeDaoImpl.listCodeType();
    }

    @Transactional
    public void addCodeType(RCodeType rCodeType) {
        rCodeTypeDaoImpl.addCodeType(rCodeType);
    }

}
