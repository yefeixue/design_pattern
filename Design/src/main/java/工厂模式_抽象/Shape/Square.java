package 工厂模式_抽象.Shape;

import 工厂模式_抽象.Shape.Shape;

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}