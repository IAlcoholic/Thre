package me.yll.thre.service.impl;

import me.yll.thre.dao.UserMapper;
import me.yll.thre.model.User;
import me.yll.thre.service.UserService;
import me.yll.thre.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by xubo on 2017/11/19.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

}
