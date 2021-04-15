package com.zy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@Table(name = "user")
public class User {

    @Id
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private Integer status;
}
