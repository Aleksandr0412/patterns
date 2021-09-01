package com.aleksandr0412.adapter.orm.first;

import com.aleksandr0412.adapter.entity.DbEntity;

import java.util.Set;

public class FirstOrmImpl implements FirstOrm {

    private final Set<DbEntity> entities;

    public FirstOrmImpl(Set<DbEntity> entities) {
        this.entities = entities;
    }

    @Override
    public void create(DbEntity entity) {
        entities.add(entity);
    }

    @Override
    public DbEntity read(int id) {
        return entities.stream()
                .filter(entity -> entity.getId().equals((long) id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(DbEntity entity) {
        entities.add(entity);
    }

    @Override
    public void delete(DbEntity entity) {
        entities.remove(entity);
    }

}