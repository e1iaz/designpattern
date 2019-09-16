package builder;

public class MealB extends MealBuilder {

    @Override
    public void buildFood() {
        meal.setDrink("柠檬汁");
    }

    @Override
    public void buildDrink() {
        meal.setFood("鸡翅");
    }
}
