package com.ctrip.tour.pkgdemo.dal.dao;

import com.ctrip.tour.pkgdemo.dal.entity.Role;
import com.ctrip.tour.pkgdemo.dal.entity.Usertorole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsertoroleRepository extends JpaRepository<Usertorole,Integer> {



}
