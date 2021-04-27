package com.zy.service;

import com.zy.entity.UserDTO;
import com.zy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.Collections;
import java.util.List;

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

    @Override
    public List<UserDTO> selectExample(Example example) {
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("name", "inserted");
        List<UserDTO> userDTOS = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userDTOS)) {
            return Collections.EMPTY_LIST;
        }
        return userDTOS;
    }
}
