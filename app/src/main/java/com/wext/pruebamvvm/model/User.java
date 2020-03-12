package com.wext.pruebamvvm.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Entity(tableName = User.TABLE_NAME)
public class User implements Serializable {

    public static final String TABLE_NAME = "userTable";

    @PrimaryKey
    @SerializedName("login")
    private String login;
    @SerializedName("avatarUrl")
    private String avatarUrl;
    @SerializedName("name")
    private String name;
    @SerializedName("company")
    private String company;
    @SerializedName("repoUrl")
    private String repoUrl;
    @SerializedName("blog")
    private String blog;

    public User(String login, String avatarUrl, String name, String company, String repoUrl, String blog) {
        this.login = login;
        this.avatarUrl = avatarUrl;
        this.name = name;
        this.company = company;
        this.repoUrl = repoUrl;
        this.blog = blog;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }
}
