package com.aleksandr0412.adapter.orm.second;

import com.aleksandr0412.adapter.entity.DbUserEntity;
import com.aleksandr0412.adapter.entity.DbUserInfoEntity;

import java.util.Set;

public interface SecondOrmContext {

    Set<DbUserEntity> getUsers();

    Set<DbUserInfoEntity> getUserInfo();

}
