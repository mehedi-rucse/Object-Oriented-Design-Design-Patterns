public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal1 = mealBuilder.prepareVegMeal();
        float cost1 = meal1.getCost();
        meal1.showItems();
        System.out.println("Total Price :"+cost1);
        Meal meal2 = mealBuilder.prepareNoVegMeal();
        float cost2 = meal2.getCost();
        meal2.showItems();
        System.out.println("Total Price :"+cost2);
    }
}