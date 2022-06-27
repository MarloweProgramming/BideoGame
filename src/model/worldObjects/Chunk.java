package model.worldObjects;

import model.objects.items.Item;
import model.objects.entities.Entity;


import java.util.ArrayList;

public class Chunk {
    int size = 20;
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Entity> entities = new ArrayList<>();

    public Chunk() {

    }
}