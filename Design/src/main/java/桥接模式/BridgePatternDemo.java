package 桥接模式;

import 桥接模式.DrawAPI.GreenCircle;
import 桥接模式.DrawAPI.RedCircle;
import 桥接模式.Shape.Circle;
import 桥接模式.Shape.Shape;

public class BridgePatternDemo {
   public static void main(String[] args) {
      Shape redCircle = new Circle(100,100, 10, new RedCircle());
      Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

      redCircle.draw();
      greenCircle.draw();
   }
}