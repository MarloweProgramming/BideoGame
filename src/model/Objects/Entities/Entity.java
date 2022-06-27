package model.objects.entities;


import model.objects.Object;

public abstract class Entity extends Object {
    // basic class all entities will inherit from
    int health;

    public Entity() {
        super();
        health = 100;
    }
    public Entity(int x, int y) {
        super(x, y);
        health = 100;
    }
}