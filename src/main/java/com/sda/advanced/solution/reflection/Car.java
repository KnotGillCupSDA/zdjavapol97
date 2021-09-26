package com.sda.advanced.solution.reflection;

public class Car {
	private boolean isPrototype = true;
	private String name;
	private String model;

	public Car() {
	}

	public Car(String name, String model) {
		this.name = name;
		this.model = model;
	}

	public Car(String name, String model, boolean isPrototype) {
		this.name = name;
		this.model = model;
		this.isPrototype = isPrototype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	private boolean isPrototype() {
		return isPrototype;
	}

	@Override
	public String toString() {
		return "Car{" +
				"isPrototype=" + isPrototype +
				", name='" + name + '\'' +
				", model='" + model + '\'' +
				'}';
	}
}
