package controller;

import dao.GameDao;
import dao.implementation.GameDaoMem;
import model.Game;

import java.util.List;

public class BaseController {

    public static List<Game> initGames(){
        GameDao gameDataStore = GameDaoMem.getInstance();
        return gameDataStore.getAll();
    }
}
