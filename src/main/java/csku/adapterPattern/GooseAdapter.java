package csku.adapterPattern;

import csku.animals.Goose;
import csku.animals.Quackable;

public class GooseAdapter implements Quackable {
    private Goose goose;
    public GooseAdapter (Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
