package 建造者模式.Item;

import 建造者模式.Packing.Packing;
import 建造者模式.Packing.Wrapper;

public abstract class Burger implements Item {

   @Override
   public Packing packing() {
      return new Wrapper();
   }

   @Override
   public abstract float price();
}