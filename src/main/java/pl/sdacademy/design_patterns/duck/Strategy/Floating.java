package pl.sdacademy.design_patterns.duck.Strategy;

public class Floating implements Swimming {
    @Override
    public void swimm() {
        System.out.println("Im floatin'");
    }
}
