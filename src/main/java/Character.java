import abilities.additional.AdditionalAbility;
import abilities.basic.BasicAbility;

public class Character {
    @AutoInjectable
    BasicAbility basicAbility;
    @AutoInjectable
    AdditionalAbility additionalAbility;

    void showAbilities(){
        basicAbility.showBasicAbility();
        additionalAbility.showAdditionalAbility();
    }
}
