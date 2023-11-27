package org.example;


import org.example.characters.Character;
import org.example.characters.CharacterService;
import org.example.spells.Spell;
import org.example.spells.SpellService;
import org.example.items.Item;
import org.example.items.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.debug("Inicio!");

        CharacterService characterService = new CharacterService();
        Character character = new Character("Gandalf", 10, "Human");
        characterService.createCharacter(character);

        SpellService spellService = new SpellService();
        Spell spellFireball = new Spell("Fireball", 3, "Evocation");
        spellService.castSpell(spellFireball);

        Spell spellSnowball = new Spell("Snowball", 3, "Evocation");
        spellService.castSpell(spellSnowball);

        ItemService itemService = new ItemService();
        Item item = new Item("Sword", 5, 100);
        itemService.equipItem(item);
    }
}