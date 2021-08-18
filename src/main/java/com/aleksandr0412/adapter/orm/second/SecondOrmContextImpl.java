package com.aleksandr0412.adapter.orm.second;

import com.aleksandr0412.adapter.entity.DbEntity;
import com.aleksandr0412.adapter.entity.DbUserEntity;
import com.aleksandr0412.adapter.entity.DbUserInfoEntity;

import java.util.Set;
import java.util.stream.Collectors;

public class SecondOrmContextImpl implements SecondOrmContext {

    private final Set<DbEntity> users;
    private final Set<DbEntity> userInfo;

    public SecondOrmContextImpl(Set<DbEntity> users, Set<DbEntity> userInfo) {
        this.users = users;
        this.userInfo = userInfo;
    }

    @Override
    public Set<DbUserEntity> getUsers() {
        return users.stream()
                .map(v -> (DbUserEntity) v)
                .collect(Collectors.toSet());
    }

    @Override
    public Set<DbUserInfoEntity> getUserInfo() {
        return userInfo.stream()
                .map(v -> (DbUserInfoEntity) v)
                .collect(Collectors.toSet());
    }
}