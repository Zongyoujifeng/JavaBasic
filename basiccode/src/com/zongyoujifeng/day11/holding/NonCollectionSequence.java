package com.zongyoujifeng.day11.holding;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;

/**
 * @author 10451
 * @version 1.0
 * @ClassName NonCollectionSequence
 * @description 当类已经继承其他类的时候如何实现Collection
 * @date 2021/2/26 23:45
 */
public class NonCollectionSequence extends PetSequence{
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                //No implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        NonCollectionSequence nc = new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}

class PetSequence {
    protected Pet[] pets = Pets.createArray(8);
}
