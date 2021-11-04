package io.mkth.clientmanagerpact.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ClientDTO {

    @NotNull
    @Size(min = 5)
    private String username;

    @NotNull
    @Size(min = 5)
    private String description;

    @NotNull
    @Size(min = 5)
    private String team;

    @NotNull
    @Size(min = 5)
    private String owner;

    public ClientDTO(String username, String description, String team, String owner) {
        this.username = username;
        this.description = description;
        this.team = team;
        this.owner = owner;
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
