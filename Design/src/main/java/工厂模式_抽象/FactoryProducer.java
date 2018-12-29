package 工厂模式_抽象;

import 工厂模式_抽象.Factory.AbstractFactory;
import 工厂模式_抽象.Factory.ColorFactory;
import 工厂模式_抽象.Factory.ShapeFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){
      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }
      return null;
   }
}