package com.aleksandr0412.adapter.orm.second;

import com.aleksandr0412.adapter.entity.DbEntity;

import java.util.Set;

public class SecondOrmImpl implements SecondOrm {

    private final SecondOrmContext secondOrmContext;

    public SecondOrmImpl(Set<DbEntity> users, Set<DbEntity> userInfo) {
        this.secondOrmContext = new SecondOrmContextImpl(users, userInfo);
    }

    @Override
    public SecondOrmContext getContext() {
        return this.secondOrmContext;
    }

}
