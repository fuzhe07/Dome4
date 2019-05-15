package com.dao;

import com.entity.UserEntity;
import org.apache.ibatis.annotations.Param;


/**
 * Created by Enzo Cotter on 2019/5/11.
 */
public interface IUserDao {
 UserEntity findByName(@Param("name") String name);
}
