package ru.mirea.task29;

public class Dish implements Item{
    private final int price;
    private final String name;
    private final String description;

    public Dish(int price, String name, String description) throws Exception {

        this.price = price;
        if (price<0)
        {
            throw new Exception("java.lang.IllegalArgumentException ");
        }
        this.name = name;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
