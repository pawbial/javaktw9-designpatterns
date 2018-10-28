package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Strategy.StandardQuacking;
import pl.sdacademy.design_patterns.duck.Strategy.StandardSwimming;
import pl.sdacademy.design_patterns.duck.Strategy.WingedFlying;

public class DuckFactory {

    public Duck createDuck (DuckType type) {
        switch (type) {
            case MALLARDDUCK:
                return new AliveDuck("MallardDuck",
                        new StandardQuacking(),
                        new WingedFlying(),
                        new StandardSwimming());

            case GREENWINGEDTEALDUCK:
                return new AliveDuck("GreenWingedTealDuck",
                        new StandardQuacking(),
                        new WingedFlying(),
                        new StandardSwimming());

            case RUBBERDUCK:
                return new RubberDuck();

            default:
                throw new IllegalArgumentException("Unknown duck type" + type);
        }
     
    }
}
