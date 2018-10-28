package pl.sdacademy.design_patterns.duck.Singleton;


import pl.sdacademy.design_patterns.duck.Duck;
import pl.sdacademy.design_patterns.duck.Veterinary.ContactToVet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class FarmerEagerSingleton {


    private List <Duck> duckList;

    private ContactToVet contactToVet;



    private static final FarmerEagerSingleton INSTANCE =
            new FarmerEagerSingleton ();

    public static FarmerEagerSingleton getInstance() {
        return INSTANCE;
    }

    private FarmerEagerSingleton () {
        System.out.println(new Date() + " - Farmer is initializing");
        ArrayList<Duck> notSyncedList = new ArrayList<>();
        duckList = Collections.synchronizedList(notSyncedList);
        contactToVet = new ContactToVet();
        System.out.println(new Date() + " - Farmer was initialized");
    }

    public void askVet () {
        contactToVet.callVet();
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
