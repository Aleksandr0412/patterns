package com.aleksandr0412.adapter.orm.first;

import com.aleksandr0412.adapter.entity.DbEntity;

public interface FirstOrm<T extends DbEntity> {

    void create(T entity);

    T read(int id);

    void update(T entity);

    void delete(T entity);
}
