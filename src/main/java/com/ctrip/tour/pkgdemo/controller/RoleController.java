package com.ctrip.tour.pkgdemo.controller;

import com.ctrip.tour.pkgdemo.dal.dao.RoleRepository;
import com.ctrip.tour.pkgdemo.dal.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * role
 * @author 大狼狗 2018-10-27
 */
@RestController
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public Object save(Role role){
        return roleRepository.save(role);
    }

    /**
     * 删除
     */
    @GetMapping("/delete")
    public Object delete(int id){
        Optional<Role> role=roleRepository.findById(id);
        if(role.isPresent()){
            roleRepository.deleteById(id);
            return null;
        }else{
            return null;
        }
    }

    /**
     * 查询
     */
    @GetMapping("/find")
    public Object find(int id){
        Optional<Role> role=roleRepository.findById(id);
        if(role.isPresent()){
            return null;
        }else{
            return null;
        }
    }

    /**
     * 分页查询
     */
    @PostMapping("/list")
    public Object list(Role role,
                       @RequestParam(required = false, defaultValue = "0") int pageNumber,
                       @RequestParam(required = false, defaultValue = "10") int pageSize) {

        //创建匹配器，需要查询条件请修改此处代码
        ExampleMatcher matcher = ExampleMatcher.matchingAll();

        //创建实例
        Example<Role> example = Example.of(role, matcher);
        //分页构造
        Pageable pageable = PageRequest.of(pageNumber,pageSize);

        return roleRepository.findAll(example, pageable);
    }

}


