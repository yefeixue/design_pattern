package 建造者模式.Meal;

import 建造者模式.Item.ChickenBurger;
import 建造者模式.Item.Coke;
import 建造者模式.Item.Pepsi;
import 建造者模式.Item.VegBurger;

public class MealBuilder {

   public Meal prepareVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Coke());
      return meal;
   }   

   public Meal prepareNonVegMeal (){
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
}