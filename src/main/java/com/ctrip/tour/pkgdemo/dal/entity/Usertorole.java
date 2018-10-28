package com.ctrip.tour.pkgdemo.dal.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 *  usertorole
 * @author 大狼狗 2018-10-27
 */
@Entity
@Table(name="usertorole")
public class Usertorole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    /**
     * 主键
     */
    private int id;

    /**
     * 用户id
     */
    private int userid;

    /**
     * 角色id
     */
    private int roleid;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 修改者用户名
     */
    private String modifyuser;

    /**
     * datachange_lasttime
     */
    private Date datachangeLasttime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser;
    }

    public Date getDatachangeLasttime() {
        return datachangeLasttime;
    }

    public void setDatachangeLasttime(Date datachangeLasttime) {
        this.datachangeLasttime = datachangeLasttime;
    }
}
