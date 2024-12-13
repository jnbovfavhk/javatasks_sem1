package org.knit.jnbovfavhk.lab9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            //разрешает доступ к private переменным
            field.setAccessible(true);
            Object value = field.get(obj);

            // Проверка @NotNull
            if (field.isAnnotationPresent(NotNull.class) && value == null) {
                System.out.println("Поле " + field.getName() + " не должно быть null.");
            }

            // Проверка @MaxLength
            if (field.isAnnotationPresent(MaxLength.class)) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (value.toString().length() > maxLength) {
                    System.out.println("Длина поля " + field.getName() + " не должна превышать " + maxLength);
                }
            }

            // Проверка @Min
            if (field.isAnnotationPresent(Min.class)) {
                int minValue = field.getAnnotation(Min.class).value();
                if ((int)value < minValue) {
                    System.out.println("Длина поля " + field.getName() + " не должна превышать " + minValue);
                }
            }
        }
    }
}