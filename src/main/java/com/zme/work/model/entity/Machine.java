package com.zme.work.model.entity;

import java.util.Date;

public class Machine {
    private Integer pkid;

    private String version;

    private String changshang;

    private Date birth;

    public Integer getPkid() {
        return pkid;
    }

    public void setPkid(Integer pkid) {
        this.pkid = pkid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getChangshang() {
        return changshang;
    }

    public void setChangshang(String changshang) {
        this.changshang = changshang == null ? null : changshang.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}