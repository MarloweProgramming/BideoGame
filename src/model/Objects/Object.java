package model.objects;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public abstract class Object {
    private IntegerProperty x = new SimpleIntegerProperty();
    private IntegerProperty y = new SimpleIntegerProperty();

    public Object() {
        x.set(0);
        y.set(0);
    }
    
    public Object(int x, int y) {
        this.x.set(x);
        this.y.set(y);
    }



    public IntegerProperty xProperty() {
        return this.x;
    }
    public int getX() {
        return this.x.get();
    }
    public void setX(int x) {
        this.x.set(x);
    }

    public int getY() {
        return this.y.get();
    }
    public void setY(int y) {
        this.y.set(y);
    }
    public IntegerProperty yProperty() {
        return this.y;
    }
}