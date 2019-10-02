package work.home.lesson20_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.stream.Collectors;


public class ClassAnalyzer {

    public static void analize(Class clazz) {
        System.out.println("Имя класса: " + clazz.getSimpleName());
        analyzeFields(clazz);
        analyzeConstructors(clazz);
        analyzeMethods(clazz);
        analyzeClassAnnotations(clazz);
    }

    public static void analyze(Object o) {
        analyzeFields(o.getClass());
        analyzeConstructors(o.getClass());
        analyzeConstructors(o.getClass());
        analyzeConstructors(o.getClass());
    }

    private static void analyzeFields(Class clazz) {
        Field[] fields = clazz.getDeclaredFields();
        if (fields.length > 0) {
            System.out.println("Fields: ");
            for (Field field : fields) {
                System.out.println(field.getType() + " " + field.getName());
            }
        }
        System.out.println();
    }

    private static void analyzeConstructors(Class clazz) {
        Constructor[] constructors = clazz.getDeclaredConstructors();
        if (constructors.length > 0) {
            System.out.println("Constructors: ");
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }
            System.out.println();
        }

    }

    private static void analyzeMethods(Class clazz) {
        StringBuilder text = new StringBuilder(500);
        Method[] methods = clazz.getDeclaredMethods();
        if (methods.length > 0) {
            System.out.println("Methods: ");
            for (Method method : methods) {
                text.append("Method: ").append(method.getName()).append("\n")
                        .append("\t").append("Return type: ").append(method.getReturnType().getSimpleName()).append("\n")
                        .append("\t").append("Parameters name: ").append(Arrays.stream(method.getParameters())
                        .map(Parameter::getName).collect(Collectors.joining(", "))).append("\n");
            }
        }
        System.out.println(text);

    }

    private static void analyzeClassAnnotations(Class clazz) {
        if (clazz != null) {
            for (Annotation annotation : clazz.getDeclaredAnnotations()) {
                analize(annotation.getClass());
            }
        }
        System.out.println();
    }
}
