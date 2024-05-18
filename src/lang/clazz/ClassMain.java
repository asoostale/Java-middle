package lang.clazz;

import java.awt.event.HierarchyListener;
import java.lang.reflect.InvocationTargetException;

public class ClassMain {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class helloClass = Hello.class;
        Hello hello =(Hello) helloClass.getDeclaredConstructor().newInstance();
        String re = hello.hello();
        System.out.println("result = " + re);

        System.out.println(System.getProperty("java.version"));

    }}
