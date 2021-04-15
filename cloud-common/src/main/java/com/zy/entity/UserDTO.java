package com.zy.entity;

import com.zy.entity.dto.BaseDTO;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Table;

@Data
@Accessors(chain = true)
@Table(name = "user")
public class UserDTO extends BaseDTO {

    @Column(name = "name")
    private String name;

}
