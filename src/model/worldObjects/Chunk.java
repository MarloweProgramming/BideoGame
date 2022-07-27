package model.worldObjects;

import model.objects.items.Item;
import model.objects.entities.Entity;
import model.enums.ChunkType;


import java.util.ArrayList;

public class Chunk {
    final static private int size = 20; // size to be determined later. may be irrelevent
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Entity> entities = new ArrayList<Entity>();
    private ChunkType type;

    public Chunk() {
        this.type = ChunkType.VOID;
    }

    public Chunk(ChunkType type) {
        this.type = type;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
    public void addEntity(Entity entity) {
        this.entities.add(entity);
    }

    public ArrayList<Item> getItems()  {
        return this.items;
    }
    public ArrayList<Entity> getEntities() {
        return this.entities;
    }
}