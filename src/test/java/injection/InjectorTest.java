package injection;

import abilities.additional.HealingAbility;
import abilities.basic.MagicAbility;
import character.Character;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InjectorTest {

    @Test
    void inject() throws Exception{
        Character character1 = (new Injector("magic-healing.properties")).inject(new Character());
        assertTrue(character1.getBasicAbility() instanceof MagicAbility);
        assertTrue(character1.getAdditionalAbility() instanceof HealingAbility);
    }
}