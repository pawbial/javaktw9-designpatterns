package pl.sdacademy.design_patterns.duck.Strategy;

public class SqueakNotQuacking implements Quacking {
    @Override
    public void quack() {
        System.out.println("Squee");

    }
}
