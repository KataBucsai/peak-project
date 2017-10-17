package model;

import dao.implementation.GameDaoMem;

public class Game {
    static int idGen = 0;
    private int id;

    public Game() {
        this.id = idGen;
        idGen++;
        GameDaoMem.getInstance().add(this);
    }

    public int getId() {
        return id;
    }
}
