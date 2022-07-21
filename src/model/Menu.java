package model;

import model.worldObjects.World;


public class Menu {

    private World world = null;

    public Menu() {
        
    }

    public void startGame() {
        if (world == null) {

        }
        else {

        }
    }

    // public void loadGame() {

    // }
    public World getWorld() {
        return this.world;
    }

    public void setWorld(World world) {
        this.world = world;
    }
}