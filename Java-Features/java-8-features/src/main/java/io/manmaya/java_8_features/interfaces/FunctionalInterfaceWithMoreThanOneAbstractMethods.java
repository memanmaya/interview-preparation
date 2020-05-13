package io.manmaya.java_8_features.interfaces;

@FunctionalInterface
public interface FunctionalInterfaceWithMoreThanOneAbstractMethods {

	public void show();

	public void show1();
}
// Compile-time error message : Invalid '@FunctionalInterface' annotation;
// FunctionalInterfaceWithMoreThanOneAbstractMethods is not a functional
// interface
