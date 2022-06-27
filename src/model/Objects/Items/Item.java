package model.objects.items;

import model.objects.Object;

public abstract class Item extends Object {
    // generic class all Items will inherit from
    int durability;

    public Item() {
        super();
        durability = 100;
    }
    public Item(int x, int y) {
        super(x, y);
        durability = 100;
    }

}