package abilities.basic;

/**
 * One of the basic abilities. Allows the character to hunt and get food.
 * @see BasicAbility
 */
public class HuntingAbility implements BasicAbility{
    @Override
    public void showBasicAbility() {
        System.out.println("Look, I can get some food! (Basic ability: Hunting ability)");
    }
}
