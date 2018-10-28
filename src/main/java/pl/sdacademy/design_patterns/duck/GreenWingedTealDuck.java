package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Strategy.*;

import java.util.Random;

public class GreenWingedTealDuck extends AliveDuck {



    public GreenWingedTealDuck() {
        super("GreenWingedTealDuck",
                new StandardQuacking(),
                new WingedFlying(),
                new StandardSwimming());
    }
}


