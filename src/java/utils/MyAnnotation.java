package utils;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    public String url() default"";
}
