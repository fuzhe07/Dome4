package com.service;

import com.entity.UserEntity;


/**
 * Created by Enzo Cotter on 2019/5/11.
 */
public interface IUserService {
    UserEntity login( String name, String password);
}
