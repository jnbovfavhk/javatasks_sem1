package org.knit.jnbovfavhk;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.RUNTIME)
public @interface TaskDescription {
    int number();
    String description() default "No description";
    String href() default "No reference provided";// link to source (file, site, ..etc)
}
