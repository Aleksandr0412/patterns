package com.aleksandr0412.adapter.orm.adapter;


import com.aleksandr0412.adapter.entity.DbEntity;
import com.aleksandr0412.adapter.entity.DbUserEntity;
import com.aleksandr0412.adapter.entity.DbUserInfoEntity;
import com.aleksandr0412.adapter.orm.DbEntityType;

import java.util.Set;

public interface Orm<T extends DbEntity> {

    void create(T entity);

    T read(DbEntityType type, int id);

    void update(T entity);

    void delete(T entity);

    Set<DbUserEntity> getUsers();

    Set<DbUserInfoEntity> getUserInfo();

}