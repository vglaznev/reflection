package character;

import abilities.additional.AdditionalAbility;
import abilities.basic.BasicAbility;
import injection.AutoInjectable;

/**
 * Computer game character class.
 */
public class Character {
    /**
     * Main ability of the character.
     */
    @AutoInjectable
    private BasicAbility basicAbility;
    /**
     *Auxiliary ability of the character.
     */
    @AutoInjectable
    private AdditionalAbility additionalAbility;

    /**
     * Shows character's abilities.
     */
    public void showAbilities(){
        basicAbility.showBasicAbility();
        additionalAbility.showAdditionalAbility();
    }

    public BasicAbility getBasicAbility() {
        return basicAbility;
    }

    public AdditionalAbility getAdditionalAbility() {
        return additionalAbility;
    }
}
