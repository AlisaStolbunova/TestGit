package work.home.lesson20_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TransactionAnalyzer {
    public static void transactionAnalyzer(Class clazz) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (true) {
                for (Annotation annotation : method.getDeclaredAnnotations()) {
                    if (annotation instanceof Transaction) {
                        method.setAccessible(true);
                        System.out.println("Transaction is started");
                        try {
                            method.invoke(new Object());
                        } catch (InvocationTargetException | IllegalAccessException ex) {
                            ex.printStackTrace();
                        }
                        System.out.println("Transaction is ended");
                    }
                }
            }
        }
    }
}
