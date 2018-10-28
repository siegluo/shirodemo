package com.ctrip.tour.pkgdemo.controller;
import com.ctrip.tour.pkgdemo.dal.dao.PermissionRepository;
import com.ctrip.tour.pkgdemo.dal.entity.Permission;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * permission
 * @author 大狼狗 2018-10-27
 */
@RestController
public class PermissionController {

    @Autowired
    private PermissionRepository permissionRepository;

    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public Object save(Permission permission){
        return permissionRepository.save(permission);
    }

    /**
     * 删除
     */
    @GetMapping("/delete")
    public Object delete(int id){
        Optional<Permission> permission=permissionRepository.findById(id);
        if(permission.isPresent()){
            permissionRepository.deleteById(id);
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
        Optional<Permission> permission=permissionRepository.findById(id);
        if(permission.isPresent()){
            return null;
        }else{
            return null;
        }
    }

    /**
     * 分页查询
     */
    @PostMapping("/list")
    public Object list(Permission permission,
                       @RequestParam(required = false, defaultValue = "0") int pageNumber,
                       @RequestParam(required = false, defaultValue = "10") int pageSize) {

        //创建匹配器，需要查询条件请修改此处代码
        ExampleMatcher matcher = ExampleMatcher.matchingAll();

        //创建实例
        Example<Permission> example = Example.of(permission, matcher);
        //分页构造
        Pageable pageable = PageRequest.of(pageNumber,pageSize);

        return permissionRepository.findAll(example, pageable);
    }

}


