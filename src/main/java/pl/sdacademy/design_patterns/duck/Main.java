package pl.sdacademy.design_patterns.duck;

import pl.sdacademy.design_patterns.duck.Singleton.FarmerEagerSingleton;

public class Main {


    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();

        Duck rubberDuck = new RubberDuck();

        Duck greenWingedTealDuck = new GreenWingedTealDuck();

        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.swim();

        System.out.println();
        System.out.println();

        rubberDuck.swim();
        rubberDuck.quack();
        rubberDuck.fly();

        System.out.println();
        System.out.println();

        greenWingedTealDuck.fly();
        greenWingedTealDuck.swim();
        greenWingedTealDuck.quack();

        DuckEgg.Builder builder = new DuckEgg.Builder();
        builder.setYolkWeight(28D);
        DuckEgg egg = builder.build();
        System.out.println(egg);
        System.out.println();

        Fodder.Builder builder1 = new Fodder.Builder(500,500);

        Fodder fodder = builder1
                .Minerals(true)
                .OatGrams(22)
                .TriticaleGrams(22)
                .Vitamins(true)
                .build();

        System.out.println(fodder.toString());

        /*
        Buildera używamy, kiedy logiak tworzeznia obiektu jest skomplikowana,
        Oraz kiedy chcemy, żeby wszystkie klasy korzystały z niego w ten samo sposób.
         */

        System.out.println();

        FarmerEagerSingleton singleton1 = FarmerEagerSingleton.getInstance();

        System.out.println(singleton1.hashCode());
        singleton1.addDuck(mallardDuck);
        System.out.println(singleton1.getDuckList().size());

        FarmerEagerSingleton singleton2 = FarmerEagerSingleton.getInstance();

        System.out.println(singleton2.hashCode());
        System.out.println(singleton2.getDuckList().size());

        System.out.println();
        System.out.println();

        FarmerEagerSingleton farmer = FarmerEagerSingleton.getInstance();
        farmer.askVet();
        System.out.println("=======");
        farmer.askVet();





    }
}
