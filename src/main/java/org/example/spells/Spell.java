package org.example.spells;

import lombok.Data;

@Data
public class Spell {
    private String name;
    private int level;
    private String school;

    public Spell(String name, int level, String school) {
        this.name = name;
        this.level = level;
        this.school = school;
    }

    public String getName() {
        return name;
    }

}