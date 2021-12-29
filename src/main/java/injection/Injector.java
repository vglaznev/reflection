package injection;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * Class that provides methods for dependency injection
 */
public class Injector {
    private Properties properties;


    /**
     * Simple constructor, load properties from resource
     * @param resourceName name of property file
     * @throws IOException if an error occurred when reading from the input stream
     */
    public Injector(String resourceName) throws IOException {
        properties = new Properties();
        properties.load(getClass().getClassLoader().getResourceAsStream(resourceName));
    }

    /**
     * @param object object where will the injection be performed
     * @param <T> class of object
     * @return object with injected fields
     * @throws ClassNotFoundException if a class name in a property file is incorrect
     * @throws NoSuchMethodException if an injection field accessible somehow is false
     * @throws InvocationTargetException if an injection field throws an exception
     * @throws InstantiationException if the injection field is abstract class
     * @throws IllegalAccessException if this Constructor object is enforcing Java language access control and the underlying constructor is inaccessible
     */
    public <T> T inject(T object) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Field[] fields = object.getClass().getDeclaredFields();
        for(Field field : fields){
            Annotation annotation = field.getAnnotation(AutoInjectable.class);
            field.setAccessible(true);
            if(annotation != null){
                String type = properties.getProperty(field.getType().getName());
                field.set(object, Class.forName(type).getDeclaredConstructor().newInstance());
            }
        }
        return object;
    }

}
