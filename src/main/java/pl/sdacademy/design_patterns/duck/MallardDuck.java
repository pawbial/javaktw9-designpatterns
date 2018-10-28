package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Duck;
import pl.sdacademy.design_patterns.duck.Strategy.*;

import java.util.Random;

public class MallardDuck extends AliveDuck {



    public MallardDuck() {
        super("MallardDuck",
                new StandardQuacking(),
                new WingedFlying(),
                new StandardSwimming());
    }


}
