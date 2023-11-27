import org.example.spells.Spell;
import org.example.spells.SpellService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class SpellServiceTest {

    private SpellService spellService;
    private Logger mockLogger;

    @BeforeEach
    public void setUp() {
        mockLogger = mock(Logger.class);
        spellService = new SpellService(mockLogger);
    }

    @Test
    public void testCastSpell() {
        Spell testSpell = new Spell("Fireball", 3, "Evocation");

        spellService.castSpell(testSpell);

        verify(mockLogger, times(1)).info("Usou a Spell 'Fireball'");
    }

    @Test
    public void testCastSpellWithError() {
        Spell testSpell = new Spell("Fireball", 3, "Evocation");

        doThrow(new RuntimeException("Simulated error")).when(mockLogger).info(anyString());

        // Usando assertThrows para verificar a exceção
        RuntimeException exception = assertThrows(RuntimeException.class, () -> spellService.castSpell(testSpell));

        // Verificando a mensagem da exceção
        String expectedMessage = "Simulated error";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
