package org.example.characters;
import lombok.Data;

@Data
public class Character {
    private String name;
    private int level;
    private String race;

    public Character(String name, int level, String race) {
        this.name = name;
        this.level = level;
        this.race = race;
    }
}
