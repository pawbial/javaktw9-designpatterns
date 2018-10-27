package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Strategy.*;

import java.util.Random;

public class RubberDuck implements Duck {

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;

    public RubberDuck () {
        quackingStrategy = new SqueakNotQuacking();
        flyingStrategy = new FallingNotFlying();
        swimmingStrategy = new Floating();
    }
    @Override
    public void quack() {
        quackingStrategy.quack();
    }

    @Override
    public void swim() {
        swimmingStrategy.swimm();
    }

    @Override
    public void fly() {

        flyingStrategy.flying();
    }

    @Override
    public Integer totalEggsLaid() {
        return 0;
    }

    @Override
    public Integer duckAge() {
        return new Random().nextInt(10000) + 10;
    }
}
