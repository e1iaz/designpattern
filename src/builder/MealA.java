package builder;

public class MealA extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setDrink("可乐");
    }

    @Override
    public void buildDrink() {
        meal.setFood("薯条");
    }
}
