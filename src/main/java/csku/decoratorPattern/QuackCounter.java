package csku.decoratorPattern;

import csku.animals.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        if (!duck.getClass().getName().equals("Pigeon") &&  duck.getClass().getName().equals("Goose")){
            numberOfQuacks++;
        }
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
