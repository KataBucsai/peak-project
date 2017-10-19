package controller;

import dao.CategoryDao;
import dao.GameDao;
import dao.implementation.CategoryDaoMem;
import dao.implementation.GameDaoMem;
import model.Category;
import model.Game;

import java.util.List;

public class BaseController {

    public static List<Game> initGames(){
        GameDao gameDataStore = GameDaoMem.getInstance();
        return gameDataStore.getAll();
    }

    public static List<Category> initCategories(){
        CategoryDao categoryDataStore = CategoryDaoMem.getInstance();
        return categoryDataStore.getAll();
    }

    public static List<Game> initGamesByCategory(Category category){
        GameDao gameDataStore = GameDaoMem.getInstance();
        return gameDataStore.getBy(category);
    }
}
