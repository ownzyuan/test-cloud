package com.zy.service;


import com.zy.entity.UserDTO;
import com.zy.mapper.UserMapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

public interface IUserService extends IBaseService<UserMapper, UserDTO> {

    List<UserDTO> selectExample(Example example);

}
