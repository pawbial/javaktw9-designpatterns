package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Duck;
import pl.sdacademy.design_patterns.duck.Strategy.*;

import java.util.Random;

public class MallardDuck implements Duck {

    private Quacking quackingStrategy;
    private Flying flyingStrategy;
    private Swimming swimmingStrategy;
    private DuckCoop coop;
    private Integer totalEggs;

    public MallardDuck() {
        quackingStrategy = new StandardQuacking();
        flyingStrategy = new WingedFlying();
        swimmingStrategy = new StandardSwimming();
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
        return totalEggs;
    }

    @Override
    public Integer duckAge() {
        return new Random().nextInt(1000) + 10;
    }

    @Override
    public DuckEgg layEgg() {
        DuckEgg.Builder eggBuilder = new DuckEgg.Builder();
        eggBuilder.setYolkWeight(27D);
        DuckEgg egg = eggBuilder.build();
        coop.notifyAboutEgg(egg);
        totalEggs++;
        return egg;
    }

    @Override
    public void walkToDuckCoop(DuckCoop coop) {
        coop.register(this);
        this.coop = coop;

    }

    @Override
    public void notifyAboutEgg(DuckEgg egg) {
        String duckType = getClass().getSimpleName();
        System.out.println(duckType + " Great egg!");

    }
}
