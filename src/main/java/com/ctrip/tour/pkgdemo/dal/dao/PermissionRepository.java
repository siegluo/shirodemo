package com.ctrip.tour.pkgdemo.dal.dao;

import java.util.List;

import com.ctrip.tour.pkgdemo.dal.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *  permission
 * @author 大狼狗 2018-10-27
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission,Integer> {

}
