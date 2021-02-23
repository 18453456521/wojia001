package com.wojia.shop.mapper;

import com.wojia.shop.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;

import java.util.List;

@Mapper
public interface UserMapper {
    int ins(User user);

    User selectByUsernameAndpassword(String username, String password);

    User selectByUsername(String username);
}
