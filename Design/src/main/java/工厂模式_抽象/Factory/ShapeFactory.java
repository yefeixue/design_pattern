package 工厂模式_抽象.Factory;

import 工厂模式_抽象.Color.Color;
import 工厂模式_抽象.Shape.Circle;
import 工厂模式_抽象.Shape.Rectangle;
import 工厂模式_抽象.Shape.Shape;
import 工厂模式_抽象.Shape.Square;

public class ShapeFactory extends AbstractFactory {
    
   @Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}