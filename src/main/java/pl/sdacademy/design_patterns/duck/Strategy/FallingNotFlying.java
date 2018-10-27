package pl.sdacademy.design_patterns.duck.Strategy;

public class FallingNotFlying implements Flying {
    @Override
    public void flying() {
        System.out.println("I'm falling");

    }
}
