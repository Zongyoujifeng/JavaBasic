package typeinfo;

import typeinfo.pets.*;

import java.util.HashMap;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null) {
                put(type, 1);
            } else {
                put(type, quantity + 1);
            }
        }
    }

    public static void countPet(PetCreator creator) {
        PetCounter counter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            printnb(pet.getClass().getSimpleName() + " ");
            if (pet instanceof Pet)
                counter.count("Pet");
            if (pet instanceof Dog)
                counter.count("Dog");

            if (pet instanceof Mutt)
                counter.count("Mutt");
            if (pet instanceof Pug)
                counter.count("Pug");
        }
        print();
        print(counter);
    }

    public static void main(String[] args) {
        countPet(new ForNameCreator());
    }
}
