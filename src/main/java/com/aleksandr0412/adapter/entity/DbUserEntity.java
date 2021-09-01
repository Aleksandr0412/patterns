package com.aleksandr0412.adapter.entity;

import java.util.Objects;

public class DbUserEntity implements DbEntity {

    private Long id;
    private String login;
    private String password;
    private Long userInfoId;

    public DbUserEntity() {
    }

    public DbUserEntity(Long id, String login, String password, Long userInfoId) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.userInfoId = userInfoId;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    @Override
    public String toString() {
        return "DbUserEntity{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", userInfoId=" + userInfoId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DbUserEntity that = (DbUserEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(login, that.login) && Objects.equals(password, that.password) && Objects.equals(userInfoId, that.userInfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, userInfoId);
    }
}
