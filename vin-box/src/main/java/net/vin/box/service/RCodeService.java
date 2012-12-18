package net.vin.box.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.vin.box.dao.RCodeDao;
import net.vin.box.domain.RCode;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("rCodeService")
public class RCodeService {

    @Value("#{rCodeDaoImpl}")
    private RCodeDao rCodeDaoImpl;

    public List<RCode> listCode(int gid) {
        return rCodeDaoImpl.listCode();
    }

    public Map<String, String> lookupMapByCodeType(String cdCodeType) {
        List<RCode> rCodeList = rCodeDaoImpl.listByCodeType(cdCodeType);
        Map<String, String> lookupMap = new HashMap<String, String>();

        for (RCode rCode : rCodeList) {
            lookupMap.put(rCode.getCdCode(), rCode.getDesShort());
        }

        return lookupMap;
    }

    @Transactional
    public void addCode(RCode rCode) {
        rCodeDaoImpl.addCode(rCode);
    }

}
