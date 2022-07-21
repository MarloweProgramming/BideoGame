package model.objects.entities;


import model.objects.Object;

public abstract class Entity extends Object {
    // basic class all entities will inherit from
    private int currentHealth;
    private int maxHealth;

    private int speed;

    //  0-359 degrees
    private int direction;

    public Entity() {
        super();
        maxHealth = 100;
        currentHealth = maxHealth;
    }
    public Entity(int x, int y) {
        super(x, y);
        maxHealth = 100;
        currentHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }
    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }
    public int getMaxHealth() {
        return this.maxHealth;
    }
    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }
    public void addHealth(int amount) {
        if (this.currentHealth + amount >= this.maxHealth) {
            this.currentHealth = maxHealth;
        }
        else {
            this.currentHealth += amount;
        }
    }
    public void subtractHealth(int amount) {
        if (this.currentHealth - amount <= 0) {
            die();
        }
        else {
            this.currentHealth -= amount;
        }
    }

    public void die() {

    }

    public int getSpeed() {
        return this.speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void addSpeed(int amount) {
        speed += amount;
    }
    public void subtractSpeed(int amount) {
        if (speed - amount < 0) {
            speed = 0;
        }
        else {
            speed -= amount;
        }
    }
    public int getDirection() {
        return this.direction;
    }
    public void setDirection(int direction) {
        this.direction = direction;
    }



    public void moveUp() {
        if (direction == 0) {
            // move diagonally up and to the right
        }
        else if (direction == 90) {
            // just move up
        }
        else if (direction == 180) {
            // move diagonally up and to the left
        }
        else if (direction == 270) {
            // up and down, vertical movement is cancelled
        }
    }
    public void moveLeft() {
        if (direction == 0) {
            // move diagonally up and to the right
        }
        else if (direction == 90) {
            // just move up
        }
        else if (direction == 180) {
            // move diagonally up and to the left
        }
        else if (direction == 270) {
            // up and down, vertical movement is cancelled
        }
    }
    public void moveDown() {
        if (direction == 0) {
            // move diagonally up and to the right
        }
        else if (direction == 90) {
            // just move up
        }
        else if (direction == 180) {
            // move diagonally up and to the left
        }
        else if (direction == 270) {
            // up and down, vertical movement is cancelled
        }
    }
    public void moveRight() {
        if (direction == 0) {
            // move diagonally up and to the right
        }
        else if (direction == 90) {
            // just move up
        }
        else if (direction == 180) {
            // move diagonally up and to the left
        }
        else if (direction == 270) {
            // up and down, vertical movement is cancelled
        }
    }

    public void stopUp() {
        if (direction == 0) {
            // move diagonally up and to the right
        }
        else if (direction == 90) {
            // just move up
        }
        else if (direction == 180) {
            // move diagonally up and to the left
        }
        else if (direction == 270) {
            // up and down, vertical movement is cancelled
        }
    }
    public void stopLeft() {
        if (direction == 0) {
            // move diagonally up and to the right
        }
        else if (direction == 90) {
            // just move up
        }
        else if (direction == 180) {
            // move diagonally up and to the left
        }
        else if (direction == 270) {
            // up and down, vertical movement is cancelled
        }
    }
    public void stopDown() {
        if (direction == 0) {
            // move diagonally up and to the right
        }
        else if (direction == 90) {
            // just move up
        }
        else if (direction == 180) {
            // move diagonally up and to the left
        }
        else if (direction == 270) {
            // up and down, vertical movement is cancelled
        }
    }
    public void stopRight() {
        if (direction == 0) {
            // move diagonally up and to the right
        }
        else if (direction == 90) {
            // just move up
        }
        else if (direction == 180) {
            // move diagonally up and to the left
        }
        else if (direction == 270) {
            // up and down, vertical movement is cancelled
        }
    }
    
}