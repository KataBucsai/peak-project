package dao.implementation;

import dao.GameDao;
import model.Game;

import java.util.ArrayList;
import java.util.List;

public class GameDaoMem implements GameDao{
    private List<Game> games = new ArrayList<>();
    private static GameDaoMem instance = null;

    private GameDaoMem() {
    }

    public static GameDaoMem getInstance() {
        if (instance == null) {
            instance = new GameDaoMem();
        }
        return instance;
    }

    @Override
    public void add(Game game){
        games.add(game);
    }

    @Override
    public Game find(int id){
        return games.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void remove(int id){
        games.remove(find(id));
    }

    @Override
    public List<Game> getAll(){
        return games;
    }

}
