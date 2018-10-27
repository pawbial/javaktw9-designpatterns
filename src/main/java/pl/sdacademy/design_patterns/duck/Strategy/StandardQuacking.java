package pl.sdacademy.design_patterns.duck.Strategy;

public class StandardQuacking implements Quacking {
    @Override
    public void quack() {
        System.out.println("Quack");

    }
}
