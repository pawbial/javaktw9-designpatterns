package pl.sdacademy.design_patterns.duck;

import java.util.ArrayList;
import java.util.List;

public class DuckCoop {

    private List <Duck> coopRegistry;

    public DuckCoop () {
        coopRegistry = new ArrayList<>();
    }

    public void register (Duck duck) {
        coopRegistry.add(duck);
    }

    public void unregister (Duck duck) {
        coopRegistry.remove(duck);
    }

    public void notifyAboutEgg (DuckEgg egg) {
        for (Duck duck : coopRegistry) {
            duck.notifyAboutEgg(egg);
        }
    }
}
