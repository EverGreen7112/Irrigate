package frc.robot;

/**
 * A functional itnerface - that is - an interface consisting of a single
 * function, which tests a value and returns a boolean accordingly.
 * 
 * The fact that this is a functional interfaace allowes us to essintially passs
 * a function as a parameter. If one of our parameters is a predicate, it will
 * have neccisarilly implemented its {@link #test(Object)} method, and we can
 * use it to check things, for example if we want to filter an array (See
 * {@link Example#filter(Object[], Predicate)}).
 * 
 * It being a functional interface also allowes it to be initilized with a lambda expressin, 
 * as can be seen {@link Example#main(String[])} and {@link Robot#robotInit()}.
 */
@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T value);
}