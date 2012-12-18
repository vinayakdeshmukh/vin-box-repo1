package net.vin.box.dao;

import java.util.List;

import net.vin.box.domain.RCodeType;

import org.hibernate.Query;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Repository;

@Repository("rCodeTypeDaoImpl")
@DynamicUpdate
public class RCodeTypeDaoImpl extends BaseDaoImpl implements RCodeTypeDao {

    @SuppressWarnings("unchecked")
    public List<RCodeType> listCodeType() {
        Query query = getCurrentSession().createQuery("from RCodeType");
        return (List<RCodeType>) query.list();
    }

    public void addCodeType(RCodeType rCodeType) {
        getCurrentSession().save(rCodeType);
    }
}
