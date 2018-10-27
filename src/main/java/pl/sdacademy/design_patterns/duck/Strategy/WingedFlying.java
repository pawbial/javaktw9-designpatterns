package pl.sdacademy.design_patterns.duck.Strategy;

public class WingedFlying implements Flying {
    @Override
    public void flying() {
            System.out.println("I'm using wings and flying");
    }
}
