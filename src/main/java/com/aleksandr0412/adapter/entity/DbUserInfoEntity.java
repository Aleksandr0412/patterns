package com.aleksandr0412.adapter.entity;

import com.aleksandr0412.adapter.entity.DbEntity;

import java.time.LocalDateTime;
import java.util.Objects;

public class DbUserInfoEntity implements DbEntity {

    private Long id;
    private String name;
    private LocalDateTime birthday;

    public DbUserInfoEntity() {
    }

    public DbUserInfoEntity(Long id, String name, LocalDateTime birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "DbUserInfoEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DbUserInfoEntity that = (DbUserInfoEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(birthday, that.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthday);
    }
}
