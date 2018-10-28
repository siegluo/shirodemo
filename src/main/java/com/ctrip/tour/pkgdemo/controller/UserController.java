package com.ctrip.tour.pkgdemo.controller;

import com.ctrip.tour.pkgdemo.dal.dao.UserRepository;
import com.ctrip.tour.pkgdemo.dal.entity.User;
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
 * user
 * @author 大狼狗 2018-10-27
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    /**
     * 新增或编辑
     */
    @PostMapping("/save")
    public Object save(User user){
        return userRepository.save(user);
    }

    /**
     * 删除
     */
    @GetMapping("/delete")
    public Object delete(int id){
        Optional<User> user=userRepository.findById(id);
        if(user.isPresent()){
            userRepository.deleteById(id);
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
        Optional<User> user=userRepository.findById(id);
        if(user.isPresent()){
            return null;
        }else{
            return null;
        }
    }

    /**
     * 分页查询
     */
    @PostMapping("/list")
    public Object list(User user,
                       @RequestParam(required = false, defaultValue = "0") int pageNumber,
                       @RequestParam(required = false, defaultValue = "10") int pageSize) {

        //创建匹配器，需要查询条件请修改此处代码
        ExampleMatcher matcher = ExampleMatcher.matchingAll();

        //创建实例
        Example<User> example = Example.of(user, matcher);
        //分页构造
        Pageable pageable = PageRequest.of(pageNumber,pageSize);

        return userRepository.findAll(example, pageable);
    }

}


