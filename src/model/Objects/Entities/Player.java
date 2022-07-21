package model.objects.entities;


public class Player extends Entity {

    private boolean moveUp, moveLeft, moveRight, moveDown = false;

    public Player() {
        super();
    }

    public Player(int x, int y) {
        super(x, y);
    }

    public void move() {
        if (moveUp && !moveDown && !moveLeft && !moveRight) {
            yProperty().set(getY() - 5);
        }
        else if (moveUp && !moveDown && !moveLeft && moveRight) {
            xProperty().set(getX() + 5);
            yProperty().set(getY() - 5);
        }
        else if (!moveUp && !moveDown && !moveLeft && moveRight) {
            xProperty().set(getX() + 5);
        }
        else if (!moveUp && moveDown && !moveLeft && moveRight) {
            xProperty().set(getX() + 5);
            yProperty().set(getY() + 5);
        }
        else if (!moveUp && moveDown && !moveLeft && !moveRight) {
            yProperty().set(getY() + 5);
        }
        else if (!moveUp && moveDown && moveLeft && !moveRight) {
            xProperty().set(getX() - 5);
            yProperty().set(getY() + 5);
        }
        else if (!moveUp && !moveDown && moveLeft && !moveRight) {
            xProperty().set(getX() - 5);
        }
        else if (moveUp && !moveDown && moveLeft && !moveRight) {
            xProperty().set(getX() - 5);
            yProperty().set(getY() - 5);
        }
        else {
            // do nothing
        }
    }

    public boolean getMoveUp() {
        return this.moveUp;
    }
    public boolean getMoveDown() {
        return this.moveDown;
    }
    public boolean getMoveRight() {
        return this.moveRight;
    }
    public boolean getMoveLeft() {
        return this.moveLeft;
    }

    public void setMoveUp(boolean moveUp) {
        this.moveUp = moveUp;
    }
    public void setMoveDown(boolean moveDown) {
        this.moveDown = moveDown;
    }
    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }
    public void setMoveLeft(boolean moveLeft) {
        this.moveLeft = moveLeft;
    }
    
}