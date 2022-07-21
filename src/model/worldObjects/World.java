package model.worldObjects;

import java.util.ArrayList;

public class World {

    // int or String seed code attribute?
    private ArrayList<ArrayList<Chunk>> chunks = new ArrayList<ArrayList<Chunk>>();

    // world is instantiated as a 2d array that is 100x100 of instances of Chunk class
    public World() {
        for (int i = 0; i < 100; ++i) {
            ArrayList<Chunk> listChunks = new ArrayList<Chunk>();
            for (int j = 0; j < 100; ++j) {
                listChunks.add(new Chunk());
            }
            chunks.add(listChunks);
        }
    }
}