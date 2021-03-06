package io.mkth.clientmanagerpact.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clients {

    @JsonProperty(value = "_id")
    private String id;

    private String username;

    private String description;

    private String team;

    private String owner;

    public Clients() {

    }

    public Clients(String id, String username, String description, String team, String owner) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.team = team;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
