package com.service;

import com.dao.IUserDao;
import com.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Enzo Cotter on 2019/5/11.
 */
@Service
public class UserServiceImpl implements IUserService {
    @Resource
    IUserDao userDao;

    public UserEntity login(String name, String password) {
        UserEntity userEntity = userDao.findByName(name);
        if (password.equals(userEntity.getPassword())){
            return userEntity;
        }return null;
    }


    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
