package pl.sdacademy.design_patterns.duck.Strategy;

public class StandardSwimming implements Swimming {
    @Override
    public void swimm() {
        System.out.println("I'm using fins and swimming");
    }
}
