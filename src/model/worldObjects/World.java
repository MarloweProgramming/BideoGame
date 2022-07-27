package model.worldObjects;

import java.util.ArrayList;

import model.objects.entities.*;
import model.objects.entities.passiveEntities.*;
import model.objects.entities.friendlyEntities.*;
import model.objects.entities.aggressiveEntities.*;
import model.enums.ChunkType;


public class World {

    // int or String seed code attribute?
    private ArrayList<ArrayList<Chunk>> chunks = new ArrayList<ArrayList<Chunk>>();
    private ArrayList<Entity> entities = new ArrayList<Entity>();
    private Player player;

    // world is instantiated as a 2d array that is 100x100 of instances of Chunk class
    public World() {
        for (int i = 0; i < 100; ++i) {
            ArrayList<Chunk> listChunks = new ArrayList<Chunk>();
            for (int j = 0; j < 100; ++j) {
                listChunks.add(new Chunk());
            }
            this.chunks.add(listChunks);
        }
        this.player = new Player(0, 0);
    }

    public World(ChunkType type) {
        for (int i = 0; i < 3; ++i) {
            ArrayList<Chunk> listChunks = new ArrayList<Chunk>();
            for (int j = 0; j < 3; ++j) {
                listChunks.add(new Chunk(ChunkType.GRASSLANDS));
            }
            this.chunks.add(listChunks);
        }
        this.player = new Player(0, 0);
    }

    public ArrayList<ArrayList<Chunk>> getChunks() {
        return this.chunks;
    }

    public Chunk getChunk(int row, int col) {
        return this.chunks.get(row).get(col);
    }

    public ArrayList<Entity> getEntities() {
        return this.entities;
    }
    
    public Player getPlayer() {
        return this.player;
    }
}