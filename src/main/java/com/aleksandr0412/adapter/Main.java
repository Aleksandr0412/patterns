package com.aleksandr0412.adapter;

import com.aleksandr0412.adapter.entity.DbUserEntity;
import com.aleksandr0412.adapter.entity.DbUserInfoEntity;
import com.aleksandr0412.adapter.orm.adapter.OrmAdapter;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        var user1 = new DbUserEntity(1L, "user1", "qwe", 1L);
        var user2 = new DbUserEntity(2L, "user2", "qwer", 2L);
        var userInfo1 = new DbUserInfoEntity(1L, "Alex", LocalDateTime.of(1998, 12, 4, 0, 0));
        var userInfo2 = new DbUserInfoEntity(2L, "Oleg", LocalDateTime.of(1998, 3, 15, 0, 0));

        var adapter = new OrmAdapter();

        adapter.create(user1);
        adapter.create(user2);
        adapter.create(userInfo1);
        adapter.create(userInfo2);

        System.out.println(adapter.getUsers());
        System.out.println(adapter.getUserInfo());
    }
}
