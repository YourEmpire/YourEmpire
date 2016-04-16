package pl.yourempire.api.addon;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AddonInfo
{
    String name();
    String version();

    String desc() default "";
    String[] authors() default {};
    String website() default "";
}
