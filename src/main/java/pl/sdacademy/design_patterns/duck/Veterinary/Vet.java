package pl.sdacademy.design_patterns.duck.Veterinary;

import java.util.Date;

public class Vet {


    public Vet () {
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void anwerPhone () {
        System.out.println(new Date() + " Oh hai");
    }
}
