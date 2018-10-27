package pl.sdacademy.design_patterns.duck.Singleton;


import pl.sdacademy.design_patterns.duck.Duck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FarmerEagerSingleton {


    private List <Duck> duckList;



    private static final FarmerEagerSingleton INSTANCE =
            new FarmerEagerSingleton ();

    public static FarmerEagerSingleton getInstance() {
        return INSTANCE;
    }

    private FarmerEagerSingleton () {
        ArrayList<Duck> notSyncedList = new ArrayList<>();
        duckList = Collections.synchronizedList(notSyncedList);
    }

    public boolean addDuck (Duck duck) {
       return duckList.add(duck);
    }

    public boolean removeDuck (Duck duck) {
        return duckList.remove(duck);
    }

    public List <Duck> getDuckList () {
        return new ArrayList<>(duckList);
    }
}
