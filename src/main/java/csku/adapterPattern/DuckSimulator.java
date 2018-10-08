package csku.adapterPattern;

import csku.abstractFactoryPattern.AbstractDuckFactory;
import csku.abstractFactoryPattern.CountingEchoDuckFactory;
import csku.animals.*;
import csku.compositePattern.Flock;
import csku.decoratorPattern.QuackCounter;

public class DuckSimulator {
    public static void main(String[] arg) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingEchoDuckFactory();
        simulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator: With Composite - Flocks");
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);
        System.out.println("\nGoose Simulator");
        simulate(gooseDuck);
        System.out.println("\nPigone Simulator");
        simulate(pigeon);
        System.out.println("\nThe ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }

    public void simulate (Quackable duck) {
        duck.quack();
    }
}
