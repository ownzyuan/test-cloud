package com.zy.service;

import com.zy.entity.UserDTO;
import com.zy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<UserMapper, UserDTO> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public void deleteById(Long id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setStatus(0);
        userMapper.updateByPrimaryKey(userDTO);
    }
}
