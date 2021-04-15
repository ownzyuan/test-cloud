package com.zy.service;

import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface IBaseService<M extends Mapper<T>, T> {
    T selectOne(T entity);
    T selectById(Object id);
    List<T> selectAll();
    void insert(T entity);
    void updateById(T entity);
    void deleteById(Long id);
}
