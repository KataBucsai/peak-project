package model;

import java.util.ArrayList;

import static controller.BaseController.initGamesByCategory;

public class Category extends BaseModel {
    private ArrayList<Game> games;

    public Category(String name, String description) {
        super(name, description);
        this.games = new ArrayList<>();
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public ArrayList getGames() {
        return (ArrayList) initGamesByCategory(this);
    }

    public void addGame(Game game) {
        this.games.add(game);
    }
}
