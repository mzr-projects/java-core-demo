package com.mt.advanced.reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MagicClassInstantiation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException {

        System.out.println("Invoked by arguments : " + Arrays.toString(args));

        if (args.length < 2) {
            System.err.println("Must have at least 3 arguments.");
            return;
        }

        String className = args[0];
        Class<?>[] parameterTypes = new Class<?>[args.length - 2];
        Arrays.fill(parameterTypes, String.class);

        Object[] parameters = Arrays.copyOfRange(args, 1, args.length - 1, Object[].class);
        String methodName = args[args.length - 1];

        Class<?> clazz = Class.forName(className, true, MagicClassInstantiation.class.getClassLoader());
        Constructor<?> constructor = clazz.getDeclaredConstructor(parameterTypes);
        constructor.setAccessible(true);

        Object object = constructor.newInstance(parameters);

        Method method = clazz.getMethod(methodName);

        Object result = method.invoke(object);

        if (method.getReturnType() != void.class) {
            System.out.println("Result is : " + result);
        }
    }
}
