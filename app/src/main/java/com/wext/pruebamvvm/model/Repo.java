package com.wext.pruebamvvm.model;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@Entity(tableName = Repo.TABLE_NAME, indices = {@Index("id"), @Index("owner_login")})
public class Repo implements Serializable {

    public static final String TABLE_NAME = "repoTable";

    @SerializedName("id")
    public final Integer id;
    @PrimaryKey
    @SerializedName("name")
    public final String name;
    @SerializedName("full_name")
    public final String fullName;
    @SerializedName("description")
    public final String description;
    @SerializedName("stargazers_count")
    public final String stargazersCount;
    @SerializedName("owner")
    @Embedded(prefix = "owner_")
    public final Owner owner;

    public Repo(Integer id, String name, String fullName, String description, String stargazersCount, Owner owner) {
        this.id = id;
        this.name = name;
        this.fullName = fullName;
        this.description = description;
        this.stargazersCount = stargazersCount;
        this.owner = owner;
    }

    public static class Owner {
        @PrimaryKey
        @SerializedName("login")
        private String login;
        @SerializedName("url")
        private String url;

        public Owner (String login, String url){
            this.login = login;
            this.url = url;
        }
    }
}
