package pl.sdacademy.design_patterns.duck.Veterinary;

import java.util.Date;

public class ContactToVet {

    private Vet vet;


    public void callVet () {
        System.out.println(new Date());
        if (vet == null) {
            vet = new Vet();
        }
        vet.anwerPhone();
    }
}
