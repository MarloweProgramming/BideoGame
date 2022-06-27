package model.objects.entities;

public abstract class Boss extends Entity {
    // boss will have extra functions for attacks?
    // should Boss be a PassiveEntity or AggressiveEntity?

    public Boss() {
        super();
    }
    public Boss(int x, int y) {
        super(x, y);
    }
}