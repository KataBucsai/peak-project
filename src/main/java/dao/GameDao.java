package dao;

import model.Category;
import model.Game;
import java.util.List;

public interface GameDao {

    void add(Game game);
    Game find(int id);
    void remove(int id);

    List<Game> getAll();
    List<Game> getBy(Category category);

}
