package com.wext.pruebamvvm.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Entity(tableName = Contributor.TABLE_NAME,
        foreignKeys = @ForeignKey(entity = Repo.class,
        parentColumns = {"name", "owner_login"},
        childColumns = {"repoName", "repoOwner" },
        onUpdate = ForeignKey.CASCADE))
public class Contributor implements Serializable {

    public static final String TABLE_NAME = "contributorTable";

    @PrimaryKey
    @SerializedName("login")
    public final String login;
    @PrimaryKey
    @SerializedName("contributions")
    public final Integer contributions;
    @PrimaryKey
    @SerializedName("avatar_url")
    public final String avatarUrl;

    public String repoName;
    public String repoOwner;

    public Contributor(String login, Integer contributions, String avatarUrl) {
        this.login = login;
        this.contributions = contributions;
        this.avatarUrl = avatarUrl;
    }

    public String getLogin() {
        return login;
    }

    public Integer getContributions() {
        return contributions;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public String getRepoOwner() {
        return repoOwner;
    }

    public void setRepoOwner(String repoOwner) {
        this.repoOwner = repoOwner;
    }
}
