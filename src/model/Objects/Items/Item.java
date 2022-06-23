package model.Items;

public abstract class Item {
    // generic class all Items will inherit from
    int x;
    int y;
    int durability;

    public Item() {
        durability = 100;
        x = 0;
        y = 0;
    }

}