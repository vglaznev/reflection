package abilities.additional;

/**
 * One of the additional abilities. Allows the character to heal another characters.
 * @see AdditionalAbility
 */
public class HealingAbility implements AdditionalAbility{
    @Override
    public void showAdditionalAbility() {
        System.out.println("And I can also heal people! (Additional ability: Healing ability)");
    }
}
