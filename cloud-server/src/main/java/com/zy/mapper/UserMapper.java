package com.zy.mapper;

import com.zy.entity.UserDTO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<UserDTO> {

}
