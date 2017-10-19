package dao.implementation;

import dao.CategoryDao;
import model.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryDaoMem implements CategoryDao{
    private List<Category> categories = new ArrayList<>();
    private static CategoryDaoMem instance = null;

    private CategoryDaoMem() {
    }

    public static CategoryDaoMem getInstance() {
        if (instance == null) {
            instance = new CategoryDaoMem();
        }
        return instance;
    }

    @Override
    public void add(Category category){
        categories.add(category);
    }

    @Override
    public Category find(int id){
        return categories.stream().filter(t -> t.getId() == id).findFirst().orElse(null);
    }

    @Override
    public void remove(int id){
        categories.remove(find(id));
    }

    @Override
    public List<Category> getAll(){
        return categories;
    }
}
