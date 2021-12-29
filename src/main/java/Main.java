import character.Character;
import injection.Injector;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Main {
    private static final String PATH_TO_MY_CHARACTER_CONFIG_FILE = "my.properties";
    private static final String PATH_TO_ENEMY_CHARACTER_CONFIG_FILE = "enemy.properties";

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        try {
            Character myCharacter = (new Injector(PATH_TO_MY_CHARACTER_CONFIG_FILE)).inject(new Character());
            Character enemyCharacter = (new Injector(PATH_TO_ENEMY_CHARACTER_CONFIG_FILE)).inject(new Character());

            System.out.println("Show my abilities: ");
            myCharacter.showAbilities();
            System.out.println("______________________");
            System.out.println("Show enemy abilities: ");
            enemyCharacter.showAbilities();
        } catch (IOException ioException){
            System.out.println("Can't read character configuration file, please check the file for correctness.");
        }
    }
}
