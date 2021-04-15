package com.zy.mapper;

import com.zy.CloudServerApplication;
import com.zy.entity.UserDTO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CloudServerApplication.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    private Long id;

    @Before
    public void randomNum() {
        int max = 1000000000, min = 100000000;
        id = (long) (Math.random() * max) + min;
    }

    @Test
    public void insertTest() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName("inserted")
                .setStatus(1);
        int result = userMapper.insert(userDTO);
        System.out.println(result);
    }

    @Test
    public void updateTest() {
        insertTest();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName("updated")
                .setStatus(1);
        int result = userMapper.updateByPrimaryKey(userDTO);
        System.out.println(result);
    }

    @Test
    public void deleteTest() {
        insertTest();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName("deleted")
                .setStatus(0);
        int result = userMapper.updateByPrimaryKey(userDTO);
        System.out.println(result);
    }

    @Test
    public void selectTest() {
        insertTest();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setStatus(1);
        UserDTO result = userMapper.selectOne(userDTO);
        System.out.println(result);
    }

}