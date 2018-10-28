package com.ctrip.tour.pkgdemo.dal.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 *  permission
 * @author 大狼狗 2018-10-27
 */
@Entity
@Table(name="permission")
public class Permission implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    /**
     * 权限id
     */
    private int permissionid;

    /**
     * 权限名称
     */
    private String permissionname;

    /**
     * 服务方法名
     */
    private String servicename;

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

    public int getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(int permissionid) {
        this.permissionid = permissionid;
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
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