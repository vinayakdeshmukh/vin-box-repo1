package net.vin.box.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "r_code_type")
public class RCodeType extends BaseDomain {

    @Id
    @Column(name = "cd_code_type")
    String cdCodeType;

    @Column(name = "cd_parent")
    String cdParent;

    @Column(name = "des_short")
    String desShort;

    @Column(name = "des_long")
    String desLong;

    public String getCdCodeType() {
        return cdCodeType;
    }

    public void setCdCodeType(String cdCodeType) {
        this.cdCodeType = cdCodeType;
    }

    public String getCdParent() {
        return cdParent;
    }

    public void setCdParent(String cdParent) {
        this.cdParent = cdParent;
    }

    public String getDesShort() {
        return desShort;
    }

    public void setDesShort(String desShort) {
        this.desShort = desShort;
    }

    public String getDesLong() {
        return desLong;
    }

    public void setDesLong(String desLong) {
        this.desLong = desLong;
    }

}
