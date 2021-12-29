package abilities.basic;

/**
 * One of the basic abilities. Allows the character casts spells and brew potions.
 * @see BasicAbility
 */
public class MagicAbility implements BasicAbility{
    @Override
    public void showBasicAbility() {
        System.out.println("I can cast spells! (Basic ability: Magic ability)");
    }
}
