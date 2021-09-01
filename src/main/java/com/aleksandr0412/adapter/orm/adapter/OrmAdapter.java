package com.aleksandr0412.adapter.orm.adapter;

import com.aleksandr0412.adapter.entity.DbEntity;
import com.aleksandr0412.adapter.entity.DbUserEntity;
import com.aleksandr0412.adapter.entity.DbUserInfoEntity;
import com.aleksandr0412.adapter.orm.DbEntityType;
import com.aleksandr0412.adapter.orm.first.FirstOrmImpl;
import com.aleksandr0412.adapter.orm.second.SecondOrm;
import com.aleksandr0412.adapter.orm.second.SecondOrmImpl;

import java.util.HashSet;
import java.util.Set;

public class OrmAdapter implements Orm<DbEntity> {

    private final FirstOrmImpl userOrm;
    private final FirstOrmImpl userInfoOrm;
    private final SecondOrm secondOrm;

    public OrmAdapter() {
        Set<DbEntity> users = new HashSet<>();
        Set<DbEntity> userInfos = new HashSet<>();
        userOrm = new FirstOrmImpl(users);
        userInfoOrm = new FirstOrmImpl(userInfos);
        secondOrm = new SecondOrmImpl(users, userInfos);
    }

    @Override
    public void create(DbEntity entity) {
        if (entity instanceof DbUserEntity) {
            userOrm.create(entity);
            return;
        }
        if (entity instanceof DbUserInfoEntity) {
            userInfoOrm.create(entity);
        }
    }

    @Override
    public DbEntity read(DbEntityType type, int id) {
        if (type.equals(DbEntityType.USER)) {
            return userOrm.read(id);
        }
        if (type.equals(DbEntityType.USER_INFO)) {
            return userInfoOrm.read(id);
        }
        return null;
    }

    @Override
    public void update(DbEntity entity) {
        if (entity instanceof DbUserEntity) {
            userOrm.update(entity);
            return;
        }
        if (entity instanceof DbUserInfoEntity) {
            userInfoOrm.update(entity);
        }
    }

    @Override
    public void delete(DbEntity entity) {
        if (entity instanceof DbUserEntity) {
            userOrm.delete(entity);
            return;
        }
        if (entity instanceof DbUserInfoEntity) {
            userInfoOrm.delete(entity);
        }
    }

    @Override
    public Set<DbUserEntity> getUsers() {
        return secondOrm.getContext().getUsers();
    }

    @Override
    public Set<DbUserInfoEntity> getUserInfo() {
        return secondOrm.getContext().getUserInfo();
    }

}