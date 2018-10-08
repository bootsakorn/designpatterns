package csku.compositePattern;

import csku.animals.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        int count = 1;
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            if (count==1){
                System.out.println("I am leader :");
                quacker.quack();
                quacker.quack();
                count++;
            }
            quacker.quack();
        }
    }
}
