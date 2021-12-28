import abilities.additional.AdditionalAbility;
import abilities.basic.BasicAbility;

public class Character {
    @AutoInjectable
    private BasicAbility basicAbility;
    @AutoInjectable
    private AdditionalAbility additionalAbility;

    public void showAbilities(){
        basicAbility.showBasicAbility();
        additionalAbility.showAdditionalAbility();
    }
}
