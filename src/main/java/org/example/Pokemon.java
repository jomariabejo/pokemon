package org.example;
import com.google.gson.annotations.SerializedName;

public class Pokemon {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("base_experience")
    private int baseExperience;

    // Constructor
    public Pokemon(int id, String name, int baseExperience) {
        this.id = id;
        this.name = name;
        this.baseExperience = baseExperience;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBaseExperience() {
        return baseExperience;
    }
}
