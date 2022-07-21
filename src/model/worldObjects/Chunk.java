package model.worldObjects;

import model.objects.items.Item;
import model.objects.entities.Entity;


import java.util.ArrayList;

public class Chunk {
    final static private int size = 20;
    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Entity> entities = new ArrayList<Entity>();

    public Chunk() {

    }
}