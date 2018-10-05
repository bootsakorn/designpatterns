package csku.decoratorPattern;

import csku.animals.Quackable;

public class QuackEcho implements Quackable {
    private final Quackable duck;

    public QuackEcho (Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        System.out.println("echo : ");
        duck.quack();
    }
}
