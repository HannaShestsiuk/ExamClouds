package lesson24_serialization;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class III_SerializeHorseMetaData {
    public static void main(String[] args) {
        Class<?> serializeHorseClass = I_SerializeHorse.class;

        System.out.println("Class Name: " + serializeHorseClass.getName());
        System.out.println("Package Name: " + serializeHorseClass.getPackageName());
        System.out.println("Modifiers: " + Modifier.toString(serializeHorseClass.getModifiers()));

        System.out.println("Fields:");
        for (Field f : serializeHorseClass.getDeclaredFields()) {
            System.out.println(" - " + Modifier.toString(f.getModifiers()) + " "
                    + f.getType().getSimpleName() + " " + f.getName());
        }

        System.out.println("Methods:");
        for (Method m : serializeHorseClass.getDeclaredMethods()) {
            System.out.println(" - " + Modifier.toString(m.getModifiers()) + " "
                    + m.getReturnType().getSimpleName() + " "
                    + m.getName());
        }

        System.out.println("Constructors:");
        for (Constructor<?> c : serializeHorseClass.getDeclaredConstructors()) {
            System.out.println(" - " + c);
        }
    }
}
