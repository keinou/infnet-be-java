package org.example.spells;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpellService {
    private static final Logger logger = LoggerFactory.getLogger(SpellService.class);

    public void castSpell(Spell spell) {
        try {
            logger.info("Usou a Spell '" + spell + "'");
        } catch (Error e) {
            logger.error("Ocorreu um erro ao usar a Spell '" + spell + "': " + e);
        }
    }
}