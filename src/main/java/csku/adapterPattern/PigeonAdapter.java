package csku.adapterPattern;

import csku.animals.Pigeon;
import csku.animals.Quackable;

public class PigeonAdapter implements Quackable {
    private Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }
    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }


}
