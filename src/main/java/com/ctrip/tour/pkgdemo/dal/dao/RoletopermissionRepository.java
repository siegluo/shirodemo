package com.ctrip.tour.pkgdemo.dal.dao;

import com.ctrip.tour.pkgdemo.dal.entity.Role;
import com.ctrip.tour.pkgdemo.dal.entity.Roletopermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoletopermissionRepository extends JpaRepository<Roletopermission,Integer> {



}
