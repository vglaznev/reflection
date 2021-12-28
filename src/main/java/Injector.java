import java.io.FileInputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Injector {
    private Properties properties;

    public Injector(String propertiesPath) throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(propertiesPath));
    }

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
