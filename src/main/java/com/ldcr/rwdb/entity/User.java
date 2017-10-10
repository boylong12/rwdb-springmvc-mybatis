package com.ldcr.rwdb.entity;

/**
 * @Author: honglong.zhang
 * @Date: 2017/10/10 15:42
 */
public class User {
    private Integer id;
    private String username;

    public User(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
