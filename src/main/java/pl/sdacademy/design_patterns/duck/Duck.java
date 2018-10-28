package pl.sdacademy.design_patterns.duck;

public interface Duck {

    void quack ();

    void swim ();

    void  fly ();

    Integer totalEggsLaid ();

    Integer duckAge ();

    DuckEgg layEgg ();

    void walkToDuckCoop (DuckCoop coop);

    void notifyAboutEgg(DuckEgg egg);




    }



