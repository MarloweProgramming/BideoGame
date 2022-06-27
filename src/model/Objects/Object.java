package model.objects;


public abstract class Object {
    int x;
    int y;

    public Object() {
        x = 0;
        y = 0;
    }
    
    public Object(int x, int y) {
        this.x = x;
        this.y = y;
    }
}