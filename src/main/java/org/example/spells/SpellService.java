package org.example.spells;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpellService {
    private static Logger logger;

    public SpellService() {
        this(LoggerFactory.getLogger(SpellService.class));
    }

    public SpellService(Logger mockLogger) {
        if (mockLogger != null){
            logger = mockLogger;
        }else {
            logger = LoggerFactory.getLogger(SpellService.class);
        }
    }

    public void castSpell(Spell spell) {
        try {
            logger.info("Usou a Spell '" + spell.getName() + "'");
        } catch (Error e) {
            logger.error("Ocorreu um erro ao usar a Spell '" + spell.getName() + "': " + e);
        }
    }
}