package com.sda.advanced.solution.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> carClass = Class.forName("com.sda.advanced.solution.reflection.Car");
		Method[] methods = carClass.getDeclaredMethods();
		Field[] fields = carClass.getDeclaredFields();
		System.out.println("Available methods: ");
		for (Method method : methods) {
			System.out.println(method);
		}

		System.out.println("Available fields: ");
		for (Field field : fields) {
			//field.setAccessible(true);
			System.out.println(field);
		}
	}

}
