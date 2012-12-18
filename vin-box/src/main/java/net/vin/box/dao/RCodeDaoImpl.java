package net.vin.box.dao;

import java.util.List;

import net.vin.box.domain.RCode;

import org.hibernate.Query;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Repository;

@Repository("rCodeDaoImpl")
@DynamicUpdate
public class RCodeDaoImpl extends BaseDaoImpl implements RCodeDao {

    private static final String HQL_LIST_CODE = "from RCode ";
    private static final String HQL_LIST_BY_CODE_TYPE = "from RCode where cdCodeType = :cdCodeType";

    @SuppressWarnings("unchecked")
    public List<RCode> listCode() {
        Query query = getCurrentSession().createQuery(HQL_LIST_CODE);
        return (List<RCode>) query.list();
    }

    @SuppressWarnings("unchecked")
    public List<RCode> listByCodeType(String cdCodeType) {
        Query query = getCurrentSession().createQuery(HQL_LIST_BY_CODE_TYPE);
        query.setString("cdCodeType", cdCodeType);
        return (List<RCode>) query.list();
    }

    public void addCode(RCode rCode) {
        getCurrentSession().save(rCode);
    }
}
