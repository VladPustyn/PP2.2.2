package web.model;

public class Car {
    private int id;
    private String color;
    private String engine;
    private int HP;

    public Car(int id, String color, String engine, int HP) {
        this.color = color;
        this.engine = engine;
        this.HP = HP;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
