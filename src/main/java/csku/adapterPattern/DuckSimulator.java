package csku.adapterPattern;

import csku.animals.*;

public class DuckSimulator {
    public static void main(String[] arg) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    public void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedheadDuck();
        Quackable rubberDuck = new RubberDuck();
        Quackable duckCall = new DuckCall();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());

        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(duckCall);
        simulate(gooseDuck);
        simulate(pigeon);
    }

    public void simulate (Quackable duck) {
        duck.quack();
    }
}
