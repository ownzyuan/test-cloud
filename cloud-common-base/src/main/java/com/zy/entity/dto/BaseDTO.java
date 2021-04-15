package com.zy.entity.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class BaseDTO implements Serializable {

    private static final long serialVersionUID = 2393269568666085258L;

    @Id
    private Long id;

    @Column(name = "status")
    private Integer status;

}
