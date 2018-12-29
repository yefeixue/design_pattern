package 工厂模式_抽象.Factory;

import 工厂模式_抽象.Color.Blue;
import 工厂模式_抽象.Color.Color;
import 工厂模式_抽象.Color.Green;
import 工厂模式_抽象.Color.Red;
import 工厂模式_抽象.Shape.Shape;

public class ColorFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase("RED")){
         return new Red();
      } else if(color.equalsIgnoreCase("GREEN")){
         return new Green();
      } else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }
      return null;
   }
}