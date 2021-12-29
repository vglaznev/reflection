package injection;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;


import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Annotation that marks field for injection
 */
@Target(FIELD)
@Retention(RUNTIME)
public @interface AutoInjectable {
}
