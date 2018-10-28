package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Strategy.*;

import java.util.Random;

public class RubberDuck implements Duck {

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;
    private Integer totalEggs;
    private DuckCoop coop;

    public RubberDuck () {
        quackingStrategy = new SqueakNotQuacking();
        flyingStrategy = new FallingNotFlying();
        swimmingStrategy = new Floating();
        totalEggs = 0;
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

    @Override
    public DuckEgg layEgg() {
        System.out.println("No way! No rubber eggs!");
        return null;
    }

    @Override
    public void walkToDuckCoop(DuckCoop coop) {
        System.out.println("Very funny!");

    }

    @Override
    public void notifyAboutEgg(DuckEgg egg) {
        System.out.println("Ikkk .... Ikkkk ... Ikkkk");

    }
}
