package net.vin.box.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "r_code")
public class RCode extends BaseDomain {

    @Id
    @GeneratedValue
    @Column(name = "id_code")
    String idCode;

    @Column(name = "cd_code")
    String cdCode;

    @Column(name = "cd_code_type")
    String cdCodeType;

    @Column(name = "des_short")
    String desShort;

    @Column(name = "des_long")
    String desLong;

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getCdCode() {
        return cdCode;
    }

    public void setCdCode(String cdCode) {
        this.cdCode = cdCode;
    }

    public String getCdCodeType() {
        return cdCodeType;
    }

    public void setCdCodeType(String cdCodeType) {
        this.cdCodeType = cdCodeType;
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
