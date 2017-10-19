package dao;

import model.Category;
import model.Game;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    Category find(int id);
    void remove(int id);

    List<Category> getAll();

}
