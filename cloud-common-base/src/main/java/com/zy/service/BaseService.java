package com.zy.service;

import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public abstract class BaseService<M extends Mapper<T>, T> implements IBaseService<M, T> {

    @Autowired
    protected M mapper;

    public void setMapper(M mapper) {
        this.mapper = mapper;
    }

    public T selectOne(T entity) {
        return mapper.selectOne(entity);
    }

    public T selectById(Object id) {
        return mapper.selectByPrimaryKey(id);
    }

    public List<T> selectAll() {
        return mapper.selectAll();
    }

    public void insert(T entity) {
        mapper.insert(entity);
    }

    public void updateById(T entity) {
        mapper.updateByPrimaryKey(entity);
    }

}
