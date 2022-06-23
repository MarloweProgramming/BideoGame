package model.Entities;

public abstract class Entity {
    // basic class all entities will inherit from
    int x;
    int y;
    int health;

    public Entity() {
        x = 0;
        y = 0;
        health = 100;
    }
}