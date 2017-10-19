package model;

public class Game extends BaseModel {
    private Category category;

    public Game(String name, String description, Category category) {
        super(name, description);
        this.setCategory(category);
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
        this.category.addGame(this);
    }

}
