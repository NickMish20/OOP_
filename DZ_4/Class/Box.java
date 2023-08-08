package DZ_4.Class;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<T>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.0001;
    }

    public void transferTo(Box<? super T> box) {
        if (box == this) {
            return;
        }
        for (T fruit : fruits) {
            box.add(fruit);
        }
        fruits.clear();
    }
}