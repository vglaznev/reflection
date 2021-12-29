package abilities.additional;

/**
 * One of the additional abilities. Allows the character hear the quietest sounds.
 * @see AdditionalAbility
 */
public class SuperHearingAbility implements AdditionalAbility{
    @Override
    public void showAdditionalAbility() {
        System.out.println("I can even hear the rustle of grass. (Additional ability: Super hearing ability)");
    }
}
